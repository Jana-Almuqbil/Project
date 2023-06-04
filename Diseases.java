
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
            treatment = "Apply moisturizer and/or steroid cream";
        } else if (hasRash && isItchy && isPainful && hasBlisters) {
            name = "Herpes Zoster (Shingles)";
            treatment = "Prescription antiviral medication and pain relief";
        } else {
            name = "Unknown";
            treatment = "Please consult with your doctor for further evaluation";
        }
    }

    // Method to ask the patient a yes/no question and return their response
    private boolean askYesNoQuestion(String question) {
        // Print the question and ask for user input
        System.out.println(question + " (yes or no)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().trim();

        // Convert the user input to a boolean value
        return response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
    }

    // Method to display the diagnosis and treatment plan to the patient
    public String getResult() {         
   String result = "Based on your answers, it appears that you have " + name + ". ";
   result += "The recommended treatment plan is: " + treatment;
   return result;
}

   
    }

    
