package Lesson14;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //функция которая заполняет двумерный массив!!! (меняет матрицу (ничего не возвращает) )
    static void fillMatrix(int[][] arr, int left, int right){
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {    //arr.lenght перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                arr[i][j] = gen.nextInt(right-left+1)+left;
            }
        }
    }

    //функция которая печатает двумерный массив!!!!
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {    //arr.lenght перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void task1(int[][] arr){
        for (int i = 0; i < arr.length; i++) {    //arr.lenght перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                arr[i][j] = 10*i;
            }
        }
    }

    static void task2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {    //arr.lenght перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                arr[i][j] = 5*j;
            }
        }
    }

    static void showString (int[][] arrayName, int k){
        if (k<0||k> arrayName.length-1){
            System.out.println("Ошибка. Нет такой строки");
        }
        else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.println(arrayName[k][i] + " ");
            }
        }
        System.out.println();
    }

    static void showString2 (int[][] arrayName, int     k){
        if (k<0||k>=arrayName[0].length){
            System.out.println("Ошибка. Нет такого столбца");
        }
        else {
            for (int i = 0; i < arrayName.length; i++) {
                System.out.println(arrayName[i][k] + " "); //номер строки меняется, номер столбца зафикирован на k!!!!
            }
        }
        System.out.println();
    } //покажи строку

    static void printEvenRows (int[][] arrayName){  //Row это  строка
        for (int i = 0; i < arrayName.length; i+=2) {    //arr.lenght перебирает количество строк в матрице
            for (int j = 0; j < arrayName[i].length; j++) {   //arr[i].lenght кол-во столбцов в строке
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int sumOfRow(int[][] arrayName,int k) {
        int sum=0;
            for (int j = 0; j < arrayName[k].length; j++) {
                sum += arrayName[k][j];
            }
        return sum;
    }


    //MAIN
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 4;
        final int m = 5;
        int[][] mas = new int[n][m];


        //fillMatrix(mas,0,10);
        //printMatrix(mas);

        //Matrix1. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы I-й строки имеют
        //значение 10·I (I = 1, . . ., M).
        //task1(mas);
        //printMatrix(mas);

        //Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы J-го столбца
        //имеют значение 5·J (J = 1, . . ., N).
        //task2(mas);
        //printMatrix(mas);

        //Matrix7◦
        //. Дана матрица размера M × N и целое число K (0 ≤ K ≤ M). Вывести
        //элементы K-й строки данной матрицы.
        //task2(mas);
//        fillMatrix(mas, 0,10);
//        printMatrix(mas);
//        System.out.print("Введите номер строки: ");
//        int k;
//        k = in.nextInt();
//        System.out.println(k+"-я строка");
//        showString(mas, k);

        //Matrix8. Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Вывести
        //элементы K-го столбца данной матрицы
//        fillMatrix(mas, 0,10);
//        printMatrix(mas);
//        System.out.print("Введите номер столбца: ");
//        int k;
//        k = in.nextInt();
//        System.out.println(k+"-й столбец");
//        showString2(mas, k);

        //Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные
        //в строках с четными номерами (2, 4, . . .). Вывод элементов производить
        //по строкам, условный оператор не использовать.
//        fillMatrix(mas,0,10);
//        printMatrix(mas);
//        System.out.println("Элементы расположенные в строках с четными номерами: ");
//        printEvenRows(mas);

        //Matrix17. Дана матрица размера M × N и целое число K (0 ≤ K ≤ M). Найти
        //сумму и произведение элементов K-й строки данной матрицы.
//        fillMatrix(mas, 1,5);
//        printMatrix(mas);
//        int k;
//        do {
//            System.out.print("Введите номер строки: ");
//            k = in.nextInt();
//        } while (k < 0 || k >= mas.length);
//        //int result = sumOfRow(mas, l);
//        System.out.println("Сумма элементов " + k + "-ой строки: " + sumOfRow(mas, k));

        //Matrix19. Дана матрица размера M × N. Для каждой строки матрицы найти
        //сумму ее элементов.
        //Сумма одной строки
        int k=1;
        //для всех строк
        for (int i = 0; i < mas.length; i++) { //идём по всем строкам


            //сумма одной строки
            int sum = 0;
            for (int j = 0; j < mas[k].length; j++) { //l`v gj jl
                sum += mas[k][j];
            }
            System.out.println(sum);
            System.out.println("Сумма "+ i + "-ой строки " + sumOfRow(mas,i));
        }






    }

}
