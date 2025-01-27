package com.example.Places;
import java.util.ArrayList;

public class Rajasthan extends Destination {
    private ArrayList<String> rajasthanReviews = new ArrayList<>();

    public void viewNormalPackageDetails() {
        System.out.println("Rajasthan Normal Package Details:");
        System.out.println("Cost: 15000 for 3 Days and 4 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 3 Nights Stay in 3 Star Hotel");
        System.out.println("2. Breakfast, Lunch, and Dinner");
        System.out.println("3. Pick and Drop from Your Location");
        System.out.println("4. Visit to Jaipur, Udaipur, and Jodhpur");
        System.out.println("5. 24/7 Customer Support");
    }

    public void viewNormalFoodDetails() {
        System.out.println("Rajasthan Normal Food Details:");
        System.out.println("1. Dal Baati Churma");
        System.out.println("2. Gatte Ki Sabzi");
        System.out.println("3. Laal Maas");
    }

    public void viewLuxuryPackageDetails() {
        System.out.println("Rajasthan Luxury Package Details:");
        System.out.println("Cost: 30000 for 5 Days and 6 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 6 Nights Stay in 5 Star Heritage Hotel");
        System.out.println("2. All-Inclusive Meals (Breakfast, Lunch, High Tea, Dinner)");
        System.out.println("3. Private Chauffeur-Driven Transport");
        System.out.println("4. Camel Ride in the Desert");
        System.out.println("5. Exclusive Sightseeing of Forts and Palaces");
    }

    public void viewLuxuryFoodDetails() {
        System.out.println("Rajasthan Luxury Food Details:");
        System.out.println("1. Ker Sangri");
        System.out.println("2. Safed Maas");
        System.out.println("3. Mawa Kachori (Dessert)");
    }

    public void viewCustomerReviews() {
        if (rajasthanReviews.isEmpty()) {
            System.out.println("No reviews available for Rajasthan yet.");
        } else {
            System.out.println("Customer Reviews for Rajasthan:");
            for (String review : rajasthanReviews) {
                System.out.println("- " + review);
            }
        }
    }

    public void addCustomerReview(String review) {
        rajasthanReviews.add(review);
        System.out.println("Thank you for your review!");
    }

    public void viewLocalSightSeeing() {
        System.out.println("Rajasthan Local Sightseeing:");
        System.out.println("1. Amber Fort");
        System.out.println("2. City Palace, Udaipur");
        System.out.println("3. Jodhpur Mehrangarh Fort");
        System.out.println("4. Pushkar Lake");
    }

    public void transportDetails() {
        System.out.println("Rajasthan Transport Details:");
        System.out.println("1. Nearest Airport: Jaipur International Airport");
        System.out.println("2. Train Station: Jaipur Railway Station");
        System.out.println("3. Local Transport: Taxis, Camel Rides, Auto-Rickshaws");
    }
}
