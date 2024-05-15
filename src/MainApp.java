public class MainApp {

    public static void main(String[] args) {
        User stachu = new User("Stachu", "Ska", "stachu.test@.pl", 17);
        stachu.getAllInfo();

        User tomek = new User("Tomek", "Kowalski", "tomek.test@.pl", 20);
        tomek.getAllInfo();
    }


}
