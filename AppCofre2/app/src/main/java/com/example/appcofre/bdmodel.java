package com.example.appcofre;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class bdmodel extends SQLiteOpenHelper {

    SQLiteDatabase database;

    public bdmodel(Context context)
    {
        super(context, getDbNome(), null, getDbVersao());
        database = getWritableDatabase();

    }
    private static String dbNome = "dbCredencial";
    private static int dbVersao = 1;
    private static String Tabela = "tblCredencial";
    private static String Id = "idCredencial";
    private static String Nome = "nomeCredencial";
    private static String Usuario = "usuarioCredencial";
    private static String Senha = "senhaCredencial";
    private String CmdSQL = "";

        public String getCmdSQL() {
            return CmdSQL;
        }

        public void setCmdSQL(String cmdSQL) {
            CmdSQL = cmdSQL;
        }

        public static String getDbNome() {
            return dbNome;
        }

        public static int getDbVersao() {
            return dbVersao;
        }

        public static String getTabela() {
            return Tabela;
        }

        public static String getId() {
            return Id;
        }

        public static String getNome() {
            return Nome;
        }

        public static String getUsuario() {
            return Usuario;
        }

        public static String getSenha() {
            return Senha;
        }


        public String criarTabela()
        {
            setCmdSQL("CREATE TABLE " + getTabela() + " (" +
                    getId() + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    getNome() + "TEXT, " +
                    getUsuario() + "TEXT, " +
                    getSenha() +"TEXT" + ")"
            );
            return getCmdSQL();
        };


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String tabela, credencialModel credencial) {
        ContentValues dados = new ContentValues();
        dados.put(getNome(), credencial.getNome());
        dados.put(getUsuario(), credencial.getUsuario());
        dados.put(getSenha(), credencial.getSenha());
        dataBase.insert(tabela, null, dados);
    }
    public ArrayList<credencialModel> select(){
        String[] colunas = {getId(), getNome(), getUsuario(), getSenha()};
        Cursor cursor = dataBase.query(getTabela(), colunas,null, null, null, null, null,
                null);
        ArrayList<credencialModel> arrayCredencialModel = new ArrayList<>();
        while(cursor.moveToNext()){
            credencialModel credencialModel = new credencialModel();
            credencialModel.setId(cursor.getInt(0));
            credencialModel.setNome(cursor.getString(1));
            credencialModel.setUsuario(cursor.getString(2));
            credencialModel.setSenha(cursor.getString(3));
            arrayCredencialModel.add(credencialModel);
        }
        return arrayCredencialModel;
    }





}
