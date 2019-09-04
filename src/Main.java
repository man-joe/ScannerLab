/*
First Practice using Scanner class utility.
 */

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        String firstInitial, lastName, streetName, streetType, city;
        int houseNumber;

        Scanner sc = new Scanner(System.in);
        firstInitial = sc.next();
        lastName = sc.next();
        houseNumber = sc.nextInt();
        streetName = sc.next();
        streetType = sc.next();
        city = sc.next();

        //Print statements
        System.out.println("//PRINTING//");
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
