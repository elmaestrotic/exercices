public class CoPrimos {

        public static void main(String[] args) {
            int tempo = 0;
            int i = 0;
            int vector1[] = new int[20];//vector  de 10 enteros
            int vector2[] = new int[20];//vector  de 10 enteros
            while (i < 20) {
                tempo = (int) (Math.random() * 100 + 1);
                if (isPrime(tempo)) {
                    vector1[i] = tempo;
                    tempo = (int) (Math.random() * 100 + 1);
                    if (isPrime(tempo)) {
                        vector2[i] = tempo;
                       i++;
                    }
                }//fin while
            }
            System.out.println();
            for (int j = 0; j < vector1.length; j++) {
                System.out.print(vector1[j] + "|");

            }
            System.out.println();
            for (int k = 0; k < vector2.length; k++) {
                System.out.print(vector2[k] + "|");

            }
        }//end method main
        static boolean isPrime(int numero) {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }//end for
            return true;
        }
    }// end class

