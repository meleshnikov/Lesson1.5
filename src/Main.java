import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1

        //integer array initialization
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }

        //double array initialization
        double[] doubles = {1.57, 7.654, 9.986};

        //boolean array initialization
        boolean[] someBooleans = new boolean[20];
        for (int i = 0; i < someBooleans.length; i++) {
            if ((i % 2) == 0) {
                someBooleans[i] = true;
            } else {
                someBooleans[i] = false;
            }
        }

        //Task 2
        System.out.println("Task 2");

        //print integer array
        for (int i = 0; i < ints.length; i++) {
            if (i != (ints.length - 1)) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.println(ints[i]);
            }
        }


        //print double array
        for (int i = 0; i < doubles.length; i++) {
            if (i != (doubles.length - 1)) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }


        //print boolean array
        for (int i = 0; i < someBooleans.length; i++) {
            if (i != (someBooleans.length - 1)) {
                System.out.print(someBooleans[i] + ", ");
            } else {
                System.out.println(someBooleans[i]);
            }
        }

        //Task 3
        System.out.println("\n\nTask 3");

        //print reverse integer array
        for (int i = ints.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.println(ints[i]);
            }
        }


        //print reverse double array
        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }


        //print reverse boolean array
        for (int i = someBooleans.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(someBooleans[i] + ", ");
            } else {
                System.out.println(someBooleans[i]);
            }
        }


        //Task 4
        System.out.println("\nTask 4");
        for (int i = 0; i < ints.length; i++) {
            if ((ints[i] % 2) != 0) {
                ints[i]++;
            }
        }
        //print integer array
        for (int i = 0; i < ints.length; i++) {
            if (i != (ints.length - 1)) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.println(ints[i]);
            }
        }


        //Task 5
        System.out.println("\nTask 5");
        //matrix initialization
        int rowLength = 3;
        int columnLength = 3;
        int[][] matrix = new int[rowLength][columnLength];

        //matrix's diagonals filling
        int x = 1;
        for (int i = 0; i < Math.min(rowLength, columnLength); i++) {
            matrix[i][i] = x;
            matrix[i][columnLength - 1 - i] = x;
        }

        //print matrix
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
/*
        //Task 6
        System.out.println("\nTask 6");
        int[] sourceArray = {5, 4, 3, 2, 1};
        int[] resultArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            resultArray[i] = sourceArray[sourceArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(resultArray));
*/
        //Task 7
        System.out.println("\nTask 7");
        int[] sourceArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sourceArray));
        for (int i = 0, j = sourceArray.length - 1; i < j; i++, j--) {
            int temp = sourceArray[i];
            sourceArray[i] = sourceArray[j];
            sourceArray[j] = temp;
        }
        System.out.println(Arrays.toString(sourceArray));

        //Task 8
        System.out.println("\nTask 8");
        int[] intArray = {-6, 2, 5, -8, 8, 6, 4, -7, 12, 1};
        int[] result = new int[2];
        int targetSum = -2;
        boolean findSum = false;
        for (int i = 0; i < intArray.length; i++) {
            if (findSum){
                break;
            }
            for (int j = i + 1; j < intArray.length ; j++) {
                if (intArray[i] + intArray[j] == targetSum ){
                    result[0] = intArray[i];
                    result[1] = intArray[j];
                    findSum = true;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}