import lab01.TesteEncapsulamentoCarro;
import lab02.TesteConstrutoresCarro;
import lab03.TesteAtributosCarro;
import lab04.TesteToString;
import lab05.TesteListas;
import lab06.TesteFinal;

import java.util.function.Function;

import static java.lang.String.format;
import static java.lang.System.out;

public class Testes {

    private static final String VERMELHO = "\033[0;31m";
    private static final String VERDE = "\033[0;32m";
    private static final String NO_COLOR = "\033[0m";

    public static void main(String[] args) {
        exibeResultado("Lab 01", "Ford Mustang", TesteEncapsulamentoCarro.teste());
        exibeResultado("Lab 02", "Chevrolet Celta", TesteConstrutoresCarro.teste());
        exibeResultado("Lab 03", "Fiat 147 Branco", TesteAtributosCarro.teste());
        exibeResultado("Lab 04", "Ford Del Rey Laranja", TesteToString.teste());
        exibeResultado("Lab 05", "Chevrolet Celta; Ford Corcel; Ford Maverick", TesteListas.teste());
        exibeResultado("Lab 06 - ToString", " - Chevrolet Onix 2018 - Ford Fiesta 2006 - Fiat Mille 2001", TesteFinal.teste());
        exibeResultado("Lab 06 - Desafio", " - Chevrolet Onix 2018 - Ford Fiesta 2006 - Fiat Mille 2001", TesteFinal.testeComGetters());
    }

    private static void exibeResultado(String titulo, String esperado, String recebido) {

        boolean testePassou = esperado.equals(recebido);

        Function<String, String> formata = testePassou ? Testes::sucesso : Testes::falha;

        String descricaoResultado = testePassou ? " - OK" : " - FALHOU";

        if (!testePassou) {
            out.println();
        }

        out.println(formata.apply(titulo + descricaoResultado));

        if (!testePassou) {
            out.println(formata.apply(esperado(esperado)));
            out.println(formata.apply(recebido(recebido)));
            out.println();
        }

    }


    private static String esperado(String valor) {
        return format("  Esperado: %s", valor);
    }

    private static String recebido(String valor) {
        return format("  Recebido: %s", valor);
    }

    private static String sucesso(String valor) {
        return format("%s%s%s", VERDE, valor, NO_COLOR);
    }

    private static String falha(String valor) {
        return format("%s%s%s", VERMELHO, valor, NO_COLOR);
    }
}
