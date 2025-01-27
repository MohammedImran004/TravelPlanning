package com.example.Places;
import java.util.ArrayList;

public class AndamanAndNicobar extends Destination {
    private ArrayList<String> andamanReviews = new ArrayList<>();

    public void viewNormalPackageDetails() {
        System.out.println("Andaman and Nicobar Normal Package Details:");
        System.out.println("Cost: 15000 for 2 Days and 3 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 2 Nights Stay in 3 Star Hotel");
        System.out.println("2. Breakfast, Lunch, and Dinner");
        System.out.println("3. Pick and Drop from Your Location");
        System.out.println("4. Coral Reef Snorkeling");
        System.out.println("5. 24/7 Customer Support");
    }

    public void viewNormalFoodDetails() {
        System.out.println("Andaman and Nicobar Normal Food Details:");
        System.out.println("1. Fish Curry");
        System.out.println("2. Coconut Prawns");
        System.out.println("3. Tandoori Lobster");
    }

    public void viewLuxuryPackageDetails() {
        System.out.println("Andaman and Nicobar Luxury Package Details:");
        System.out.println("Cost: 30000 for 4 Days and 5 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 5 Nights Stay in 5 Star Resort");
        System.out.println("2. All-Inclusive Meals (Breakfast, Lunch, High Tea, Dinner)");
        System.out.println("3. Private Yacht Tour");
        System.out.println("4. Scuba Diving and Snorkeling");
        System.out.println("5. Beachside Private Dinner");
    }

    public void viewLuxuryFoodDetails() {
        System.out.println("Andaman and Nicobar Luxury Food Details:");
        System.out.println("1. Grilled Fish");
        System.out.println("2. Prawn Malai Curry");
        System.out.println("3. Coconut Ladoo (Dessert)");
    }

    public void viewCustomerReviews() {
        if (andamanReviews.isEmpty()) {
            System.out.println("No reviews available for Andaman and Nicobar yet.");
        } else {
            System.out.println("Customer Reviews for Andaman and Nicobar:");
            for (String review : andamanReviews) {
                System.out.println("- " + review);
            }
        }
    }

    public void addCustomerReview(String review) {
        andamanReviews.add(review);
        System.out.println("Thank you for your review!");
    }

    public void viewLocalSightSeeing() {
        System.out.println("Andaman and Nicobar Local Sightseeing:");
        System.out.println("1. Radhanagar Beach");
        System.out.println("2. Cellular Jail");
        System.out.println("3. Havelock Island");
        System.out.println("4. Ross Island");
    }

    public void transportDetails() {
        System.out.println("Andaman and Nicobar Transport Details:");
        System.out.println("1. Nearest Airport: Veer Savarkar International Airport");
        System.out.println("2. Boat Services: Ferry to nearby Islands");
        System.out.println("3. Local Transport: Taxis, Auto-Rickshaws");
    }
}
