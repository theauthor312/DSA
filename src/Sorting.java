public class Sorting {
    public static void main(String[] args) {
        int[] unsortedNums = { 6, 5, 2, 8, 9, 4, 23, 13, 14, 17, 8, 5 };

        System.out.println("Before sorting");
        for (int num : unsortedNums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        // int[] sortedNums = insertionSort(unsortedNums);

        quickSort(unsortedNums, 0, unsortedNums.length - 1);

        System.out.println("After sorting");
        for (int num : unsortedNums) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] listOfNums) {
        /// BUBBLE SORT - O(n^2)
        int steps = 0;
        int bubble = 0;
        for (int i = 0; i < listOfNums.length - 1; i++) {
            for (int j = 0; j < listOfNums.length - i - 1; j++) {
                steps++;
                if (listOfNums[j] > listOfNums[j + 1]) {
                    bubble = listOfNums[j];
                    listOfNums[j] = listOfNums[j + 1];
                    listOfNums[j + 1] = bubble;
                }
            }
        }
        System.out.println("\nNumber of steps taken by the Bubble Sort :" + steps);
        return listOfNums;
    }

    public static int[] selectionSort(int[] listOfNums) {
        /// SELECTION SORT
        int size = listOfNums.length;
        int selectionIndex = 0;

        for (int i = size - 1; i > 0; i--) {
            int maximum = listOfNums[i];
            System.out.println("Maximum is: " + maximum);
            for (int j = 0; j <= i; j++) {
                if (listOfNums[j] >= maximum) {
                    maximum = listOfNums[j];
                    selectionIndex = j;
                }
            }

            listOfNums[selectionIndex] = listOfNums[i];
            listOfNums[i] = maximum;

            for (int num : listOfNums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        return listOfNums;
    }

    public static int[] insertionSort(int[] listOfNums) {
        /// INSERTION SORT
        int copyOfCurrentValue = 0;

        for (int i = 0; i < listOfNums.length - 1; i++) {
            copyOfCurrentValue = listOfNums[i + 1];
            for (int j = i; j >= 0; j--) {
                if (copyOfCurrentValue < listOfNums[j]) {
                    // shift
                    listOfNums[j + 1] = listOfNums[j];
                    if (j == 0)
                        listOfNums[j] = copyOfCurrentValue;

                } else {
                    // position for copyOfCurrentValue has been found
                    listOfNums[j + 1] = copyOfCurrentValue;
                    break;
                }

            }

            for (int num : listOfNums) {
                System.err.print(num + " ");
            }
            System.out.println();
        }

        return listOfNums;
    }

    public static void quickSort(int[] listOfNums, int low, int high) {
        if (low < high) {
            int pi = partition(listOfNums, low, high);

            quickSort(listOfNums, low, pi - 1);
            quickSort(listOfNums, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
