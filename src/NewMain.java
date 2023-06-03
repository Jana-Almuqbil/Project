
import static java.lang.System.exit;
import java.util.ArrayList;
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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        reservation();
        Appointment.bookAppointment();

    }

//    public static void reservation() {
//
//        int appointments = 10;
//        List<String> BookingList = new ArrayList<String>();
//        Scanner input = new Scanner(System.in);
//
//        int appointment;
//        int exit;
//
//        for (int i = 0; i < appointments; i++) {
//
//            System.out.println("Enter 1 if you want to book an appointment:");
//            appointment = input.nextInt();
//            if (appointment == 1) {
//
//                System.out.println("Name:");
//                String name = input.nextLine();
//                BookingList.add(name);
//
//                appointments--;
//
//            }
//            System.out.println("Enter 0 if you want to exit booking:");
//            exit = input.nextInt();
//            if(exit==0){
//            exit(0);
//            }
//        }
//        System.out.println("no unavailable appointments");
//
//        System.out.println("Name: " + BookingList);
//
//    }
}
