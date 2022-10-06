package Arrays;

import java.util.Arrays;

public class ArrayAula {
    public static void main(String[] args) {
        int[] arrayNumero = new int[10];
        //       índice  valor
//        arrayNumero[0] = 10;
//        arrayNumero[1] = 11;
//        arrayNumero[2] = 12;
//        arrayNumero[3] = 13;
//        arrayNumero[4] = 14;
//        arrayNumero[5] = 15;
//        arrayNumero[6] = 16;
//        arrayNumero[7] = 17;
//        arrayNumero[8] = 18;
//        arrayNumero[9] = 19;

        System.out.println(Arrays.toString(arrayNumero));
        System.out.println("Tamanho do vetor: " + arrayNumero.length);
        for (int valor : arrayNumero) {
            System.out.println(valor);
        }
    }
}
