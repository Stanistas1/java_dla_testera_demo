import model.User;

public class MainApp {

    public static void main(String[] args) {
    /*    model.User stachu = new model.User("Stachu", "Ska", "stachu.test@.pl", 17);
        stachu.getAllInfo();

        model.User tomek = new model.User("Tomek", "Kowalski", "tomek.test@.pl", 20);
        tomek.getAllInfo();


        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        String s = str1.toUpperCase();
        System.out.println(s);

        String s1 = str2.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));

        System.out.println(str1.contains("ll"));

        System.out.println("  g".isBlank());
        System.out.println("  ".isEmpty());

        String replace = str1.replace("lo", "QWE");
        System.out.println(replace);

        String s2 = str1.replaceAll("l", "X");
        System.out.println(s2);

        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String textWithWhiteSpaces = "    to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());

        User user = new User("Stachu", "Ska", "test@test.pl", 17);
        System.out.println(user.firstName);
        System.out.println(user.isUserAdult());
        System.out.println(user.getEmail());

        user.setEmail("test1@test1.ru");
        System.out.println(user.getEmail());*/

       /* String[] names = new String[5];

        ["Bartek", "Marcin", "Asia", "Monika", "Tomek"]
        names[0] = "Bartek";
        names[1] = "Marcin";
        names[2] = "Asia";
        names[3] = "Monika";
        names[4] = "Tomek";
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }*/

        //   int [] numebrs = new int[10];

        //    int [] newNumbers = {1, 2, 3, 4, 5};


     /*   User u1 = new User("Bartek", "Testpwy", "b@test.com", 17);
        User u2 = new User("Bartek", "Testpwy", "b@test.com", 17);
        User u3 = new User("Bartek", "Testpwy", "b@test.com", 17);
        User u4 = new User("Bartek", "Testpwy", "b@test.com", 17);

        System.out.println(User.getUserCountert());*/

        User bartek = new User("Bartek", "Testowy", "b@t.pl", 20);
        User bartek1 = new User("Bartek", "Testowy", "b@t.pl", 20);

        System.out.println(bartek);
        System.out.println(bartek.equals(bartek1));
    }
}
