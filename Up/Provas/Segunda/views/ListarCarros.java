package views;

import controllers.AutomovelController;
import controllers.CarroController;
import models.Automovel;
import models.Carro;
import views.contracts.IViews;

public class ListarCarros implements IViews{
    
    @Override
    public void renderizar(){
        CarroController carroController = new CarroController();      
        System.out.println("\n -- LISTAGEM DE CARROS -- \n");
        for (Carro carroCadastrado : carroController.listar()) {
            System.out.println(carroCadastrado);
        }
    }

}

