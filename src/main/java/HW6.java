

package org.example;


import javax.swing.text.html.HTMLDocument;
import java.util.*;


public class HW6 {
    public static void main(String[] args) {

        mySet<Integer> newSet = new mySet<>();

        System.out.println((newSet.add(4165)));
        System.out.println((newSet.add(4155565)));
        System.out.println((newSet.add(0)));
        System.out.println((newSet.add(4165)));
        System.out.println((newSet.add(0)));
        System.out.println(newSet);
        System.out.println(newSet);
        System.out.println(newSet.remove(4165));
        Iterator<Integer> iter = newSet.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.println();
        System.out.println(newSet.get(0));
        System.out.println(newSet.get(1));
        System.out.println(newSet.get(10));


    }
}

    class mySet<T> {
        private HashMap<T, Object> map = new HashMap<>();
        private static final Object OBJ = new Object();

        public boolean add(T value) {
            return map.put(value, OBJ) == null;
        }

        public boolean remove(T value) {
            return map.remove(value) != null;
        }

        public boolean isEmpty() {
            return map.isEmpty();
        }

        @Override
        public String toString() {
            return map.keySet().toString();
        }

        public Iterator<T> iterator() {
            return map.keySet().iterator();
        }

    public T get(Integer i) {
        ArrayList<T> setMy = new ArrayList<>();
        for (T item : map.keySet()) {
            setMy.add(item);
        }
        if (setMy.size() >= i) return setMy.get(i);
        return null;
    }
}

