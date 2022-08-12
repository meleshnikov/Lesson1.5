public class Main {
    public static void main(String[] args) {
        //Task 1

        //integer array initialization
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 1;
        }

        //double array initialization
        double[] doubles = {1.57, 7.654, 9.986};

        //boolean array initialization
        boolean[] someBooleans = new boolean[20];
        for (int i = 0; i < someBooleans.length; i++) {
            if ((i % 2) == 0){
                someBooleans[i] = true;
            }
            else{
                someBooleans[i] = false;
            }
        }

        //Task 2
        System.out.println("Task 2");

        //print integer array
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println(ints[ints.length - 1]);

        //print double array
        for (int i = 0; i < doubles.length - 1; i++) {
            System.out.print(doubles[i] + ", ");
        }
        System.out.println(doubles[doubles.length - 1]);

        //print boolean array
        for (int i = 0; i < someBooleans.length - 1; i++) {
            System.out.print(someBooleans[i] + ", ");
        }
        System.out.println(someBooleans[someBooleans.length - 1]);

        //Task 3
        System.out.println("\nTask 3");

        //print reverse integer array
        for (int i = ints.length - 1; i > 0; i--) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println(ints[0]);

        //print reverse double array
        for (int i = doubles.length - 1; i > 0; i--) {
            System.out.print(doubles[i] + ", ");
        }
        System.out.println(doubles[0]);

        //print reverse boolean array
        for (int i = someBooleans.length - 1; i > 0; i--) {
            System.out.print(someBooleans[i] + ", ");
        }
        System.out.println(someBooleans[0]);


        //Task 4
        System.out.println("\nTask 4");
        for (int i = 0; i < ints.length; i++) {
            if ((ints[i] % 2) != 0) {
                ints[i]++;
            }
        }
        //print integer array
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println(ints[ints.length - 1]);


        //Task 5
        System.out.println("\nTask 5");
        //matrix initialization
        int rowLength = 3;
        int columnLength = rowLength;
        int[][] matrix = new int[rowLength][columnLength];

        //matrix's diagonals filling
        int x = 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = x;
            matrix[i][matrix.length - i - 1] = x;
        }

        //print matrix
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}