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

    public void aumentaVida(int valor) {
        vida += valor;
    }

    public void diminuiVida(int valor) {
        vida -= valor;
    }

    public void aumentaEnergia(int valor) {
        energia += valor;
    }

    public void diminuiEnergia(int valor) {
        energia -= valor;
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
