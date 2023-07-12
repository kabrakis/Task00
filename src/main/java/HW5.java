
import java.io.IOException;
import java.util.*;


public class HW5 {
    public static HashMap book(HashMap<String, List<String>> phoneBook, String key, String value) {
        phoneBook.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        return phoneBook;
    }

    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> ponebook = new HashMap<>();

        ponebook = book(ponebook, "Иванов", "4897434");
        ponebook = book(ponebook, "Иванов", "68786");
        ponebook = book(ponebook, "Сидоров", "4648848");
        ponebook = book(ponebook, "Сидоров", "464558848");
        ponebook = book(ponebook, "Сидоров", "5");

        ponebook.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()))
                .forEach(System.out::println);
    }
}

