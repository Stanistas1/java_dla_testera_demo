import model.computer.Laptop;
import model.computer.PC;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office Computer", "HP", 500, 128, 0);
        Laptop gaminigLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

        officeComputer.switchON();
        System.out.println(officeComputer.getState());

        gaminigLaptop.setBatteryLevel(0);
        gaminigLaptop.switchON();
        System.out.println(gaminigLaptop.getState());

        officeComputer.setComputerPower(0);
        officeComputer.switchON();
        System.out.println(officeComputer.getState());
    }
}
