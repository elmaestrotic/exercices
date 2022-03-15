public class Ejercicio3 {
    public static void main(String[] args) {
        String salida="";
        int vector[]= new int[20];//vector  de 10 enteros
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100 + 1);
            System.out.print(vector[i]+"|");

        }
        System.out.println();
        for (int i = 1; i < vector.length; i+=2) {
            if (vector[i] % 2  ==0){
                salida+=vector[i]+"| Pos: "+i+"\n";
            }
        }
        System.out.println();
        System.out.println("Los pares de las posiciones impares son: ");
        System.out.println(salida);
    }
}
