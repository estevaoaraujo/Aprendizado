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
        Mae mae = new Mae("Maria", 61);
        System.out.println("Nome da mae é " + mae.getNome());
        mae.ficha();

        Filho filho = new Filho("Marcos",20);
        filho.ficha();

        Filha filha = new Filha("Larrisa",19);
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

        ArrayList<Mae>lista = new ArrayList<>();
        lista.add(mae);
        lista.add(filha);
        lista.add(filho);

        System.out.println(lista);

        mae.getparticular();
        filha.getparticular();
        filho.getparticular();

    }
}