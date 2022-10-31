package ru.mirea.task41.taskStep4;

public class Matrix {
    double[][] mat;
    int cols, rows;

    Matrix(int cols, int rows, double[][]mat){
        this.cols = cols;
        this.rows = rows;
        this.mat = mat;
    }

    public void Plus(double[][] mat2) {
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;
        double[][] res = new double[rows][cols];
        if (rows!=rows2 || cols != cols2) {
            System.out.println("Cant sum these matrix");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        this.mat = res;
        rows = mat.length;
        cols = mat[0].length;
    }
    public void Mult(double num) {
        double[][] res = new double[rows][cols];
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                res[i][j] = mat[i][j]*num;
            }
        }
        this.mat = res;
        rows = mat.length;
        cols = mat[0].length;
    }
    public String toString() {
        String answ = "\n\n{";
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                answ += mat[i][j] + (j != cols-1 ? ",   " : "");
            }
            answ += i != rows-1 ? ",\n\n" : "";
        }
        answ += "}";
        return answ;
    }
    public void Mult(double[][] mat2) {
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;
        double[][] res = new double[rows][cols2];
        if (cols != rows2) {
            System.out.println("Can't multiply these matrix");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int l = 0; l < cols; l++) {
                    res[i][j] += mat[i][l] * mat2[l][j];
                }
            }
        }
        this.mat = res;
        rows = mat.length;
        cols = mat[0].length;
    }
}
