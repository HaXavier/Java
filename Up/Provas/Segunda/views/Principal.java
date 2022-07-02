package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
        
        int opcao = 0;

        do {
            System.out.println("\n -- PROVA APLICAÇÃO DE ESTACIONAMENTO -- \n");
            System.out.println("1 - Cadastrar Automóvel");
            System.out.println("2 - Entrada Automóvel");
            System.out.println("3 - Saída do Automóvel");
            System.out.println("4 - Listar Carros");
            System.out.println("5 - Listar Motos");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarAutomovel cadastrarAutomovel = new CadastrarAutomovel();
                    cadastrarAutomovel.renderizar();
                    break;
                case 2:
                    EntradaAutomovel entradaAutomovel = new EntradaAutomovel();
                    entradaAutomovel.renderizar();
                    break;
                case 3:
                    SaidaAutomovel saidaAutomovel = new SaidaAutomovel();
                    saidaAutomovel.renderizar();
                    break;
                case 4:
                    ListarCarros listarCarros = new ListarCarros();
                    listarCarros.renderizar();
                    break;
                case 5:
                    ListarMotos listarmotos = new ListarMotos();
                    listarmotos.renderizar();
                    break;
                case 0:
                    System.out.println("\n-- SAINDO --\n");
                break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}
