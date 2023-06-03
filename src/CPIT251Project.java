
import static java.lang.System.exit;
import java.util.ArrayList;
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
public class CPIT251Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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

}
