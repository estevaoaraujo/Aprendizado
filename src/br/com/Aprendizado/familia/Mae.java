package br.com.Aprendizado.familia;

import br.com.Aprendizado.face.Particularidades;
import br.com.Aprendizado.financeiro.Operacoes;

public class Mae implements Particularidades {
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
        System.out.println("Nome: "+ getNome()+ " Idade: "+ getIdade());
    }

    @Override
    public int getparticular() {
        return 10;
    }
    public String toString(){
        return nome;
    }
}
