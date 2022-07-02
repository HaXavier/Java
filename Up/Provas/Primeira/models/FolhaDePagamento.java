// Ao selecionar a segunda opção, o sistema deve realizar as seguintes operações:
// 	- Ler o CPF do funcionário, verificar se o mesmo está cadastrado para continuar as leituras;
// 	- Ler o mês (int) da folha de pagamento;
// 	- Ler o ano (int) da folha de pagamento;
// 	- Ler o número de horas trabalhadas (int);
// 	- Ler o valor da hora (double);	
// 	- Criar um objeto com os dados e armazenar em uma lista;
package models;

public class FolhaDePagamento {
    
    private int mes;
    private int ano;
    private int horasTrabalhadas;
    private double valorHora;
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
