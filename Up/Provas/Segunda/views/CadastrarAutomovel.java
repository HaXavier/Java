package views;

import controllers.CarroController;
import controllers.AutomovelController;
import controllers.MotoController;
import models.Automovel;
import models.Carro;
import models.Moto;
import utils.Console;

public class CadastrarAutomovel {
    
    public void renderizar() {

        Automovel automovel = new Automovel();
        Carro carro = new Carro();
        Moto moto = new Moto();

        AutomovelController automovelcontroller = new AutomovelController();
        CarroController carroController = new CarroController();
        MotoController motoController = new MotoController();

            Console YesNo = new Console();
        
        System.out.println("Carro ou Moto?");
        String yesno = YesNo.readString();
       
    
        if(yesno.equals("carro")) {
     
            System.out.println("--CARRO SELECIONADO--");
            carro.setModelo(Console.readString("Digite o Modelo: "));
            carro.setCor(Console.readString("Digite a Cor: "));
            automovel.setPlaca(Console.readString("Digite a Placa: "));
            carroController.cadastrar(carro);
            automovelcontroller.cadastrar(automovel);
            System.out.println("\nCarro Cadastrado !!");


        }
        else if(yesno.equals("moto")) {
        
            System.out.println("--MOTO SELECIONADA--");
            moto.setModelo(Console.readString("Digite o Modelo: "));
            moto.setCor(Console.readString("Digite a Cor: "));
            automovel.setPlaca(Console.readString("Digite a Placa: "));
            motoController.cadastrar(moto);
            automovelcontroller.cadastrar(automovel);
            System.out.println("\nMoto Cadastrado !!");
        }
        }
    }

    // Console YesNo = new Console();
        
    // System.out.println("Carro ou Moto?");
    // String yesno = YesNo.readString();
       
    
    // if(yesno.equals("carro")) {
     
    //     System.out.println("--CARRO SELECIONADO--");
    //     carro.setModelo(Console.readString("Digite o Modelo: "));
    //     carro.setCor(Console.readString("Digite a Cor: "));
    //     carro.setPlaca(Console.readString("Digite a Placa: "));
    //     carroController.cadastrar(carro);
    //     System.out.println("\nCarro Cadastrado !!");


    // }
    // else if(yesno.equals("moto")) {
     
    //     System.out.println("--MOTO SELECIONADA--");
    //     moto.setModelo(Console.readString("Digite o Modelo: "));
    //     moto.setCor(Console.readString("Digite a Cor: "));
    //     moto.setPlaca(Console.readString("Digite a Placa: "));
    //     motoController.cadastrar(moto);
    //     System.out.println("\nMoto Cadastrado !!");
    // }
