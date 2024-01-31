package br.com.Aprendizado.familia;

import br.com.Aprendizado.face.Particularidades;

public class Filho extends Mae implements Particularidades {
    public Filho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int getparticular() {
        return getIdade();
    }
}
