public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        //integer array initialization
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++)
            ints[i] = i + 1;

        //double array initialization
        double[] doubles = {1.57, 7.654, 9.986};

        //boolean array initialization
        boolean[] someBooleans = new boolean[20];
        for (int i = 0; i < someBooleans.length; i++) {
            if ((i % 2) == 0)
                someBooleans[i] = true;
            else
                someBooleans[i] = false;
        }


    }
}