import java.util.ArrayList;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(50) + 1);
        }
        temp.addAll(integers);
        System.out.println("Список: " + integers);
        System.out.println("Список после удаления четных элементов: " + removeEvenElem(integers));
        System.out.println("Минимальный элемент списка: " + minElm(temp));
        System.out.println("Максимальный элемент списка: " + maxElm(temp));
        System.out.println("Среднее значение элементов списка: " + averageValue(temp));
    }

    public static ArrayList<Integer> removeEvenElem(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                temp.add(arr.get(i));
            }
        }
        arr.removeAll(temp);
        return arr;
    }

    public static Integer minElm(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int values = 0;
        for (int i = 0; i < arr.size(); i++) {
            values = arr.get(i);
            if (values < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static Integer maxElm(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int values = 0;
        for (int i = 0; i < arr.size(); i++) {
            values = arr.get(i);
            if (values > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static Double averageValue(ArrayList<Integer> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        sum = sum / arr.size();
        return sum;
    }
}
