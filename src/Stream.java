import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Tom");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");
        names.add("Max");

        /*names.stream()
                .filter(name -> name.startsWith("F"))
                .filter(name -> name.contains("k"))
                .filter(name -> name.endsWith("s"))
                .sorted()
                .forEach(System.out::println);

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.length() <= 3)
                .map(name -> "Short name " + name)
                .forEach(System.out::println);

        long count = names.stream()
                .filter(name -> name.length() <= 3)
                .count();
        System.out.println(count);

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));
        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 2);
        System.out.println(allMatch);

        boolean noneMatch = names.stream()
                .noneMatch(s -> s.endsWith(("ski")));
        System.out.println(noneMatch);*/

        List <String> fNames = names.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(fNames);

    }
}
