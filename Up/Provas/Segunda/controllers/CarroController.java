package controllers;

import java.util.ArrayList;

import models.Carro;

public class CarroController {
    
    private static ArrayList<Carro> carros = 
    new ArrayList<Carro>();

    public void cadastrar(Carro carro){
        carros.add(carro);
    }

    public ArrayList<Carro> listar(){
        return carros;
    }

    public Carro buscarPorPlaca(String placa){
        for (Carro carroCadastrado : carros) {
            if(carroCadastrado.getPlaca().equals(placa)){
                return carroCadastrado;
            }
        }
        return null;
    }


}
