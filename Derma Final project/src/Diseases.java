
import java.util.Scanner;

public class Diseases {

    // Properties to store diagnosis and treatment information
    private String name;
    private String treatment;

    // Method to ask patient questions about their skin condition
    public void askQuestions() {
	// Ask questions and store patient responses
	boolean hasRash = askYesNoQuestion("Do you have a rash?");
	boolean isItchy = askYesNoQuestion("Is the rash itchy?");
	boolean isPainful = askYesNoQuestion("Is the rash painful?");
	boolean hasBlisters = askYesNoQuestion("Are there blisters present?");

	// Determine the diagnosis based on the patient's responses
	if (hasRash && isItchy && !isPainful && !hasBlisters) {
	    name = "Eczema";
	    treatment = "Apply moisturizer and/or steroid cream.";
	} else if (hasRash && isItchy && isPainful && hasBlisters) {
	    name = "Herpes Zoster (Shingles)";
	    treatment = "Prescription antiviral medication and pain relief.";
	} else if (!hasRash && !isItchy && isPainful && hasBlisters) {
	    name = "Acnes";
	    treatment = "Apply toner and facial wash.";
	} else {
	    name = "Unknown disease";
	    treatment = "Please consult with your doctor for further evaluation.";
	}
	System.out.println("\nBased on your answers:\n, it appears that you have: " + name);
	System.out.println("To show the appropriate treatment, please select View Prescription (number 3) from the services menu.");
    }

    // Method to ask the patient a yes/no question and return their response
    public boolean askYesNoQuestion(String question) {
	// Print the question and ask for user input
	System.out.print(question + " (true or false) ");
	Scanner scanner = new Scanner(System.in);
	boolean response = scanner.nextBoolean();

	// Convert the user input to a boolean value
	return response;
    }

    // Method to display the diagnosis and treatment plan to the patient
    public String displayResult() {
	if (name == null) {
	    return "You don't have any cases. \nPlease make a new case first.";
	} else {
	    return "\nBased on your answers:\nIt appears that you have: " + name 
		    + "\nThe recommended treatment plan is: " + treatment + "\n";

	}
    }
}
