package br.com.Aprendizado.familia;

import br.com.Aprendizado.face.Particularidades;

public class Filha extends Mae implements Particularidades {
    @Override
    public int getparticular() {
        return getIdade();
    }
}
