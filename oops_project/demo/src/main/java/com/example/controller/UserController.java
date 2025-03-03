package com.example.controller;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import com.example.dao.UserDAO;
import com.example.model.Booking;
import com.example.model.User;
import com.example.view.UserView;
public class UserController {
    private Scanner sc ;
    private User user;
    private UserDAO userdao;
    private UserView userview;
    private DestinationController destinationcontroller;
    private HotelController hotelController;
    public UserController() {
        this.sc = new Scanner(System.in);
        this.user = new User();
        this.userdao = new UserDAO();
        this.userview = new UserView();
        this.destinationcontroller = new DestinationController();
        this.hotelController = new HotelController();
    }
    public void login(){
        System.out.print("Enter email:");
        String username = sc.next();
        System.out.print("Enter Password");
        String password = sc.next();
        user = userdao.getbyUsername(username);
        if(user!=null){
            if(user.getEmail().equals(username) && user.getPassword().equals(password)){
                while (true) { 
                userview.displayMenu();
                int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            destinationcontroller.viewDestinations();
                            break;
                        case 2:
                            System.out.print("Enter destination id to view the respective hotels:");
                            hotelController.viewHotelsByDestinationId();
                            break;  
                        case 3:
                            addBooking(user.getId());
                            System.out.print("Booking added successfully!");
                            return;
                        case 4:
                            return;
                        default:
                            System.out.print("Invalid Choice:");
                            break;
                    }
                }
            }
            else{
                System.out.print("Invalid Credentials:");
                signup();
            }
        }
        else{
            System.out.print("User not found:");
            signup();
        }
    }
    public void signup(){
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        String email,password;
        while (true) { 
            System.out.println("Enter email");
            email = sc.nextLine();
            if(email.contains("@")){
                while(true){
                    System.out.println("Enter Password");
                    password = sc.next();
                    if(password.length()>6){
                        break;
                    }
                    else{
                        System.out.print("Enter Password length greater than 6 characters to be considered as strong password");
                        continue;
                    }
                }
                break;
            }
            else{
                System.out.print("Enter email in Proper format ex abc@gmail.com: ");
                continue;
            }
        }
        user = new User(name, email,password);
        userdao.SignupUser(user);
    }
    public void addBooking(int id) {
        
        System.out.print("Enter Destination ID: ");
        int destinationId = sc.nextInt();
    
        System.out.print("Enter Hotel ID: ");
        int hotelId = sc.nextInt();
    
        sc.nextLine();  // Consume the newline character
    
        System.out.print("Enter Travel Mode (Bus/Train/Flight): ");
        String travelMode = sc.nextLine();  // Read the full line
    
        LocalDate bookingDate = null;
        while (true) {
            System.out.print("Enter Booking Date (YYYY-MM-DD): ");
            String dateInput = sc.next();
            
            try {
                bookingDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate currentDate = LocalDate.now();
    
                if (bookingDate.isAfter(currentDate)) {
                    break;  // Valid date, exit the loop
                } else {
                    System.out.println("Booking date must be after the current date. Please enter a valid date.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter a valid date in YYYY-MM-DD format.");
            }
        }
        Booking booking = new Booking(id, destinationId, hotelId, travelMode, hotelId, bookingDate.toString());
    
        // Use the userdao instance to call addBooking()
        if (userdao.addBooking(booking)) {
            System.out.println("Booking added successfully!");
        } else {
            System.out.println("Failed to add booking.");
        }
    }
}
