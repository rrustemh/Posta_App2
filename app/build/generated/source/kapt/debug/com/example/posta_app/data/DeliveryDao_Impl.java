package com.example.posta_app.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
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
public final class DeliveryDao_Impl implements DeliveryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DeliveryItem> __insertionAdapterOfDeliveryItem;

  public DeliveryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDeliveryItem = new EntityInsertionAdapter<DeliveryItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Deliveries` (`id`,`recieverName`,`address`,`city`,`phoneNumber`,`deliveryStatus`,`senderId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DeliveryItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getRecieverName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRecieverName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getCity() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCity());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNumber());
        }
        if (value.getDeliveryStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDeliveryStatus());
        }
        stmt.bindLong(7, value.getSenderId());
      }
    };
  }

  @Override
  public Object AddDelivery(final DeliveryItem delivery, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDeliveryItem.insert(delivery);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<DeliveryItem>> GetAllDeliveries(final int SenderId) {
    final String _sql = "SELECT * FROM Deliveries WHERE SenderId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, SenderId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Deliveries"}, false, new Callable<List<DeliveryItem>>() {
      @Override
      public List<DeliveryItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRecieverName = CursorUtil.getColumnIndexOrThrow(_cursor, "recieverName");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfDeliveryStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "deliveryStatus");
          final int _cursorIndexOfSenderId = CursorUtil.getColumnIndexOrThrow(_cursor, "senderId");
          final List<DeliveryItem> _result = new ArrayList<DeliveryItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DeliveryItem _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpRecieverName;
            if (_cursor.isNull(_cursorIndexOfRecieverName)) {
              _tmpRecieverName = null;
            } else {
              _tmpRecieverName = _cursor.getString(_cursorIndexOfRecieverName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpPhoneNumber;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhoneNumber = null;
            } else {
              _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final String _tmpDeliveryStatus;
            if (_cursor.isNull(_cursorIndexOfDeliveryStatus)) {
              _tmpDeliveryStatus = null;
            } else {
              _tmpDeliveryStatus = _cursor.getString(_cursorIndexOfDeliveryStatus);
            }
            final int _tmpSenderId;
            _tmpSenderId = _cursor.getInt(_cursorIndexOfSenderId);
            _item = new DeliveryItem(_tmpId,_tmpRecieverName,_tmpAddress,_tmpCity,_tmpPhoneNumber,_tmpDeliveryStatus,_tmpSenderId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
