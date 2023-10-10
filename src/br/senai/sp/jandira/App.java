package br.senai.sp.jandira;

import br.senai.sp.jandira.Controller.departamentoControllers;
import br.senai.sp.jandira.Controller.funcionariosControllers;
import br.senai.sp.jandira.Modal.Conexao;

public class App {
    public static void main(String[] args) {
        funcionariosControllers objController = new funcionariosControllers();
        objController.consultarFuncionarios();
        objController.pesquisarFuncionario();
        objController.deletarFuncionario();

        departamentoControllers objDepartamento = new departamentoControllers();
        objDepartamento.pesquisarDepartamento();


    }
}
