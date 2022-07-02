package models;

import controllers.AutomovelController;

public class Carro extends Automovel{
    
    AutomovelController automovelcController = new AutomovelController();

    @Override
    public String toString() {
        return "[Carro:]" + "\n[Modelo:]" + getModelo() + "\n" + "[Cor:]" + getCor() + "\n" + automovelcController.listar();
    }

}
