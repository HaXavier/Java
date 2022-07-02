package controllers;

import java.util.ArrayList;

import models.Automovel;

public class AutomovelController {
    
    private static ArrayList<Automovel> automovels = 
        new ArrayList<Automovel>();

    public void cadastrar(Automovel automovel) {
        automovels.add(automovel);
    }

    public ArrayList<Automovel> listar(){
        return automovels;
    }

    public Automovel buscarPorPlaca(String placa){
        for (Automovel automovelCadastrado : automovels) {
            if(automovelCadastrado.getPlaca().equals(placa)){
                return automovelCadastrado;
            }
        }
        return null;
    }
}
