import java.util.HashMap;
import java.util.Map;

public class HW2 {


    public static void main(String[] args) {

        Map<String, String> params1 = new HashMap<String, String>();
        params1.put("Name", "Ivanov");
        params1.put("Country", "Russia");
        params1.put("City", "Moscow");
        params1.put("Age", null);
        String s1 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}";
        String s2 = "{\"фамилия\":\"Семенов\",\"оценка\":\"3\",\"предмет\":\"Информатика\"}";
        String s3 = "{\"фамилия\":\"Карасев\",\"оценка\":\"4\",\"предмет\":\"ОБЖ\"}]";

        String str = s1 + s2 + s3;

        str = removeUnnecessary(str);

        Parsing(str);

        System.out.println(getQuery(params1));

    }

    public static void Parsing(String str) {
        Map<String, String> filters = new HashMap<>();
        String[] array = str.split(" ");
        for (String arrayPairs : array) {
            String[] pairs = arrayPairs.split(",");
            for (String pair : pairs) {
                String[] parts = pair.split(":");
                if (parts.length == 2) {
                    filters.put(parts[0], parts[1]);
                }
            }
            System.out.println("Студент " + filters.get("фамилия") + " получил " + filters.get("оценка") + " по предмету " + filters.get("предмет"));
        }


    }

    public static String removeUnnecessary(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replace("{", "");
        s = s.replace("}", " ");
        s = s.replace("\"", "");
        return s;
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();

    }

}



