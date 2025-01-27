package com.example.Places;
import java.util.ArrayList;

public class HimachalPradesh extends Destination {
    private ArrayList<String> himachalReviews = new ArrayList<>();

    public void viewNormalPackageDetails() {
        System.out.println("Himachal Pradesh Normal Package Details:");
        System.out.println("Cost: 12000 for 3 Days and 4 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 3 Nights Stay in 3 Star Hotel");
        System.out.println("2. Breakfast, Lunch, and Dinner");
        System.out.println("3. Pick and Drop from Your Location");
        System.out.println("4. Visit to Shimla and Manali");
        System.out.println("5. 24/7 Customer Support");
    }

    public void viewNormalFoodDetails() {
        System.out.println("Himachal Pradesh Normal Food Details:");
        System.out.println("1. Dham");
        System.out.println("2. Siddu");
        System.out.println("3. Chana Madra");
    }

    public void viewLuxuryPackageDetails() {
        System.out.println("Himachal Pradesh Luxury Package Details:");
        System.out.println("Cost: 22000 for 5 Days and 6 Nights");
        System.out.println("Facilities:");
        System.out.println("1. 6 Nights Stay in 5 Star Hotel");
        System.out.println("2. All-Inclusive Meals (Breakfast, Lunch, High Tea, Dinner)");
        System.out.println("3. Private Chauffeur-Driven Transport");
        System.out.println("4. Skiing and Snow Activities");
        System.out.println("5. Paragliding Adventure");
    }

    public void viewLuxuryFoodDetails() {
        System.out.println("Himachal Pradesh Luxury Food Details:");
        System.out.println("1. Sidu with Ghee");
        System.out.println("2. Trout Fish");
        System.out.println("3. Apple Cider (Dessert)");
    }

    public void viewCustomerReviews() {
        if (himachalReviews.isEmpty()) {
            System.out.println("No reviews available for Himachal Pradesh yet.");
        } else {
            System.out.println("Customer Reviews for Himachal Pradesh:");
            for (String review : himachalReviews) {
                System.out.println("- " + review);
            }
        }
    }

    public void addCustomerReview(String review) {
        himachalReviews.add(review);
        System.out.println("Thank you for your review!");
    }

    public void viewLocalSightSeeing() {
        System.out.println("Himachal Pradesh Local Sightseeing:");
        System.out.println("1. Shimla Ridge");
        System.out.println("2. Manali Solang Valley");
        System.out.println("3. Rohtang Pass");
        System.out.println("4. Kullu Valley");
    }

    public void transportDetails() {
        System.out.println("Himachal Pradesh Transport Details:");
        System.out.println("1. Nearest Airport: Bhuntar Airport (Kullu)");
        System.out.println("2. Train Station: Kalka Railway Station");
        System.out.println("3. Local Transport: Taxis, Buses");
    }
}
