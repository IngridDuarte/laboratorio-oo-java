package lab07;

public class Envenenamento implements Magia {

    @Override
    public void aplica(Personagem personagem) {
        personagem.diminuiVida(10);
    }

}
