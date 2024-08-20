package outprint;

import app.StaffMember;

public class Printer {
    public static void print(StaffMember staffMember) {
        System.out.println("Connection........" + "\n Hello!!! User: " + "\n私はエヴァ、あなたの友達であり、助っ人です。" +
                "\nConnection........" + "\nI'm so Sorry! " + "\nI am Eva, your friend and assistant"
                + "\nLet me verify your data so we can continue working." +
                "\nName :" + staffMember.getFirstNameAndLastName() + "\nJob :" + staffMember.getJobTitle() + "\nMail :"
                + staffMember.getMail() + "\nPhone :" + staffMember.getPhone() + "\nAge :" + staffMember.getAge()
                + "\nConnection........" + "\nGreetings,Master!" + "With Love - WsKy Company." + "\nConnection........"
                + "\nSystem checkMethod........" + "\nSystem :");
    }
}

