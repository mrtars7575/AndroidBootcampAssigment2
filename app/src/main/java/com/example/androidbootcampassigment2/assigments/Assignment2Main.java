package com.example.androidbootcampassigment2.assigments;

public class Assignment2Main {
    public static void main(String[] args) {
        Assignment2 assignment2 = new Assignment2();

        double kilometers = 10;
        double miles = assignment2.kilometerToMile(kilometers);
        System.out.println(kilometers + " kilometre " + miles + " mil eşittir.");

        double length = 5;
        double width = 8;
        double rectangleArea = assignment2.calculateRectangle(length, width);
        System.out.println("Dikdörtgenin alanı: " + rectangleArea);

        int number = 5;
        int factorial = assignment2.calculateFactorial(number);
        System.out.println(number + " sayısının faktoriyeli: " + factorial);

        String word = "elephant";
        int eCount = assignment2.countLetterE(word);
        System.out.println("Kelimenin içindeki 'e' harfi sayısı: " + eCount);

        int numSides = 5;
        double interiorAngles = assignment2.calculateInteriorAngles(numSides);
        System.out.println("İç açılar toplamı: " + interiorAngles + " derece");

        int workDays = 20;
        double salary = assignment2.calculateSalary(workDays);
        System.out.println("Toplam maaş: " + salary + " ₺");

        int hoursParked = 3;
        double parkingFee = assignment2.calculateParkingFee(hoursParked);
        System.out.println("Otopark ücreti: " + parkingFee + " ₺");
    }
}
