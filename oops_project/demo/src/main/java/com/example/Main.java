package com.example;
import java.util.Scanner;

import com.example.Admin.AdminDetails;
import com.example.Database.DestinationData;
import com.example.Hotel.Hotel;
import com.example.Hotel.LuxuryHotel;
import com.example.Hotel.NormalHotel;
import com.example.Places.AndamanAndNicobar;
import com.example.Places.Destination;
import com.example.Places.Goa;
import com.example.Places.HimachalPradesh;
import com.example.Places.Kerala;
import com.example.Places.Rajasthan;
import com.example.User.User;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdminDetails admin = new AdminDetails();
        User user = new User();
        Hotel luxury = new LuxuryHotel();
        Hotel normal = new NormalHotel();
        System.out.println("Welcome to the Travel Agency");
        System.out.println("Enter 1 you are a admin");
        System.out.println("Enter 2 you are a user");
        int admin = sc.nextInt();
        if(admin == 1){
            System.out.print("Enter your username and password:");
            String username = sc.next();
            String password = sc.next();
            if(admin.login(username, password)){
                System.out.println("Login successful");
                while(true){
                    System.out.println("Enter 1 to add a destination");
                    System.out.println("Enter 2 to add a hotel");
                    System.out.println("Enter 3 to view all destinations");
                    System.out.println("Enter 4 to view all hotels");
                    System.out.println("Enter 5 to view all users");
                    System.out.println("Enter 6 to view all reviews");
                    System.out.println("Enter 0 to exit");
                    int option = sc.nextInt();
                    try{
                        switch(option){
                            case 0:
                                System.out.println("Exiting admin panel.");
                                break;
                            case 1:
                                System.out.println("Enter the destination name:");
                                String destinationName = sc.next();
                                admin.addDestination(destinationName);
                                break;
                            case 2:
                                System.out.println("Enter the hotel name:");
                                String hotelName = sc.next();
                                admin.addHotel(hotelName);
                                break;
                            case 3:
                                admin.viewDestinations();
                                break;
                            case 4:
                                admin.viewHotels();
                                break;
                            case 5:
                                admin.viewUsers();
                                break;
                            case 6:
                                admin.viewReviews();
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    }catch(Exception e){
                        System.out.println("An error occurred: " + e.getMessage());
                        break;  // Breaks out of the while loop if an exception is caught
                    }
                }
                else{
                    System.out.println("Login failed. Please try again.");
                }
        }
        else{
            while (true) {
                System.out.println("Enter 1 for login And 2 for signup");
                int login = sc.nextInt();
                if (login == 1) {
                    System.out.println("Enter your username and password");
                    String useremail = sc.next();
                    String userpassword = sc.next();
                    sc.nextLine();
                    if (user.login(useremail, userpassword)) {
                        System.out.println("Login successful");
                        while (true) {
                            System.out.println("The Destinations Available in our Package Were:");
                            destinations.getAllDestinations();
                            System.out.println("Enter the destination you want to visit:");
                            int destinationChoice = sc.nextLine();

                    
                                      System.out.println("Enter Your Details to Book Your Travel:");
                                        System.out.println("Enter Your Name:");
                                        sc.nextLine();
                                        String name = sc.nextLine();
                                        System.out.println("Enter Your Age:");
                                        String age = sc.next();
                                        sc.nextLine();
                                        System.out.println("Enter Your Address:");
                                        String address = sc.nextLine();
                                        System.out.println("Enter Your Phone Number:");
                                        String phone = sc.next();
                                        System.out.println("Enter How Many Members Are Travelling:");
                                        int members = sc.nextInt();
                                        user.addUserDetails(useremail,userpassword,name, age, address, phone, members);
                                        System.out.println("Please select Your mode of Travel:");
                                        System.out.println("It Costs Extra If You Choose Flight Based On The Destination");
                                        System.out.println("Enter 1 for Train");
                                        System.out.println("Enter 2 for Flight");
                                        System.out.println("Enter 3 for Bus");
                                        int travelChoice = sc.nextInt();
                                        System.out.println("You Have "+members+" Members Travelling So Book Your Room Accordingly");
                                        if (travelChoice == 1) {
                                            System.out.println("You Have Selected Train");
                                            System.out.println("Your Travel is Booked Successfully");
                                        } else if (travelChoice == 2) {
                                            System.out.println("You Have Selected Flight Your Charges Will Be Added To Your Package");
                                            System.out.println("Your Travel is Booked Successfully");
                                        } else if (travelChoice == 3) {
                                            System.out.println("You Have Selected Bus");
                                            System.out.println("Your Travel is Booked Successfully");
                                        } else {
                                            System.out.println("Invalid Option");
                                        }
                                        System.out.print("Enter What Type Of Rooms You Need With its :");
                                        System.out.println("Enter 1 for Single Room");
                                        System.out.println("Enter 2 for Double Room");
                                        System.out.println("Enter 3 for Triple Room");
                                        int roomChoice = sc.nextInt();
                                        while(members>0){
                                            roomChoice = sc.nextInt();
                                            System.out.print("Enter Rooms According To Your Preferences");
                                            if (roomChoice == 1 && members>=1){
                                                System.out.println("How many Single Rooms You Need:");
                                                int singleRoom = sc.nextInt();
                                                System.out.println("You Have Booked "+singleRoom+" Single Rooms");
                                                members-=singleRoom;
                                                // user.RoomDetails("Single Room", singleRoom);
                                            }
                                            else if(roomChoice==2 && members>=2){
                                                System.out.println("How many Double Rooms You Need");
                                                int doubleRoom = sc.nextInt();
                                                // user.RoomDetails("Double Room",doubleRoom);
                                                members-=doubleRoom;
                                            }
                                            else if(roomChoice==3 && members>=3){
                                                System.out.println("How many Triple Rooms You Need:");
                                                int tripleRoom = sc.nextInt();
                                                // user.RoomDetails("Triple Room",tripleRoom);
                                                members-=tripleRoom;
                                            }
                                            else{
                                                System.out.println("Give Preference Based on the members");
                                            }
                                        }
                                        System.out.println("Your Package is Booked Successfully");
                            }
                            System.out.println("Enter 1 to view Normal Package Details");
                            System.out.println("Enter 2 to view Luxury Package Details");
                            System.out.println("Enter 3 to view Customer Reviews");
                            System.out.println("Enter 4 to add a review");
                            System.out.println("Enter 0 to exit");
                            int option = sc.nextInt();
                            int packageChoice = 0;
                            try {
                                switch (option) {
                                    case 0:
                                        System.out.println("Exiting destination details.");
                                        break;
                                    case 1:
                                        destination.viewNormalPackageDetails(destinationName);
                                        break;
                                    case 2:
                                        selectedDestination.viewLuxuryPackageDetails();
                                        break;
                                    case 3:
                                        selectedDestination.viewCustomerReviews();
                                        break;
                                    case 4:
                                        System.out.println("Enter your review:");
                                        String reviewText = sc.next();
                                        selectedDestination.addCustomerReview(reviewText);
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            } catch (Exception e) {
                                System.out.println("An error occurred: " + e.getMessage());
                                break;  // Breaks out of the while loop if an exception is caught
                            }
                        }
                    } else {
                        System.out.println("Login failed. Sign up with your respective details.");
                    }
                } else if (login == 2) {
                    System.out.println("Enter your username and password");
                    String usemail = sc.next();
                    String uspassword = sc.next();
                    user.signup(usemail, uspassword);
                    System.out.println("Signup successful. Please login to continue.");
                } else {
                    System.out.println("Invalid Option");
                }
            }
        }
        }
}
