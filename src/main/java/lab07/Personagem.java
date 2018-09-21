package lab07;

public class Personagem {

    private String nome;
    private int vida;
    private int energia;

    public Personagem(String nome, int vida, int energia) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int aumentaVida(int valor) {
      return  vida += valor;
    }

    public int diminuiVida(int valor) {
       return vida -= valor;
    }

    public int aumentaEnergia(int valor) {
       return  energia += valor;
    }

    public int diminuiEnergia(int valor) {
       return energia -= valor;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }
}
