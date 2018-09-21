package lab07;

public class TesteMagias {

    public static String testeEnvenenamento() {

        Personagem policarpo = new Personagem("Policarpo Quaresma", 100, 100);

        Envenenamento envenena = new Envenenamento();

        envenena.aplica(policarpo);

        return policarpo.toString();

    }

    public static String testeCura() {

        Personagem joanaDarc = new Personagem("Joana D'Arc", 90, 100);

//        Magia cura = ???;

        Cura cura = new Cura();

        cura.aplica(joanaDarc);

        return joanaDarc.toString();
    }

    public static String testeSono() {
        Personagem rosinhaDeValenca = new Personagem("Rosinha de Valenca", 100, 100);

//        Magia sono = ???;

        Sono dorme = new Sono();
        dorme.aplica(rosinhaDeValenca);

        return rosinhaDeValenca.toString();
    }
}
