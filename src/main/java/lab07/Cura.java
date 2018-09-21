package lab07;

public class Cura implements Magia {

    @Override
    public void aplica(Personagem personagem) {
        personagem.aumentaVida(10);
    }
}
