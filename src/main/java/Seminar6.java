//import java.sql.Array;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//
//public class Seminar6 {
//    public static void main(String[] args) {
//        mySet<Integer> newSet = new mySet <>();
//        System.out.println(newSet.add(777));
//        System.out.println(newSet.add(333));
//        System.out.println(newSet.add(777));
//        System.out.println(newSet.add(555));
//        System.out.println(newSet.remove(555));
//
//        Iterator<Integer> iter = newSet.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//
//
//        }
//    }
//
//    class mySet<T> {
//        private HashMap<T, Object> map = new HashMap<>();
//        private static final Object OBJ = new Object();
//
//        public boolean add(T value) {
//            return map.put(value, OBJ) == null;
//        }
//
//        public boolean remove(T value) {
//            return map.remove(value) != null;
//        }
//
//        public boolean isEmpty() {
//            return map.isEmpty();
//        }
//
//        @Override
//        public String toString() {
//            return map.keySet().toString();
//        }
//
//        public Iterator<T> iterator() {
//            return map.keySet().iterator();
//        }
//    }
//}