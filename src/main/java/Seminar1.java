import java.util.Arrays;
import java.util.Random;

import static java.util.Collections.list;

public class Seminar1 {


    public static void main(String[] args) {

        int i = randomNum();
        int n = maxBit (i);

        short maxValue = Short.MAX_VALUE;
        short minValue = Short.MIN_VALUE;
        int[] m1 = new int[maxValue - i];
        int[] m2 = new int[-minValue + i];

        System.out.println("i = " + i);
        System.out.println("n = " + n);
        System.out.println("Short.MIN_VALUE: " + minValue);
        System.out.println("Short.MAX_VALUE: " + maxValue);

        m1 = numFromIBeforeShortMaxValue(m1,i,maxValue,n);
        m2 = numFromShortMinValueBeforeI(m2,i,minValue,n);

        System.out.println("From 'i' before 'Max value': ");
        printArr(m1);
        System.out.println("From 'Min value' before 'i': ");
        printArr(m2);
    }


    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    static int maxBit (int i){
        int n = 1 << 11; // создали переменную n присвоили 1 и прибавили еденице 11 нулей
        while (i < n) n >>= 1; // в случае истины убираем один ноль от значение n
        return n;
    }
    static int randomNum (){
        int i = new Random().nextInt(2001);
        return i;
    }
    static int [] numFromIBeforeShortMaxValue(int[] arr,int i ,int maxValue, int n){
        int index = 0;
        for (int j = i; j <= maxValue; j++) {
            if (j % n == 0) {
                arr[index] = j;
            }
            index++;
        };
        return arr;
    }
    static int [] numFromShortMinValueBeforeI(int[] arr,int i ,int minValue, int n){
        int index = 0;
        for (int j = i; minValue <= j; minValue++) {
            if (minValue % n == 1 || minValue % n == -1) {
                arr[index] = minValue;
            }
            index++;
        }
        return arr;
    }

}



