package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class EjemploJava {

    static boolean esVocal(char letra) {
        if (letra == 'A' || letra == 'E' || letra == 'I'
                || letra == 'O' || letra == 'U') {
            return true;
        }
        return false;
    }

    /**
     * recorrer una matriz e indicar cuales vocales tiene
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] letras = {
        {'A', 'B', 'C'},
        {'E', 'F', 'H'},
        {'Z', 'N', 'O'},
        {'R', 'P', 'W'}
        };

        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; i++) {

                if (esVocal(letras[i][x])) {

                    System.out.println("[" + letras[i][x]+"]");
                }
            }
        }
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if (esVocal(letras[i][j])) {
                    System.out.println("[" + letras[i][j] + "]");

                }
            }

        }

    }
}
