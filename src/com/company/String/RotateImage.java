package com.company.String;

public class RotateImage {
    public static void rotate(int[][] matrix) {

        int lenI = matrix.length;
        int lenJ = matrix[0].length;
        int[][] matrix1 = new int[lenI][lenJ];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

            



                int elemen = matrix[i][j];
                System.out.println(elemen);
            }
        }
    }
}

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
