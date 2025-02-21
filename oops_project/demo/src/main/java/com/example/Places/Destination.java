package com.example.Places;

public class Destination {

    // Method to view normal package details for the given location (table name)
    public void viewNormalPackageDetails(String location) {
        System.out.println("Viewing normal package details for " + location);
        // Call to database class to retrieve details
        DatabaseHandler.getPackageDetails(location, "Normal");
    }

    // Method to view luxury package details for the given location (table name)
    public void viewLuxuryPackageDetails(String location) {
        System.out.println("Viewing luxury package details for " + location);
        // Call to database class to retrieve details
        DatabaseHandler.getPackageDetails(location, "Luxury");
    }

    // Method to view customer reviews for the given location (table name)
    public void viewCustomerReviews(String location) {
        System.out.println("Viewing customer reviews for " + location);
        // Call to database class to retrieve reviews
        DatabaseHandler.getCustomerReviews(location);
    }

    // Method to add customer review for the given location (table name)
    public void addCustomerReview(String location, String review) {
        System.out.println("Adding customer review for " + location);
        // Call to database class to add the review
        DatabaseHandler.addCustomerReview(location, review);
    }
}
