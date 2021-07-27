package com.dubizzle.data.datasource.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dubizzle.data.datasource.local.entity.Branch;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BranchDao_Impl implements BranchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Branch> __insertionAdapterOfBranch;

  private final EntityDeletionOrUpdateAdapter<Branch> __updateAdapterOfBranch;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public BranchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBranch = new EntityInsertionAdapter<Branch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `branches` (`id`,`branchName`,`branchAddress`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Branch value) {
        stmt.bindLong(1, value.getId());
        if (value.getBranchName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBranchName());
        }
        if (value.getBranchAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBranchAddress());
        }
      }
    };
    this.__updateAdapterOfBranch = new EntityDeletionOrUpdateAdapter<Branch>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `branches` SET `id` = ?,`branchName` = ?,`branchAddress` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Branch value) {
        stmt.bindLong(1, value.getId());
        if (value.getBranchName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBranchName());
        }
        if (value.getBranchAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBranchAddress());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM branches";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Branch obj, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfBranch.insertAndReturnId(obj);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Branch obj, final Continuation<? super Void> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfBranch.handle(obj);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Continuation<? super Integer> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getBranches(final Continuation<? super List<Branch>> p0) {
    final String _sql = "SELECT * FROM branches";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Branch>>() {
      @Override
      public List<Branch> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBranchName = CursorUtil.getColumnIndexOrThrow(_cursor, "branchName");
          final int _cursorIndexOfBranchAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "branchAddress");
          final List<Branch> _result = new ArrayList<Branch>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Branch _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBranchName;
            if (_cursor.isNull(_cursorIndexOfBranchName)) {
              _tmpBranchName = null;
            } else {
              _tmpBranchName = _cursor.getString(_cursorIndexOfBranchName);
            }
            final String _tmpBranchAddress;
            if (_cursor.isNull(_cursorIndexOfBranchAddress)) {
              _tmpBranchAddress = null;
            } else {
              _tmpBranchAddress = _cursor.getString(_cursorIndexOfBranchAddress);
            }
            _item = new Branch(_tmpId,_tmpBranchName,_tmpBranchAddress);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
