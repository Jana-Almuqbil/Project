
import java.util.ArrayList;
import java.util.Scanner;

public class Appointment {

    String name;
    int phoneNum;
    int day;

    public Appointment(String name, int phoneNum, int day) {
	this.name = name;
	this.phoneNum = phoneNum;
	this.day = day;
    }

    public String getName() {
	return name;
    }

    public int getPhoneNum() {
	return phoneNum;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
    }

    public static void bookAppointment(int day) {
	Scanner input = new Scanner(System.in);
	ArrayList<Appointment> reserved = new ArrayList<Appointment>();
	String name;
	int phoneNum;

	if (day > 30) {
	    System.out.println("Sorry the date number is not correct");
	} else {
	    System.out.print("Enter your name: ");
	    name = input.next();
	    System.out.print("Enter your phone number: ");
	    phoneNum = input.nextInt();
	    Appointment newAppointment = new Appointment(name, phoneNum, day);
	    reserved.add(newAppointment);
	    System.out.println("The appointment has been reserved successfully for " + name);
	}
    }

    @Override
    public String toString() {	
	return "----------------------- Appointment -------------------------\n"
		+ "Patient name:" + name
		+ "\nPhone number: " + phoneNum
		+ "\nDate: " + day + "Jun 2023";
    }

    
}
