public class dd {
    public static void main (String[] args) {
        int[][] array1= new int[10][5];
        int[][] array2= new int[10][5];
        method(array1);
    }

    static void method (int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
