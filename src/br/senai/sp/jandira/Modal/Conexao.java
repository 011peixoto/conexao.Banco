package br.senai.sp.jandira.Modal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private String servidor, banco, user, password;

    public Connection conexao;


    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_java";
        this.user = "root";
        this.password = "bcd127";
    };

    public  boolean conexaoDrive(){

        try{
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.user,this.password);
            return true;

        } catch (Exception error){
            System.out.println(error);
            return false;
        }
    }

    public Connection getConection(){
        conexaoDrive();
        return conexao;
    }
}
