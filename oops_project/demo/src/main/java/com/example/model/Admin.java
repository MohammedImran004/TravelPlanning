package com.example.model;

public class Admin {
    private String name;
    private static String email;
        private static String password;
            private int id;
            public Admin() {}
            public Admin(String name, String email, String password) {
                this.name = name;
                this.email = email;
                this.password = password;
            }

            public Admin(int id, String name, String email, String password) {
                this.id = id;
                this.name = name;
                this.email = email;
                this.password = password;
            }
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            
            public static String getEmail() { return email; }
            public void setEmail(String email) { this.email = email; }
        
            public static String getPassword() { return password; }
            public void setPassword(String password) { this.password = password; }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Admin [name=" + name + ", id=" + id + "]";
    }
    
    
}
