package by.bntu.fitr.poisit.task.model.logic;

import by.bntu.fitr.poisit.task.model.entity.Matrix;

public class Logic {
    public static void sort(Matrix matrix) {
        try {
            int[] sum = new int[matrix.getCountRows()];
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                int currSum = 0;
                for (int i = 0; i < matrix.getCountRows(); i++) {
                    currSum += Math.abs(matrix.getElement(i, j));
                }
                sum[j] = currSum;
            }
            for (int a = 0; a < sum.length - 1; a++) {
                for (int j = 0; j < matrix.getCountColumns() - 1; j++) {
                    if (sum[j] < sum[j + 1]) {
                        int tempJ = sum[j];
                        sum[j] = sum[j + 1];
                        sum[j + 1] = tempJ;
                        for (int i = 0; i < matrix.getCountRows(); i++) {
                            int temp = matrix.getElement(i, j);
                            matrix.setElement(i, j, matrix.getElement(i, j + 1));
                            matrix.setElement(i, j + 1, temp);
                        }
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            return;
        }
    }

}
