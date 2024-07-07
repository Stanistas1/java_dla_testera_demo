package model;

import java.util.*;

public class UserList {
    public static void main(String[] args) {
       /* List<User> users = new ArrayList<User>();
        users.add(new User("Stachu", "Ska", "stachu.test@.pl", 17));
        users.add(new User("Tomek", "Kowalski", "tomek.test@.pl", 20));
        users.add(new User("Kasia", "Nowak", "kasia.test@.pl", 15));
        users.add(new User("Mariusz", "Nowak", "mariusz.test@.pl", 22));

        //   for (User user : users) {
        //        System.out.println(user.getFirstName());
        //   }

        //    Collections.sort(users, Comparator.comparing(User::getFirstName));
        //   System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());

        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }*/

   /*     Set<User> users = new HashSet<> ();
        users.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        users.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        users.add(new User("Tomek", "Testowy", "b@t.pl", 11));
        users.add(new User("Asia", "Testowa", "b@t.pl", 11));
        users.add(new User("Asia", "Jakaś", "b@t.pl",11 ));
        users.add(new User("Asia", "Ananimowa", "b@t.pl", 11));

  //      for (User user : users) {
  //          System.out.println(user.getFirstName() + " " + user.getLastName());
   //     }

        Set<User> sortedUser = new TreeSet<>(users);

        for (User user : sortedUser) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }*/

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Bartek1");
        names.put(10, "Bartek10");
        names.put(20, "Bartek20");
        names.put(0, "Bartek0");
        names.put(5, "Bartek5");

        // Map<Integer, String> sortedNames = new TreeMap<>(names);
        // System.out.println(sortedNames);

        // Map<Integer, String> sortedNames = new LinkedHashMap<>(names);
        // System.out.println(sortedNames);

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

