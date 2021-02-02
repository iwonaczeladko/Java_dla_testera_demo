package Module6.computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram, boolean isPowerSupply) {
        super(name, type, hdd, ram);
        this.isPowerSupply = isPowerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("There is no power supply");
        }
    }
}
