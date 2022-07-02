package views;

import utils.Console;

public class Principal {
    public static void main (String[] args) {

        int opcao = 0;
        do{
            System.out.println("\n ATIVIDADE AVALIATIVA \n");

            System.out.println("\n 1 - Cadastrar Funcionario");
            System.out.println("\n 2 - Cadastrar Folha de Pagamento");
            System.out.println("\n 3 - Consultar Folha de Pagamento");
            System.out.println("\n 4 - Consultar todas as folhas de pagamento");
            System.out.println("\n 0 - Sair");
            opcao = Console.readInt("\n Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                case 2:
                    CadastrarFolhaPagamento cadastrarFolhaPagamento = new CadastrarFolhaPagamento();
                    cadastrarFolhaPagamento.renderizar();
                    break;
                // case 3:
                //     ConsultaFolhaPagamento consultaFolhaPagamento = new ConsultaFolhaPagamento();
                //     consultaFolhaPagamento.renderizar();
                //     break;
                // case 4:
                //     ConsultaTodasFolhaPagamento consultaTodasFolhaPagamento = new ConsultaTodasFolhaPagamento();
                //     consultaTodasFolhaPagamento.renderizar();
                //     break;
            }
        }while (opcao !=0);
    }
} 
