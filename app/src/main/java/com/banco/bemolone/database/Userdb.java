package com.banco.bemolone.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.banco.bemolone.Usuario;

import java.util.List;



public class Userdb {
    public static void salvar(Usuario usuario){
        ContentValues values = new ContentValues();
        values.put("nome", usuario.getNome());
        values.put("telefone", usuario.getTelefone());
        values.put("email", usuario.getEmail());
        values.put("endereco", usuario.getEndereco());
        values.put("cep", usuario.getCep());
        values.put("senha", usuario.getSenha());


        SQLiteDatabase Databaseevent = database.getInstance();
        Databaseevent.insert("usuario", null, values);

    }
    public void alterar(Usuario usuario){
    }
    public List<Usuario>listar(){
        return null;
    }
    public void excluir(Integer id){

    }
}

