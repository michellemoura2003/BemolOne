package com.banco.bemolone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.banco.bemolone.database.Userdb;
import com.banco.bemolone.database.database;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class CadastroActivity extends AppCompatActivity {
    private Button botaoConfirmar;
    //private RecyclerView listadados;
    //Private FloatingActionButton anexo;
    private SQLiteDatabase database;
    private database dadosOpenHelper;


    public void salvar(View view) {

        EditText nome = findViewById(R.id.editNome);
        EditText telefone = findViewById(R.id.editTelefone);
        EditText email = findViewById(R.id.editEmail);
        EditText endereco = findViewById(R.id.editEndereco);
        EditText cep = findViewById(R.id.editCEP);
        EditText senha = findViewById(R.id.editSenha);

        botaoConfirmar = findViewById(R.id.idbutton);


        Usuario usuario = new Usuario();
        usuario.setNome(nome.getText().toString());
        usuario.setTelefone(telefone.getText().toString());
        usuario.setEmail(email.getText().toString());
        usuario.setEndereco(endereco.getText().toString());
        //usuario.setCEP(cep.getText().toString());
        usuario.setSenha(cep.getText().toString());

        Userdb userdb = new Userdb();
        Userdb.salvar(usuario);

        Toast.makeText(getApplicationContext(),
                "Usuário salvo",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton listadados = findViewById(R.id.listadados);
        listadados.setOnClickListener((view) -> {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();

        });*/

        new database(getApplicationContext(),
                "bemolone.db", null, 1);
    }
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        anexo = (FloatingActionButton) findViewById(R.id.anexo);
        listadados = (RecyclerView) findViewById(R.id.listadados);
    }
        private void criarchamada(){

        try {

            {catch(SQLException);

            }
        }

        private void cadastrar(View view){

            Intents it = new Intents(MainActivity.this, Usuario.class);
            startActivity(it);*/
        }










