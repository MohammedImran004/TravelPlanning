// package com.example.User;
// import java.util.ArrayList;
// import java.util.HashMap;
// public class User{
//     ArrayList<String> details = new ArrayList<>();
//     private HashMap<String, String> userLogindetails = new HashMap<>();
//     private ArrayList<ArrayList<String>> userdetails = new ArrayList<>();
//     public boolean login(String email, String password){
//         if(userLogindetails.containsKey(email)){
//             if(userLogindetails.get(email).equals(password)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public void signup(String email, String password){
//         userLogindetails.put(email, password);
//     }
//     public void addUserDetails(String name, String age, String address, String phone, int members){
//         System.out.println("Your Details are added Successfully");
//         details.add(name);
//         details.add(age);
//         details.add(address);
//         details.add(phone);
//         details.add(Integer.toString(members));
        
//         userdetails.add(details);
//     }
//     public void TransportDetails(String transport){
//         details.add(transport);
//         userdetails.add(details);
//     }
//     public void RoomDetails(String room,int Count){
//         details.add(room);
//         details.add(Integer.toString(Count));
//         userdetails.add(details);
//     }
//     public void RoomReviews(String reviews){
//         details.add(reviews);
//         userdetails.add(details);
//     }
// }
package com.example.User;

import com.example.Database.UserData;

public class User {
    private UserData userData;

    public User() {
        userData = new UserData();
    }

    public boolean login(String email, String password) {
        boolean isValid = userData.validateLogin(email, password);
        if (isValid) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid email or password.");
        }
        return isValid;
    }

    public void signup(String email, String password) {
        userData.saveLoginDetails(email, password);
        System.out.println("Signup successful!");
    }

    public void addUserDetails(String name, String age, String address, String phone, int members) {
        // userData.saveUserDetails(name, age, address, phone, members);
    }

    public void addTransportDetails(String transport) {
        // userData.saveTransportDetails(transport);
    }
}
