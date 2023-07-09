package homework5;

public class Array {

    //    Max value of array
    static int max(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    //    Min value of array
    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //    Sorting
    static void sort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //    index of
    static void indexOf(int[] arr, int n) {
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(i);
                break;
            }
        }

    }

    //    Delete value
    static void deleteVal(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                continue;
            }
            System.out.print(arr[i] + " ");

        }
    }

}
