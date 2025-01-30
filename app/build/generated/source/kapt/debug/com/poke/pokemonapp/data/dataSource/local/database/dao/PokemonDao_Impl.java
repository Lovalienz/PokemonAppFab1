package com.poke.pokemonapp.data.dataSource.local.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PokemonDao_Impl implements PokemonDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PokemonEntity> __insertionAdapterOfPokemonEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PokemonDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemonEntity = new EntityInsertionAdapter<PokemonEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `pokemons` (`id`,`pok_name`,`pok_front`,`pok_back`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PokemonEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getFrontImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFrontImage());
        }
        if (entity.getBackImage() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getBackImage());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM pokemons  WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM pokemons";
        return _query;
      }
    };
  }

  @Override
  public long insert(final PokemonEntity pokemon) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfPokemonEntity.insertAndReturnId(pokemon);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<PokemonEntity> pokemons) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPokemonEntity.insert(pokemons);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object delete(final String id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<PokemonEntity> getAll() {
    final String _sql = "SELECT * FROM pokemons ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_name");
      final int _cursorIndexOfFrontImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_front");
      final int _cursorIndexOfBackImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_back");
      final List<PokemonEntity> _result = new ArrayList<PokemonEntity>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final PokemonEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpFrontImage;
        if (_cursor.isNull(_cursorIndexOfFrontImage)) {
          _tmpFrontImage = null;
        } else {
          _tmpFrontImage = _cursor.getString(_cursorIndexOfFrontImage);
        }
        final String _tmpBackImage;
        if (_cursor.isNull(_cursorIndexOfBackImage)) {
          _tmpBackImage = null;
        } else {
          _tmpBackImage = _cursor.getString(_cursorIndexOfBackImage);
        }
        _item = new PokemonEntity(_tmpId,_tmpName,_tmpFrontImage,_tmpBackImage);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getById(final long id, final Continuation<? super PokemonEntity> $completion) {
    final String _sql = "SELECT * FROM pokemons WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PokemonEntity>() {
      @Override
      @NonNull
      public PokemonEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_name");
          final int _cursorIndexOfFrontImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_front");
          final int _cursorIndexOfBackImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pok_back");
          final PokemonEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFrontImage;
            if (_cursor.isNull(_cursorIndexOfFrontImage)) {
              _tmpFrontImage = null;
            } else {
              _tmpFrontImage = _cursor.getString(_cursorIndexOfFrontImage);
            }
            final String _tmpBackImage;
            if (_cursor.isNull(_cursorIndexOfBackImage)) {
              _tmpBackImage = null;
            } else {
              _tmpBackImage = _cursor.getString(_cursorIndexOfBackImage);
            }
            _result = new PokemonEntity(_tmpId,_tmpName,_tmpFrontImage,_tmpBackImage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
