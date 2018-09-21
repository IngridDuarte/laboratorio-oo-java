package lab07;

public class Sono implements Magia {

    @Override
    public void aplica(Personagem personagem) {

        personagem.diminuiEnergia(10);
    }
}
