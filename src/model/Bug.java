package model;

import java.util.Objects;

public class Bug {
    private static String opisBledu;
    private static String email;
    private static int priorytetBledu;
    private static boolean statusBledu;
    public boolean showAllBugInfo;

    public Bug(String opisBledu, String email, int priorytetBledu) {
        Bug.opisBledu = opisBledu;
        Bug.email = email;
        this.priorytetBledu = priorytetBledu;
        this.statusBledu = false;
    }

    public static String getOpisBledu() {
        return opisBledu;
    }

    public void setOpisBledu(String opisBledu) {
        if (opisBledu.length() < 10) {
            System.out.println("Błedny opis błedu");
        } else {
            Bug.opisBledu = opisBledu;
        }
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Błędny email");
        } else {
            Bug.email = email;
        }
    }

    public void setPriorytetBledu(int priorytetBledu) {
        if (priorytetBledu >= 1 && priorytetBledu <= 5) {
            this.priorytetBledu = priorytetBledu;
        } else {
            throw new IllegalArgumentException("Priorytet błedu musi być od 1 do 5");
        }
    }

    public static boolean isStatusBledu() {
        return statusBledu;
    }

    public static void setStatusBledu(boolean statusBledu) {
        Bug.statusBledu = statusBledu;
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

    public int getPriorytetBledu() {
        return priorytetBledu;
    }

    public String showAllBugInfo() {
        return "Opis błędu: " + opisBledu + ", Email: " + email + ", Priorytet: " + priorytetBledu;
    }

    public Bug(boolean showAllBugInfo) {
        this.showAllBugInfo = showAllBugInfo;
    }

    public boolean isShowAllBugInfo() {
        return showAllBugInfo;
    }

    public void setShowAllBugInfo(boolean showAllBugInfo) {
        this.showAllBugInfo = showAllBugInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return showAllBugInfo == bug.showAllBugInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(showAllBugInfo);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "showAllBugInfo=" + showAllBugInfo +
                '}';
    }
}
