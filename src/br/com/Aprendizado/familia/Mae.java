package br.com.Aprendizado.familia;

import br.com.Aprendizado.face.Particularidades;
import br.com.Aprendizado.financeiro.Operacoes;

public class Mae implements Particularidades {
    public Mae(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void ficha(){
        System.out.println("Nome:: "+ getNome()+ " Idade: "+ getIdade());
    }

    @Override
    public int getparticular() {

        if(getIdade()<18){
            System.out.println(getNome() + " é maior de idade.");
        }else if( getIdade()>18 && getIdade()<50){
            System.out.println(getNome()+" é uma jovem");
        }else{
            if(getIdade()>60){
                System.out.println(getNome() + " é idosa");
            }
        }
        return 0;
    }
    public String toString(){
        return nome;
    }
}
