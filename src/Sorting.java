import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        int[] unsortedNums = {6,5,2,8,9,4, 23, 13, 14, 17, 8};

        System.out.println("Before sorting");
        for (int num : unsortedNums) {
            System.out.print(num + " ");
        }

        int[] sortedNums = bubbleSort(unsortedNums);

        System.out.println("After sorting");
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] listOfNums){
        /// BUBBLE SORT - O(n)
        int steps = 0;
        ArrayList<Integer> sorted = new ArrayList<>();
        int bubble =  0;
        for (int i = 0; i < listOfNums.length - 1; i++) {
            for (int j = 0; j < listOfNums.length - i - 1; j++) {
                steps++;
                if(listOfNums[j] > listOfNums[j + 1]){
                    bubble = listOfNums[j];
                    listOfNums[j] = listOfNums[j + 1];
                    listOfNums[j + 1] = bubble;
                }
            }
        }
        System.out.println("\nNumber of steps taken by the Bubble Sort :" +  steps );
        return listOfNums;
    }

    public static int[] selectionSort(int[] listOfNums){
        int maximum = listOfNums[0];
        int size  = listOfNums.length;

        for (int i = 0; i < size - 1 ; i++) {
            if(listOfNums[i] > maximum){
                maximum = listOfNums[i];
            }
        }
    }
}
