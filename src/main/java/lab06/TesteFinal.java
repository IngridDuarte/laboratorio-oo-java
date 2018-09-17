package lab06;

/**
 *
 * Na classe Carro:
 *
 * 1: Crie a classe Carro com os atributos marca, modelo e ano
 *
 * 2: Implemente o construtor, os getters e os setters de cada atributo da classe
 *
 * 4: Implemente o metodo toString da classe Carro retornando marca, modelo e ano separados por um espaco em branco
 *
 *
 * Na classe TesteFinal:
 *
 *    1: Crie uma lista de carros
 *
 *    2: Adicione tres objetos nesta lista com os seguintes atributos:
 *
 *      Marca       Modelo      Ano
 *
 *      Chevrolet   Onix        2018
 *      Ford        Fiesta      2006
 *      Fiat        Mille       2001
 *
 *    3: Percorra a lista criada e concatene o resultado de toString de cada carro da lista a variavel resultado.
 *    Separe cada saida com um ponto-e-virgula. Veja o exemplo abaixo:
 *
 *        Dica:
 *
 *         resultado += "; " + carro.toString();
 *
 *    4:  retorne a variavel resultado e verifique se o teste passou.
 *
 *
 *  DESAFIO:
 *
 *     Implemente a mesma logica utilizada no metodo teste, porem, em vez de utilizar toString() utilize os getters
 *     dos atributos do carro.
 */
public class TesteFinal {

    public static String teste() {
        String resultado = "";

        resultado += " " + "-";

        return resultado;
    }

    public static String testeComGetters() {
        return "-";
    }
}
