package model.computer;

public class PC extends Computer {

    private int computerPower;

    public PC(String name, String type, Hdd hdd, Ram ram, int computerPower) {
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
        } else {
            System.out.println("Power supply is not enough");
        }
    }

    public void setComputerPower(int newComputerPower) {
        computerPower = newComputerPower;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            return 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }


    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}