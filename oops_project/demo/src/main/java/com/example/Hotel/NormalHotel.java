package com.example.Hotel;
class NormalHotel extends Hotel{
    public void SingleRoom(){
        System.out.println("Single Room Details:");
        System.out.println("1. Cost: 2000 per night");
        System.out.println("2. Facilities:");
        System.out.println("   a. 1 Queen Size Bed");
        System.out.println("   b. Attached Bathroom");
        System.out.println("   c. Television");
        System.out.println("   d. Air Conditioning");
    }
    public void DoubleRoom(){
        System.out.println("Double Room Details:");
        System.out.println("1. Cost: 4000 per night");
        System.out.println("2. Facilities:");
        System.out.println("   a. 2 Queen Size Beds");
        System.out.println("   b. Attached Bathroom");
        System.out.println("   c. Television");
        System.out.println("   d. Air Conditioning");
    }
    public void SuiteRoom(){
        System.out.println("Suite Room Details:");
        System.out.println("1. Cost: 8000 per night");
        System.out.println("2. Facilities:");
        System.out.println("   a. 2 King Size Beds");
        System.out.println("   b. Attached Bathroom");
        System.out.println("   c. Television");
        System.out.println("   d. Air Conditioning");
        System.out.println("   e. Mini Bar");
        System.out.println("   f. Balcony with a view");
    }
}
