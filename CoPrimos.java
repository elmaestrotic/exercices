public class CoPrimos {
    static int vector1[] = new int[20];//vector  de 10 enteros
    static int vector2[] = new int[20];//vector  de 10 enteros

    public static void main(String[] args) {
       int i = 0;

        while (i < 20) {
            vector1[i] = (int) (Math.random() * 100 + 1);
            vector2[i] = (int) (Math.random() * 100 + 1);
            i++;
        }//fin while
        System.out.println();

       //recorremos y mostramos el primer vector
        for (int j = 0; j < vector1.length; j++) {
            System.out.print(vector1[j] + "|");
        }
        System.out.println(); //recorremos y mostramos el 2° vector
        for (int k = 0; k < vector2.length; k++) {
            System.out.print(vector2[k] + "|");
        }
        mostrarCoprimos();

    }//end method main

   /* static boolean isPrime(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }//end for
        return true;
    }*/

    static void mostrarCoprimos() {
        int cumple = 0;
        String salida = "";
        for (int i = 0; i < vector1.length; i++) {
            cumple = mcd(vector1[i], vector2[i]);
            if (cumple == 1 || cumple == -1) {
                salida += vector1[i] + "|" + vector2[i] + "\n";
            }
        }//end for}
        System.out.println();
        System.out.println("Los coprimos son: \n" + salida);
    }

    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }


}// end class

