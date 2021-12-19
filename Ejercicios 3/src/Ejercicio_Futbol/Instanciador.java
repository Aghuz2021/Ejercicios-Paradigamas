package Ejercicio_Futbol;

public class Instanciador {
    public static void main(String[] args) {

        Futbolista riquelme = new Futbolista("Roman Riquelme", "Boca", 3);
        Futbolista.setMaximoGoleador(riquelme);
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

        Futbolista messi = new Futbolista("Lionel Messi", "PSG", 0);
        messi.anotarGol();
        messi.anotarGol();
        messi.anotarGol();
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

        Futbolista ronaldo = new Futbolista("Cristiano Ronaldo", "Manchester United", 0);
        ronaldo.anotarGol();
        ronaldo.anotarGol();
        ronaldo.anotarGol();
        ronaldo.anotarGol();
        ronaldo.anotarGol();
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

    }
}
