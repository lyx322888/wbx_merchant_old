package com.wbx.merchant.chat;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "CHAT_MESSAGE_BEAN".
*/
public class ChatMessageBeanDao extends AbstractDao<ChatMessageBean, Long> {

    public static final String TABLENAME = "CHAT_MESSAGE_BEAN";

    /**
     * Properties of entity ChatMessageBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, String.class, "UserId", false, "UserId");
        public final static Property UserName = new Property(2, String.class, "UserName", false, "UserName");
        public final static Property UserHeadIcon = new Property(3, String.class, "UserHeadIcon", false, "UserHeadIcon");
        public final static Property UserContent = new Property(4, String.class, "UserContent", false, "UserContent");
        public final static Property Time = new Property(5, String.class, "time", false, "time");
        public final static Property Type = new Property(6, int.class, "type", false, "type");
        public final static Property Messagetype = new Property(7, int.class, "messagetype", false, "messagetype");
        public final static Property UserVoiceTime = new Property(8, float.class, "UserVoiceTime", false, "UserVoiceTime");
        public final static Property UserVoicePath = new Property(9, String.class, "UserVoicePath", false, "UserVoicePath");
        public final static Property UserVoiceUrl = new Property(10, String.class, "UserVoiceUrl", false, "UserVoiceUrl");
        public final static Property SendState = new Property(11, int.class, "sendState", false, "sendState");
        public final static Property ImageUrl = new Property(12, String.class, "imageUrl", false, "imageUrl");
        public final static Property ImageIconUrl = new Property(13, String.class, "imageIconUrl", false, "imageIconUrl");
        public final static Property ImageLocal = new Property(14, String.class, "imageLocal", false, "imageLocal");
    }


    public ChatMessageBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ChatMessageBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_MESSAGE_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"UserId\" TEXT," + // 1: UserId
                "\"UserName\" TEXT," + // 2: UserName
                "\"UserHeadIcon\" TEXT," + // 3: UserHeadIcon
                "\"UserContent\" TEXT," + // 4: UserContent
                "\"time\" TEXT," + // 5: time
                "\"type\" INTEGER NOT NULL ," + // 6: type
                "\"messagetype\" INTEGER NOT NULL ," + // 7: messagetype
                "\"UserVoiceTime\" REAL NOT NULL ," + // 8: UserVoiceTime
                "\"UserVoicePath\" TEXT," + // 9: UserVoicePath
                "\"UserVoiceUrl\" TEXT," + // 10: UserVoiceUrl
                "\"sendState\" INTEGER NOT NULL ," + // 11: sendState
                "\"imageUrl\" TEXT," + // 12: imageUrl
                "\"imageIconUrl\" TEXT," + // 13: imageIconUrl
                "\"imageLocal\" TEXT);"); // 14: imageLocal
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_MESSAGE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ChatMessageBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindString(2, UserId);
        }
 
        String UserName = entity.getUserName();
        if (UserName != null) {
            stmt.bindString(3, UserName);
        }
 
        String UserHeadIcon = entity.getUserHeadIcon();
        if (UserHeadIcon != null) {
            stmt.bindString(4, UserHeadIcon);
        }
 
        String UserContent = entity.getUserContent();
        if (UserContent != null) {
            stmt.bindString(5, UserContent);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }
        stmt.bindLong(7, entity.getType());
        stmt.bindLong(8, entity.getMessagetype());
        stmt.bindDouble(9, entity.getUserVoiceTime());
 
        String UserVoicePath = entity.getUserVoicePath();
        if (UserVoicePath != null) {
            stmt.bindString(10, UserVoicePath);
        }
 
        String UserVoiceUrl = entity.getUserVoiceUrl();
        if (UserVoiceUrl != null) {
            stmt.bindString(11, UserVoiceUrl);
        }
        stmt.bindLong(12, entity.getSendState());
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(13, imageUrl);
        }
 
        String imageIconUrl = entity.getImageIconUrl();
        if (imageIconUrl != null) {
            stmt.bindString(14, imageIconUrl);
        }
 
        String imageLocal = entity.getImageLocal();
        if (imageLocal != null) {
            stmt.bindString(15, imageLocal);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ChatMessageBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindString(2, UserId);
        }
 
        String UserName = entity.getUserName();
        if (UserName != null) {
            stmt.bindString(3, UserName);
        }
 
        String UserHeadIcon = entity.getUserHeadIcon();
        if (UserHeadIcon != null) {
            stmt.bindString(4, UserHeadIcon);
        }
 
        String UserContent = entity.getUserContent();
        if (UserContent != null) {
            stmt.bindString(5, UserContent);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }
        stmt.bindLong(7, entity.getType());
        stmt.bindLong(8, entity.getMessagetype());
        stmt.bindDouble(9, entity.getUserVoiceTime());
 
        String UserVoicePath = entity.getUserVoicePath();
        if (UserVoicePath != null) {
            stmt.bindString(10, UserVoicePath);
        }
 
        String UserVoiceUrl = entity.getUserVoiceUrl();
        if (UserVoiceUrl != null) {
            stmt.bindString(11, UserVoiceUrl);
        }
        stmt.bindLong(12, entity.getSendState());
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(13, imageUrl);
        }
 
        String imageIconUrl = entity.getImageIconUrl();
        if (imageIconUrl != null) {
            stmt.bindString(14, imageIconUrl);
        }
 
        String imageLocal = entity.getImageLocal();
        if (imageLocal != null) {
            stmt.bindString(15, imageLocal);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ChatMessageBean readEntity(Cursor cursor, int offset) {
        ChatMessageBean entity = new ChatMessageBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // UserId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // UserName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // UserHeadIcon
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // UserContent
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // time
            cursor.getInt(offset + 6), // type
            cursor.getInt(offset + 7), // messagetype
            cursor.getFloat(offset + 8), // UserVoiceTime
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // UserVoicePath
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // UserVoiceUrl
            cursor.getInt(offset + 11), // sendState
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // imageUrl
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // imageIconUrl
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14) // imageLocal
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ChatMessageBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserHeadIcon(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserContent(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.getInt(offset + 6));
        entity.setMessagetype(cursor.getInt(offset + 7));
        entity.setUserVoiceTime(cursor.getFloat(offset + 8));
        entity.setUserVoicePath(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setUserVoiceUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSendState(cursor.getInt(offset + 11));
        entity.setImageUrl(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setImageIconUrl(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setImageLocal(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ChatMessageBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ChatMessageBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ChatMessageBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
