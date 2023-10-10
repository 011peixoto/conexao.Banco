package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Modal.Conexao;

import javax.xml.transform.Result;
import java.sql.*;

public class funcionariosControllers {

    public void consultarFuncionarios(){
        try {
            Conexao objConexao = new Conexao();
            Connection conection = objConexao.getConection();

            Statement statement = conection.createStatement();

            String queryconsultaFuncionario = "SELECT  * FROM funcionario";

            ResultSet resultSet = statement.executeQuery(queryconsultaFuncionario);

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                String nome = resultSet.getString("NomeFuncionario");

                System.out.println("id: " + id);
                System.out.println("nome: " + nome);
                System.out.println("----------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void pesquisarFuncionario(){
        try{
            Conexao objConexao = new Conexao();
            Connection conection = objConexao.getConection();
            Statement statement = conection.createStatement();

            String queryPesquisarFuncionario = " SELECT FROM funcionario WHERE nome = '" + nome + "'";

            ResultSet resultSet = statement.executeQuery(queryPesquisarFuncionario);

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                String nome  = resultSet.getString("NomeFuncionario");
                String cargo  = resultSet.getString("Cargo");


                System.out.println("id: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Cargo: " + cargo );
                System.out.println("---------------------------------------------");
            }
        } catch (Exception error){
            System.out.println(error);
        }

    }

    public void deletarFuncionario(){

        try{
            Conexao objConexao = new Conexao();
            Connection conection = objConexao.getConection();
            Statement statement = conection.createStatement();

            String queryPesquisarFuncionario =     "DELETE FROM funcionario WHERE nome = '" + nome + "'";;

            ResultSet resultSet = statement.executeQuery(queryPesquisarFuncionario);

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                String nome  = resultSet.getString("NomeFuncionario");
                String cargo  = resultSet.getString("Cargo");


                System.out.println("id: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Cargo: " + cargo );
                System.out.println("---------------------------------------------");
            }
        } catch (Exception error){
            System.out.println(error);
        }
    }
}


