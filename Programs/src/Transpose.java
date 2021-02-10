public class Transpose {
    public static void main(String[] args) {
        int r1 = 2, c1 = 4;
        int[][] firstMatrix = {{3, 5, 8, 1}, {3, 7, 4, 6}};
        System.out.println("Before Transpose");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                System.out.print(firstMatrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("After Transpose");
        int[][] Tp = new int[c1][r1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                Tp[j][i] = firstMatrix[i][j];

            }
        }
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {

                System.out.print(Tp[i][j]+" ");

            }
            System.out.println();
        }

    }

}
