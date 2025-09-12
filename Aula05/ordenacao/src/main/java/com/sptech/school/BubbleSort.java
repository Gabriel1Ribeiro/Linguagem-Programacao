package com.sptech.school;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numeros = {64, 321, 53, 2, 342, 0, 53};
        int[] valores = {121, 22, 93, 11, 96, 0, 01};

        System.out.println("Antes de ordenar");
        imprimirArray(numeros);
        imprimirArray(valores);

        System.out.println("Ordenando...");
        BubbleSort(numeros);
        selectionSort(valores);

        System.out.println("Depois de ordenar");
        imprimirArray(numeros);
        imprimirArray(valores);
    }


    // Algoritmos Bubble
    public static void BubbleSort(int[] array) {
        long inicio = System.currentTimeMillis();

        int n = array.length;
        boolean trocou;

        // Percorrer o vetor
        for (int i = 0; i < n - 1; i++){
            trocou = false;
            // Comparar elementos
            for (int j = 0; j < n - i -1; j++) {
                if(array[j] > array[j + 1]) {
                    //Executar a troca
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
             }
            //Se nenhuma troca ocorreu
            if(!trocou) {break;}
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");
    }

    // Selection Sort
    public static void selectionSort (int[] array){
        long inicio = System.currentTimeMillis();

        int n = array.length;
        for(int x = 0; x < n - 1; x++) {
            int indiceMinimo = x;
            for (int j = x + 1; j < n; j++) {
                if(array[j] < array[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[x];
            array[x] = temp;
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");
    }

    // Método para imprimir o array
    public static void imprimirArray(int[]array) {
        // Isso seria um foreach
        for(int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

}
