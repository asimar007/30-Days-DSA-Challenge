import java.util.*;

public class Destination_City {
    public static String destCity(List<List<String>> paths) {
        Set<String> st = new HashSet<>();

        for (List<String> path : paths) {
            String source = path.get(0);
            st.add(source);
        }

        for (List<String> path : paths) {
            String dest = path.get(1);

            if (!st.contains(dest)) {
                return dest;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        String destination = destCity(paths);

        System.out.println("Destination city: " + destination);
    }
}
