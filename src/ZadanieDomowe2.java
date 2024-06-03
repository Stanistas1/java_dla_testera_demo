import model.Bug;

public class ZadanieDomowe2 {
    public static void main(String[] args) {
        Bug bug = new Bug("This is new bug", "test@test", 1);

        System.out.println(bug.showAllBugInfo());

        bug.setOpisBledu("test");
        bug.setEmail("testtest");
        bug.setPriorytetBledu(9);

        bug.showAllBugInfo();
    }
}
