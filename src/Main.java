import br.com.Aprendizado.familia.Filha;
import br.com.Aprendizado.familia.Filho;
import br.com.Aprendizado.familia.Mae;
import br.com.Aprendizado.financeiro.Operacoes;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mae mae = new Mae();
        mae.setNome("Maria");
        mae.setIdade(30);
        System.out.println("Nome da mae é " + mae.getNome());
        mae.ficha();

        Filho filho = new Filho();
        filho.setNome("Marcos");
        filho.setIdade(21);
        filho.ficha();

        Filha filha = new Filha();
        filha.setNome("Larrisa");
        filha.setIdade(19);
        filha.ficha();

        Operacoes operacoes = new Operacoes();
        operacoes.setMae(mae);
        operacoes.setSaldo(500);
        operacoes.mensagem();

        operacoes.setMae(filha);
        operacoes.setSaldo(100);
        operacoes.mensagem();

        operacoes.setMae(filho);
        operacoes.setSaldo(200);
        operacoes.mensagem();

        ArrayList<Mae>listaDeMae = new ArrayList<>();
        listaDeMae.add(mae);

        System.out.println(listaDeMae);

    }
}