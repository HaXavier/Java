package views;

// import controllers.AutomovelController;
import controllers.MotoController;
// import models.Automovel;
import models.Moto;
import views.contracts.IViews;

public class ListarMotos implements IViews {
    @Override
    public void renderizar(){
        MotoController motoController = new MotoController();      
        System.out.println("\n -- LISTAGEM DE CARROS -- \n");
        for (Moto motoCadastrado : motoController.listar()) {
            System.out.println(motoCadastrado);
        }
    }
}
