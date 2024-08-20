package app;

public class Main {
    public static void main(String[] args) {
        StaffMember staffMember = new StaffMember("Morning Star", "chief of hell",
                "hellgate@gmail.com", "+380666000000", 999999);
        Printer.print(staffMember);

        Car car = new Car();
        car.start();
    }
}
