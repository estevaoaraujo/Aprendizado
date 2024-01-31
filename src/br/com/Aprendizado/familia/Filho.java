package br.com.Aprendizado.familia;

import br.com.Aprendizado.face.Particularidades;

public class Filho extends Mae implements Particularidades {
    @Override
    public int getparticular() {
        return getIdade();
    }
}
