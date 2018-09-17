package lab05;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 *
 * Na classe Carro:
 *
 *  1: Crie os atributos marca e modelo
 *
 *  2: Utilize um construtor ou setters para atribuicao de valores aos atributos
 *
 *  3: Implemente o metodo toString() que retorne marca e modelo separados por um espaco em branco
 *
 *
 *  Na classe TesteListas:
 *
 *  1: Crie tres carros com os seguintes atributos:
 *
 *      Marca       Modelo
 *
 *      Chevrolet   Celta
 *      Ford        Corcel
 *      Ford        Maverick
 *
 *  2: Crie uma lista de carros
 *
 *  3: Adicione os tres carros criados na lista
 *
 */
public class TesteListas {

    public static String teste() {

        List<Carro> carros = new ArrayList<>();

        //  NAO ALTERE ESSA LINHA
       return carros.stream().map(Carro::toString).collect(joining("; "));
    }
}
