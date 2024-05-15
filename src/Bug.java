public class Bug {
    static String opisBledu;
    static String email;
    static int priorytetBledu;
    static boolean statusBledu;

    public Bug(String opisBledu, String email, int priorytetBledu) {
        this.opisBledu = opisBledu;
        this.email = email;
        this.priorytetBledu = priorytetBledu;
        this.statusBledu = false;
    }

    public static void showAllInfo() {
        System.out.println("Opis błędu: " + opisBledu + " Email: " + email + " Priorytet:  " + priorytetBledu
                + " Status: " + statusBledu);
    }

    public static void showEmail() {
        System.out.println("Email: " + email);
    }

    public static void showStatus() {
        System.out.println("Status: " + statusBledu);
    }

    int getPriorytetBledu() {
        return priorytetBledu;
    }
}
