package com.poke.pokemonapp.data.dataSource.remote.service

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO

import kotlinx.coroutines.tasks.await

class FireStoreService{

    private val db = FirebaseFirestore.getInstance()
    private val favoritesCollection = db.collection("favorites")

     suspend fun addFavoriteToFirestore(favorite: FavoriteDTO): Resource<String> {
        return try {
            val favoriteMap = hashMapOf(
                "id" to favorite.id,
                "name" to favorite.name,
                "frontImageUrl" to favorite.frontImageUrl,
                "backImageUrl" to favorite.backImageUrl
            )

            favoritesCollection.document(favorite.id).set(favoriteMap).await()
            Resource.Success("Favorito agregado correctamente")
        } catch (e: Exception) {
            Resource.Failure(e.localizedMessage ?: "Error al agregar favorito")
        }
    }

     suspend fun getFavoritesFromFirestore(): Resource<List<FavoriteDTO>> {
        return try {
            val result = favoritesCollection.get().await()
            val favorites = result.documents.mapNotNull { it.toObject(FavoriteDTO::class.java) }
            Resource.Success(favorites)
        } catch (e: Exception) {
            Log.i("Favoritesxdxd", e.localizedMessage)
            Resource.Failure(e.localizedMessage ?: "Error al obtener favoritos")
        }
    }

     suspend fun deleteFavoriteFromFirestore(favoriteId: String): Resource<String> {
        return try {
            favoritesCollection.document(favoriteId).delete().await()
            Resource.Success("Favorito eliminado correctamente")
        } catch (e: Exception) {
            Resource.Failure(e.localizedMessage ?: "Error al eliminar favorito")
        }
    }
}
