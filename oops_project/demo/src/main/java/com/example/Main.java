package com.example;
import java.util.Scanner;

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
        User user = new User();
        Destination goa = new Goa();
        Destination kerala = new Kerala();
        Destination rajasthan = new Rajasthan();
        Destination himachal = new HimachalPradesh();
        Destination andaman = new AndamanAndNicobar();
        Hotel luxury = new LuxuryHotel();
        Hotel normal = new NormalHotel();
        while (true) {
            System.out.println("Enter 1 for login And 2 for signup");
            int login = sc.nextInt();
            if (login == 1) {
                System.out.println("Enter your username and password");
                String email = sc.next();
                String password = sc.next();
                if (user.login(email, password)) {
                    System.out.println("Login successful");
                    while (true) {
                        System.out.println("The Destinations Available in our Package Were:");
                        System.out.println("1. Goa");
                        System.out.println("2. Kerala");
                        System.out.println("3. Rajasthan");
                        System.out.println("4. Himachal Pradesh");
                        System.out.println("5. Andaman and Nicobar");
                        System.out.println("Enter the destination number to view details or 0 to exit:");
                        System.out.println("Enter 6 To Book Your Travel After Viewing The details:");
                        int destinationChoice = sc.nextInt();
                        if (destinationChoice == 0) {
                            System.out.println("Exiting destination selection.");
                            break;
                        }
                        Destination selectedDestination = null;
                        switch (destinationChoice) {
                            case 1: selectedDestination = goa; break;
                            case 2: selectedDestination = kerala; break;
                            case 3: selectedDestination = rajasthan; break;
                            case 4: selectedDestination = himachal; break;
                            case 5: selectedDestination = andaman; break;
                            case 6: 
                                 System.out.println("Enter Your Details to Book Your Travel:");
                                    System.out.println("Enter Your Name:");
                                    String name = sc.next();
                                    System.out.println("Enter Your Age:");
                                    String age = sc.next();
                                    System.out.println("Enter Your Address:");
                                    String address = sc.next();
                                    System.out.println("Enter Your Phone Number:");
                                    String phone = sc.next();
                                    System.out.println("Enter How Many Members Are Travelling:");
                                    int members = sc.nextInt();
                                    user.addUserDetails(name, age, address, phone, members);
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
                            default: 
                                System.out.println("Invalid Option");
                                continue;
                        }
                        System.out.println("Enter 1 to view Package Details");
                        System.out.println("Enter 2 to view Local Sightseeing");
                        System.out.println("Enter 3 to view Food Details");
                        System.out.println("Enter 4 to view Customer Reviews");
                        System.out.println("Enter 5 to add a review");
                        System.out.println("Enter 6 for normal package and 7 for luxury package");
                        System.out.println("Enter 0 to exit");
                        int option = sc.nextInt();
                        int packageChoice = 0;
                        if (option == 6 || option == 7) {
                            System.out.println("Enter 6 for normal package and 7 for luxury package");
                            packageChoice = sc.nextInt();
                        }
                        while(true){
                            switch (option) {
                                case 0:
                                    System.out.println("Exiting destination details.");
                                    break;
                                case 1:
                                    if (packageChoice == 6) {
                                        selectedDestination.viewNormalPackageDetails();
                                    } else if (packageChoice == 7) {
                                        selectedDestination.viewLuxuryPackageDetails();
                                    }
                                    break;
                                case 2:
                                    selectedDestination.viewLocalSightSeeing();
                                    break;
                                case 3:
                                    if (packageChoice == 6) {
                                        selectedDestination.viewNormalFoodDetails();
                                    } else if (packageChoice == 7) {
                                        selectedDestination.viewLuxuryFoodDetails();
                                    }
                                    break;
                                case 4:
                                    selectedDestination.viewCustomerReviews();
                                    break;
                                case 5:
                                    System.out.println("Enter your review");
                                    String reviewText = sc.next();
                                    selectedDestination.addCustomerReview(reviewText);
                                    break;
                                default:
                                    System.out.println("Invalid Option");
                            }
                        }
                    }
                } else {
                    System.out.println("Login failed. Sign up with your respective details.");
                }
            } else if (login == 2) {
                System.out.println("Enter your username and password");
                String email = sc.next();
                String password = sc.next();
                user.signup(email, password);
                System.out.println("Signup successful. Please login to continue.");
            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}
