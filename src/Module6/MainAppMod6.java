package Module6;

import Module6.computer.Laptop;
import Module6.computer.PC;

public class MainAppMod6 {

    public static void main(String[] args) {
        // - IS A - jest czymś = Dziedziczenie
        // - HAS A - posiada coś, składa się z czegoś = KOMPOZYCJA

        PC officeComputer = new PC("Office computer", "HP", 500, 128, false);
        Laptop gamingLaptop = new Laptop("Gaming laptop", "HP gaming", 500, 256, 0);

        gamingLaptop.setBatteryLevel(50);
        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
    }
}
