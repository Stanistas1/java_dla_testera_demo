import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAppCollection {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Bartek");
        names.add("Tomek");
        names.add("Stachu");
        names.add("Kasia");

        names1.add("Bartek");
        names1.add("Kasia");

        System.out.println(names);

        //    for (String name : names) {
        //       System.out.println(name);
        //   }

        //    names.remove("Bartek");
        //     System.out.println(names);

        //  String name = names.get(1);
        //   System.out.println(name);

        //   System.out.println(names.size());

        //    names.isEmpty();
        //    names.contains("Bartek");

        names.addAll(names1);
        System.out.println(names);

        names.remove(names1);
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);
    }
}
