package aula04;

public class Caneta {
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampa;
    
    public Caneta(String modelo, double ponta, String cor) {
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.setCor(cor);
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPonta() {
        return ponta;
    }
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isTampa() {
        return tampa;
    }
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
    public void status(){
        System.out.println("É do modelo " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
    }
}
