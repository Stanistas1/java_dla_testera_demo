package model.computer;

abstract public class Computer {

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchON() {
        System.out.println("Super - ustawiam pole state na true");
        state = true;
    }

    public void switchOFF() {
        System.out.println("Wyłączam komputer: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }


    public abstract int volumeUp();

    public abstract int volumeUp(int newVolumeLevel);

    public abstract int volumeDown();

    public abstract int volumeDown(int newVolumeLevel);

}
