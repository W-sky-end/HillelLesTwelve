package app;


public class StaffMember {
    private String firstNameAndLastName;
    private String jobTitle;
    private String mail;
    private String phone;    // прочитал интересную вещь что № телефона делают в String так как это более удобно для памяти и ввода
    private int age;

    public StaffMember(String firstNameAndLastName, String jobTitle, String mail, String phone, int age) {
        this.firstNameAndLastName = firstNameAndLastName;
        this.jobTitle = jobTitle;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        StaffMember staffMember = new StaffMember("Morning Star", "chief of hell",
                "hellgate@gmail.com", "+380666000000", 999999);
        Printer.print(staffMember);

        Car car = new Car();
        car.start();
    }
}