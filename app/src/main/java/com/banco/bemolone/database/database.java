package com.banco.bemolone.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.Script;

import androidx.annotation.Nullable;

/*Create by michellemoura on 08/11/2021

 */

public class database extends SQLiteOpenHelper {

    private static SQLiteDatabase instance;

    public static SQLiteDatabase getInstance() {
        return instance;
    }

    public database(Context context, String name,
                    SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
        instance = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String tabelaUsuario = "";
        tabelaUsuario += "create table usuario (";
        tabelaUsuario += "id integer primary key autoincrement, ";
        tabelaUsuario += "nome varchar(255),";
        tabelaUsuario += "telefone varchar(255),";
        tabelaUsuario += "email varchar(255),";
        tabelaUsuario += "endereco varchar(255),";
        tabelaUsuario += "cep varchar(255),";
        tabelaUsuario += "senha varchar(255)";
        tabelaUsuario += ");";

        db.execSQL(tabelaUsuario);

    }
        /*SQLiteDatabase.execSQL(ScriptDados.getCreateTableCliente());*/


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


