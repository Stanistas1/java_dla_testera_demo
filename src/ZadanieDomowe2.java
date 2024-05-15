public class ZadanieDomowe2 {
    public static void main(String[] args) {
        Bug bug1 = new Bug("Problem z JAVA", "test@@test", 3);
        bug1.showAllInfo();
        bug1.showEmail();
        bug1.showStatus();
        int priorytetBledu = bug1.getPriorytetBledu();
        System.out.println(priorytetBledu);
    }
}
