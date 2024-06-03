package model.computer;

public class PC extends Computer {

    private int computerPower;

    public PC(String name, String type, int hdd, int ram, int computerPower) {
        super(name, type, hdd, ram);
        this.computerPower = computerPower;
    }
    public void showName() {
        System.out.println(name);
    }
    @Override
    public void switchON() {
        System.out.println("Checking power supply");
        if (computerPower > 0) {
            super.switchON();
        }else{
            System.out.println("Power supply is not enough");
        }
    }

    public void setComputerPower(int newComputerPower) {
        computerPower = newComputerPower;
    }
}