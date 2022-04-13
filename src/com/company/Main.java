package com.company;

public class Main {

    public static void main(String[] args) {

        Hotel hilton =  new Hotel("Hilton Erevan", new Hotel__Address("Grigor Lusavorich",
                "011555333", "4/2", "example@gmail.com"), "4.7 astx", "chuni",
                "uni", "uni", "uni", "chuni", new LuxeRoome("for two people", "ka", "ka",
                "ka", "ka", "chka", "ka", "chka", "chka", "dkuygh", 4.5f,
                "gkjlbjkl", "tgjfgjfjg", "fjfrj", "ddhdgh", "trur", "dyry", "fjfjg",
                "fhkjj", "so;jfdg"), new Room("2", "ka", "ka", "chka", "chka", "chka", "chka",
                "ka", "ka", "chka", 4.6f));

        System.out.println(hilton);
        System.out.println("Hello");

    }
}
