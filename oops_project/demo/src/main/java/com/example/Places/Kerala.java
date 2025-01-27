package com.example.Places;
import java.util.ArrayList;

public class Kerala extends Destination {
    private ArrayList<String> keralaReviews = new ArrayList<>();

    public void viewNormalPackageDetails() {
        System.out.println("Kerala Normal Package Details:");
        System.out.println("Cost: 12000 for 2 Days and 3 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 2 Nights Stay in 3 Star Hotel");
        System.out.println("2. Breakfast, Lunch, and Dinner");
        System.out.println("3. Pick and Drop from Your Location");
        System.out.println("4. Houseboat Cruise");
        System.out.println("5. 24/7 Customer Support");
    }

    public void viewNormalFoodDetails() {
        System.out.println("Kerala Normal Food Details:");
        System.out.println("1. Kerala Sadya");
        System.out.println("2. Fish Curry");
        System.out.println("3. Appam with Stew");
    }

    public void viewLuxuryPackageDetails() {
        System.out.println("Kerala Luxury Package Details:");
        System.out.println("Cost: 25000 for 4 Days and 5 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 5 Nights Stay in 5 Star Hotel");
        System.out.println("2. All-Inclusive Meals (Breakfast, Lunch, High Tea, Dinner)");
        System.out.println("3. Private Chauffeur-Driven Transport");
        System.out.println("4. Exclusive Houseboat Tour");
        System.out.println("5. Ayurvedic Spa Treatment");
    }

    public void viewLuxuryFoodDetails() {
        System.out.println("Kerala Luxury Food Details:");
        System.out.println("1. Karimeen Pollichathu");
        System.out.println("2. Malabar Biriyani");
        System.out.println("3. Payasam (Dessert)");
    }

    public void viewCustomerReviews() {
        if (keralaReviews.isEmpty()) {
            System.out.println("No reviews available for Kerala yet.");
        } else {
            System.out.println("Customer Reviews for Kerala:");
            for (String review : keralaReviews) {
                System.out.println("- " + review);
            }
        }
    }

    public void addCustomerReview(String review) {
        keralaReviews.add(review);
        System.out.println("Thank you for your review!");
    }

    public void viewLocalSightSeeing() {
        System.out.println("Kerala Local Sightseeing:");
        System.out.println("1. Backwaters of Alleppey");
        System.out.println("2. Munnar Tea Gardens");
        System.out.println("3. Periyar Wildlife Sanctuary");
        System.out.println("4. Kochi Fort");
    }

    public void transportDetails() {
        System.out.println("Kerala Transport Details:");
        System.out.println("1. Nearest Airport: Trivandrum International Airport");
        System.out.println("2. Train Station: Kochi Railway Station");
        System.out.println("3. Local Transport: Taxis, Buses, and Houseboats");
    }
}
