package br.com.Aprendizado.financeiro;

import br.com.Aprendizado.familia.Mae;


public class Operacoes {
    private Mae mae;
    private double saldo;
    private double debito;
    private double credito;
    private double transferencia;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setMae(Mae mae){
        this.mae =  mae;
    }
    public Mae getMae(){
        return mae;
    }
    public void mensagem(){
        System.out.println("Nome: " +  getMae()+ "    Saldo R$ " + getSaldo());
    }
}
