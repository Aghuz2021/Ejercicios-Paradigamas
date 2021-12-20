package Ejercicio_Exception;

public class Exception {
    public static void main(String[] args) {
        String[] letras = new String[2];

        try {
            letras[2] = "c";
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        try {
            letras[0] = null;
            String a = letras[0];
            System.out.println(letras[0].startsWith(a));
        } catch(NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}

