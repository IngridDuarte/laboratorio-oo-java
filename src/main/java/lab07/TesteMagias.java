package lab07;

public class TesteMagias {

    public static String testeEnvenenamento() {
        Envenenamento veneno= new Envenenamento();
        Personagem policarpo = new Personagem("Policarpo Quaresma", 100, 100);
        veneno.aplica(policarpo);
//        Magia veneno = ???

        return policarpo.toString();

    }

    public static String testeCura() {

        Cura cura = new Cura();
        Personagem joanaDarc = new Personagem("Joana D'Arc", 90, 100);
        cura.aplica(joanaDarc);
//        Magia cura = ???;

        return joanaDarc.toString();
    }

    public static String testeSono() {
        Sono sono = new Sono();

        Personagem rosinhaDeValenca = new Personagem("Rosinha de Valenca", 100, 100);
            sono.aplica(rosinhaDeValenca);
//        Magia sono = ???;

        return rosinhaDeValenca.toString();
    }
}
