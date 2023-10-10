package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Modal.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class departamentoControllers {
    public void pesquisarDepartamento(){
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
        }catch (Exception error){
            System.out.println(error);
        }

    }

    public void deletarDepartamento(){
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

                System.out.println("usuario " + nome + "que possui o id" + id + "com o departamento" + cargo);

            }
        }
    }
}
