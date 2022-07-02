package views;

import controllers.FolhaDePagamentoController;
import models.FolhaDePagamento;
import utils.Console;

public class CadastrarFolhaPagamento {

    public void renderizar() {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        System.out.println("\n *** CADASTRO DE FOLHA DE PAGAMENTO *** \n");
        folhaDePagamento.setMes(Console.readInt("Digite o Mês: "));
        folhaDePagamento.setAno(Console.readInt("Digite o Ano: "));
        folhaDePagamento.setHorasTrabalhadas(Console.readInt("Digite a Quantidade de Horas Trabalhadas: "));
        folhaDePagamento.setValorHora(Console.readDouble("Digite o Valor por Hora: "));
        FolhaDePagamentoController.cadastrarfolha(folhaDePagamento);
        System.out.println("\n Funcionario cadastrado!\n");
    }
}
