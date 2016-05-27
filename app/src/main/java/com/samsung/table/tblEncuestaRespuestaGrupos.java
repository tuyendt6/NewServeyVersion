package com.samsung.table;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SamSunger on 5/13/2015.
 */
public class tblEncuestaRespuestaGrupos {
    public static final String TBL_NAME = "tbl_EncuestaRespuestaGrupos";
    public static final String _ID = "id";//1
    public static final String PK_ID = "PkID";//2
    public static final String NOMBRE = "Nombre";//3
    public static final String DESCRIPCION = "Descripcion";//4

    private static String createData() {
        StringBuilder sBuiler = new StringBuilder();
        sBuiler.append("create table " + TBL_NAME + " (");
        sBuiler.append(_ID + " integer primary key autoincrement, ");//1
        sBuiler.append(PK_ID + " text, ");//2
        sBuiler.append(NOMBRE + " text, ");//3
        sBuiler.append(DESCRIPCION + " text);");//9
        return sBuiler.toString();
    }

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(createData());
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TBL_NAME);
        onCreate(database);
    }
}
