import model.computer.*;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

           /*     PC officeComputer1 = new PC("Office Computer 1", "HP", 500, 128, 0);
        Computer officeComputer2 = new PC("Office Computer 2", "HP", 500, 128, 0);
        Computer officeComputer3 = new PC("Office Computer 3", "HP", 500, 128, 0);
        Computer gaminigLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);
        Computer macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);

        officeComputer1.volumeUp();

        System.out.println(officeComputer1.getVolumeLevel());

        officeComputer1.volumeUp(50);

        System.out.println(officeComputer1.getVolumeLevel());

      /* System.out.println(officeComputer1.volumeUp());
        System.out.println(officeComputer1.volumeUp());

        System.out.println(officeComputer1.volumeDown());
        System.out.println(officeComputer1.volumeDown());
        System.out.println(officeComputer1.volumeDown());

        System.out.println(gaminigLaptop.volumeUp());
        System.out.println(gaminigLaptop.volumeUp());

        System.out.println(gaminigLaptop.volumeDown());
        System.out.println(gaminigLaptop.volumeDown());
        System.out.println(gaminigLaptop.volumeDown());*/

     /*   officeComputer.switchON();
        System.out.println(officeComputer.getState());

        gaminigLaptop.setBatteryLevel(0);
        gaminigLaptop.switchON();
        System.out.println(gaminigLaptop.getState());

        officeComputer.setComputerPower(0);
        officeComputer.switchON();
        System.out.println(officeComputer.getState());*/

     /*   Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gaminigLaptop, macbook};

        for (Computer computer : computers) {
            computer.switchOFF();
        }

        officeComputer1.showName();
        ((PC)officeComputer2).showName();*/

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA",120);

        Computer mac = new Laptop("Mac", "Pro", hdd, ram, 100);

        System.out.println(mac.getRam().getSize());
    }
}
