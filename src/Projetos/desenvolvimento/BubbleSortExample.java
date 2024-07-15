package Projetos.desenvolvimento;

public class BubbleSortExample {

    // Método para realizar o Bubble Sort em um array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Loop através de todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Loop através do array a partir do primeiro elemento até o (n-i-1)-ésimo
            // O último i elementos já estão no lugar
            for (int j = 0; j < n - i - 1; j++) {
                // Se o elemento atual é maior que o próximo elemento
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Marca a flag swapped como true para indicar que houve uma troca
                    swapped = true;
                }
            }

            // Se não houve troca durante o loop interno, o array já está ordenado
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Imprime o array original
        System.out.println("Array original:");
        printArray(array);

        // Chama o método de Bubble Sort
        bubbleSort(array);

        // Imprime o array ordenado
        System.out.println("Array ordenado:");
        printArray(array);
    }

    // Método para imprimir o array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
