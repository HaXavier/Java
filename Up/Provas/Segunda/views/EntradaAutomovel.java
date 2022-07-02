package views;

import java.text.BreakIterator;

import controllers.AutomovelController;
import controllers.CarroController;
import controllers.MotoController;
import models.Automovel;
import models.Carro;
import models.Moto;
import utils.Console;
import views.contracts.IViews;

public class EntradaAutomovel implements IViews {
    
    @Override
    public void renderizar() {
    
        // Carro carro = new Carro();
        // Moto moto = new Moto();
        Automovel automovel = new Automovel();

        AutomovelController automovelController = new AutomovelController();
        // CarroController carroController = new CarroController();
        // MotoController motoController =  new MotoController();


        System.out.println("\n--ENTRADA DE AUTOMÓVEIS--\n");

        String placaAutomovel = Console.readString("Digite a placa do Automóvel: ");
        automovel = automovelController.buscarPorPlaca(placaAutomovel);
        if(automovel != null) {
            System.out.println("Entrada Realiazada com êxito");
        } else {
            System.out.println("Automovel nao localizado");
        }


    }

}
