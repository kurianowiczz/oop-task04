package by.bntu.fitr.poisit.task.model.entity;

public class Matrix {
    public static final int DEFAULT_SIZE = 5;

    private int[][] array;

    public Matrix() {
        array = new int[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public Matrix(int[][] array) {

        this.array = array;
    }

    public Matrix(int rows, int columns){

        array = new int[rows][columns];
    }

    public Matrix(int size){
        this(size, size);
    }

    public Matrix(Matrix matrix){ //конструктор копирования
        this(matrix.array.length, matrix.array[0].length);
        for(int i = 0; i < matrix.array.length; i++){
            for(int j = 0; j < matrix.array[i].length; j++){
                array[i][j] = matrix.array[i][j];
            }
        }
    }

    public int getCountRows(){
        return array.length;
    }

    public int getCountColumns(){
        return array[0].length;
    }

    public int getElement(int i, int j) {
        return array[i][j];
    }

    public void setElement(int i, int j, int value) {
        array[i][j] = value;
    }

    @Override
    public boolean equals(Object o) {
        try {
            if (o instanceof Matrix) {
//o = (Matrix)o;
                if (((Matrix) o).getCountRows() != this.getCountRows()) {
                    return false;
                } else {
                    for(int i = 0; i < this.array.length; i++) {
                        for(int j = 0; j < this.array.length; j++) {
                            if (this.array[i][j] != ((Matrix) o).getElement(i, j)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } else {
                return false;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            if (((Matrix) o).getCountRows() == this.getCountRows()){
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < array.length; i++ ){
            for(int j = 0; j < array.length; j++){
                builder.append(array[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
