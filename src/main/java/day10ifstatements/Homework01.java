package day10ifstatements;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Input Password");
String password= scan.nextLine();
System.out.println("Input Day name");
String dayName= scan.nextLine();
System.out.println("Input a month number");
byte monthNumber= scan.nextByte();
String passwordCorrect ="pwd123!";



if (password.equals(passwordCorrect)){
    System.out.println("Valid");
}else{
    System.out.println("Please input a valid password");
}

if (dayName.equalsIgnoreCase("Sunday")){
    System.out.println(1);
}else if (dayName.equalsIgnoreCase("Monday")) {
    System.out.println(2);
}else if (dayName.equalsIgnoreCase("Tuesday")) {
    System.out.println(3);
}else if (dayName.equalsIgnoreCase("Wednesday")) {
    System.out.println(4);
}else if (dayName.equalsIgnoreCase("Thursday")) {
    System.out.println(5);
}else if (dayName.equalsIgnoreCase("Friday")) {
    System.out.println(6);
}else if (dayName.equalsIgnoreCase("Saturday")) {
    System.out.println(7);
}else{
    System.out.println("Invalid Data");
}

if (monthNumber==1){
    System.out.println("January");
} else if (monthNumber==2) {
    System.out.println("February");
}else if (monthNumber==3) {
    System.out.println("March");
}else if (monthNumber==4) {
    System.out.println("April");
}else if (monthNumber==5) {
    System.out.println("May");
}else if (monthNumber==6) {
    System.out.println("June");
}else if (monthNumber==7) {
    System.out.println("July");
}else if (monthNumber==8) {
    System.out.println("August");
}else if (monthNumber==9) {
    System.out.println("September");
}else if (monthNumber==10) {
    System.out.println("October");
}else if (monthNumber==11) {
    System.out.println("November");
}else if (monthNumber==12) {
    System.out.println("December");
}else{
    System.out.println("Please Input a valid month number");
}

    }
}
