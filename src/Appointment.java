
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jana
 */
public class Appointment {

    String name;
    String sex;
    int phoneNum;
    Date birthDate;
    String DrName;
    Date Appointment;

    public Appointment(String name, String sex, int phoneNum, Date birthDate, Date Appointment, String DrName) {
        this.name = name;
        this.sex = sex;
        this.phoneNum = phoneNum;
        this.birthDate = birthDate;
        this.Appointment = Appointment;
        this.DrName = DrName;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getAppointment() {
        return Appointment;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String DrName) {
        this.DrName = DrName;
    }

    public void setAppointment(Date Appointment) {
        this.Appointment = Appointment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static void bookAppointment() {

        boolean appointments[] = new boolean[10];
        ArrayList<String> reserved = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        String user;
        String name;
        System.out.print("Enter 1 if you want to book an appointment  ");

        user = input.next();
        if (user.equals("1")) {
            for (int i = 0; i < appointments.length; ++i) {

                if (appointments[i] = false) {
                    System.out.println("sorry there is no available appointment");
                } else {
                    System.out.println("Enter your name");
                    name = input.next();
                    reserved.add(name);
                    appointments[i] = false;
                    System.out.println("The appointment has been reserved successfully for " + name);
                    exit(0);
                }

            }
        } else {
            System.out.println("sorry input is not valid");
        }

    }

    //-------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "-----------Appointment Details--------" + "\n"
                + "Name: " + name + "\n"
                + "Sex: " + sex + "\n"
                + "Phone Number: " + phoneNum + "\n"
                + "Birth Date: " + birthDate + "\n"
                + "Appointment Date: " + Appointment + "\n"
                + "Doctor Name: " + DrName;
    }

}
