package com.example.Places;
import java.util.ArrayList;

public class Goa extends Destination {
    private ArrayList<String> goaReviews = new ArrayList<>();

    public void viewNormalPackageDetails() {
        System.out.println("Goa Normal Package Details:");
        System.out.println("Cost: 10000 for 1 Day and 2 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 2 Nights Stay in 3 Star Hotel");
        System.out.println("2. Breakfast, Lunch, and Dinner");
        System.out.println("3. Pick and Drop from Your Location");
        System.out.println("4. Local Sightseeing");
        System.out.println("5. 24/7 Customer Support");
    }

    public void viewNormalFoodDetails() {
        System.out.println("Goa Normal Food Details:");
        System.out.println("1. Goan Fish Curry");
        System.out.println("2. Prawn Balchao");
        System.out.println("3. Bebinca (Dessert)");
    }

    public void viewLuxuryPackageDetails() {
        System.out.println("Goa Luxury Package Details:");
        System.out.println("Cost: 20000 for 3 Days and 4 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 4 Nights Stay in 5 Star Hotel");
        System.out.println("2. All-Inclusive Meals (Breakfast, Lunch, High Tea, Dinner)");
        System.out.println("3. Private Chauffeur-Driven Transport");
        System.out.println("4. Exclusive Sightseeing Tours");
        System.out.println("5. Complimentary Water Sports Activities");
    }

    public void viewLuxuryFoodDetails() {
        System.out.println("Goa Luxury Food Details:");
        System.out.println("1. Lobster Thermidor");
        System.out.println("2. Goan Pork Vindaloo");
        System.out.println("3. Crab Xec Xec");
    }

    public void viewCustomerReviews() {
        if (goaReviews.isEmpty()) {
            System.out.println("No reviews available for Goa yet.");
        } else {
            System.out.println("Customer Reviews for Goa:");
            for (String review : goaReviews) {
                System.out.println("- " + review);
            }
        }
    }

    public void addCustomerReview(String review) {
        goaReviews.add(review);
        System.out.println("Thank you for your review!");
    }

    public void viewLocalSightSeeing() {
        System.out.println("Goa Local Sightseeing:");
        System.out.println("1. Calangute Beach");
        System.out.println("2. Fort Aguada");
        System.out.println("3. Basilica of Bom Jesus");
        System.out.println("4. Dudhsagar Falls");
    }

    public void transportDetails() {
        System.out.println("Goa Transport Details:");
        System.out.println("1. Nearest Airport: Goa International Airport");
        System.out.println("2. Train Station: Madgaon Railway Station");
        System.out.println("3. Local Transport: Taxis, Buses, and Rental Bikes");
    }
}
