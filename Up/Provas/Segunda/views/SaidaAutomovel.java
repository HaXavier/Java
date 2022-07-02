package views;

import java.util.Random;

import controllers.AutomovelController;
import models.Automovel;
import utils.Console;
import views.contracts.IViews;

public class SaidaAutomovel implements IViews {
    @Override
    public void renderizar() {
    
        // Carro carro = new Carro();
        // Moto moto = new Moto();
        Automovel automovel = new Automovel();

        AutomovelController automovelController = new AutomovelController();
        // CarroController carroController = new CarroController();
        // MotoController motoController =  new MotoController();


        System.out.println("\n--SAIDA DE AUTOMÓVEIS--\n");

        String placaAutomovel = Console.readString("Digite a placa do Automóvel: ");
        automovel = automovelController.buscarPorPlaca(placaAutomovel);
        if(automovel != null) {
            System.out.println("Já deu Entrada no Estacionamento");
            Random random = new Random();
            int sequencia = 61;
    
            int numeroale = random.nextInt(sequencia);

            System.out.println("Tempo no estacionamento: " + numeroale + "min");
            System.out.println("Valor:R$" + numeroale * 5.00 );
        } else {
            System.out.println("Automovel nao localizado");
        }

    }
}
