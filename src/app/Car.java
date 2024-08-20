package app;

public class Car {

    public void start (){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Electricity system ready and started.");
    }
    private void startCommand(){
        System.out.println("The command system started");
    }
    private void startFuelSystem(){
        System.out.println("Fuel system started");
    }

    public static void main(String[] args) {
    }
}
