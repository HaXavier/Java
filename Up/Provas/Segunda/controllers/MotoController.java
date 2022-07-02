package controllers;

import java.util.ArrayList;

import models.Moto;

public class MotoController {
    
    private static ArrayList<Moto> motos = 
    new ArrayList<Moto>();

    public void cadastrar(Moto moto){
        motos.add(moto);
    }

    public ArrayList<Moto> listar(){
        return motos;
    }

    public Moto buscarPorPlaca(String placa){
        for (Moto motoCadastrada : motos) {
            if(motoCadastrada.getPlaca().equals(placa)){
                return motoCadastrada;
            }
        }
        return null;
    }
}
