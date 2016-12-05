package com.example.firat.odev;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FIRAT on 1.12.2016.
 */

public class VeriTabani extends SQLiteOpenHelper {
    private static final String VERITABANI="bilgiler";
    public static final int SURUM=1;
    public VeriTabani(Context cont){
        super(cont,VERITABANI,null,SURUM);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE yazi(id INTEGER PRIMARY KEY AUTOINCREMENT, baslik TEXT, icerik TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE İF EXIST yazi");
        onCreate(db);
    }
    public void veriEkle(){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("baslik","bu bir başlıktır");
        cv.put("icerik","bu bir içeriktir");
        db.insert("yazi",null,cv);
        db.close();
    }
    public List<String> sorugu(){
        List<String> sonuc=new ArrayList<String>();
        SQLiteDatabase db=this.getWritableDatabase();
        String[]sutunlar={"id","baslik","icerik"};
        Cursor cr=db.query("yazi",sutunlar,null,null,null,null,null);
        while(cr.moveToNext()) {
            sonuc.add(cr.getInt(0)+'-'+cr.getString(1)+'-'+cr.getString(2));
        }
        db.close();
        return sonuc;
    }
    public  String sorgula(int par){
        String sor="SELECT icerik FROM yazi WHERE id==1";
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sor, null);

        String sonuc=cursor.toString();
        db.close();
        return sonuc;
    }
}
