
import java.util.Scanner;

public class Derma {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	// Patient []
	Diseases newCase = new Diseases();
	Patient patient = null;
	int command;
	do {
	    showMenu();
	    command = in.nextInt();
	    switch (command) {
		case 1: // Create new profile
		    patient = createPatient(in);
		    System.out.println();
		    break;
		case 2: // View profile
		    if (patient == null) {
			System.out.println("Please create a profile first.");
		    } else {
			System.out.println(patient.toString());
		    }
		    System.out.println();
		    break;
		case 3: // New Case
		    newCase.askQuestions();
		    System.out.println();
		    break;
		case 4: // View Pre
		    System.out.println(newCase.displayResult());
		    System.out.println();
		    break;
		case 5: // Sce
		    int day = appointmentCalendar(in);
		    Appointment.bookAppointment(day);
		    System.out.println();
		    break;
	    }
	} while (command != 6);
	System.exit(0);
    }

    public static void showMenu() {
	System.out.println("----------------- Welcome to Derma -----------------");
	System.out.println(" ----------------- Services Menu ------------------");
	System.out.print("1. Create new Profile.\n"
		+ "2. View Profile.\n"
		+ "3. New Case.\n"
		+ "4. View prescription.\n"
		+ "5. Schedule An Appointment.\n"
		+ "6. Quit!\n"
		+ "----------------------------------------------------\n"
		+ "Choose the number of your desired service: ");
    }

    public static int appointmentCalendar(Scanner in) {
	System.out.println("\n-------------- Schedule an appointment -------------\n");
	System.out.println("-------------- June Calendar --------------\n");
	int month = 6;
	int year = 2023;
	Calendar.printMonthCalendar(month, year);
	System.out.println("\n----------------------------------------------------");

	System.out.print("Enter the date number of the requested day: ");
	int day = in.nextInt();
	
	return day;
    }

    public static Patient createPatient(Scanner in) {
	System.out.print("Please enter your full name (First name and Last name): ");
	String First_Name = in.next();
	String Last_Name = in.next();

	System.out.print("Please enter your ID: ");
	int ID = in.nextInt();

	System.out.print("Please enter your birth year: ");
	int birthYear = in.nextInt();

	System.out.print("Please enter your skin type: ");
	String Skin_Typ = in.next();

	System.out.print("Do you have any type of food allergy? (Enter true or false): ");
	boolean food_Allergy = in.nextBoolean();
	
	Patient patient = new Patient(First_Name, Last_Name, ID, birthYear, Skin_Typ, food_Allergy);
	System.out.println("Your profile has been created successfully!");

	return patient;
    }
}
