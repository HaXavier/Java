package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {
    public void renderizar() {
        Funcionario funcionario = new Funcionario();

        System.out.println("\n *** CADASTRO DE FUNCIONARIOS *** \n");
        funcionario.setNome(Console.readString("Digite o nome do Funcionario: "));
        funcionario.SetCpf(Console.readString("Digite o CPF do Funcionario: "));
        FuncionarioController.cadastrar(funcionario);
        System.out.println("\n Funcionario cadastrado!\n");
    }
}
