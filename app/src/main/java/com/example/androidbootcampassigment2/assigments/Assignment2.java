package com.example.androidbootcampassigment2.assigments;

public class Assignment2 {

    //first question
    public double kilometerToMile(double km){
        return km * 0.621;
    }

    //second question
    public double calculateRectangle(double length,double width ){
        return  length * width;
    }

    //third question
    public int calculateFactorial(int n){
        if(n == 0){
            return  0;
        }else{
            int fact = 1;
            for (int i = n;i>=1;i--){
                fact = i * fact;
            }

            return fact;
        }
    }

    //forth question
    public int countLetterE(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                count++;
            }
        }
        return count;
    }

    //fifth question
    public double calculateInteriorAngles(int numSides){
        if (numSides < 3) {
            return 0;
        }else{
            return ((numSides - 2 ) * 180.0 ) / numSides;
        }
    }

    //sixth question
    public static double calculateSalary(int workDays) {
        int workHoursPerDay = 8;
        int overtimeHoursThreshold = 150;
        double hourlyWage = 40.0;
        double overtimeHourlyWage = 80.0;

        int totalWorkHours = workDays * workHoursPerDay;
        double totalSalary = totalWorkHours * hourlyWage;

        if (totalWorkHours > overtimeHoursThreshold) {
            int overtimeHours = totalWorkHours - overtimeHoursThreshold;
            totalSalary += overtimeHours * overtimeHourlyWage;
        }

        return totalSalary;
    }


    //seventh question
    public double calculateParkingFee(int hoursParked){
        double initalRate = 50.0;
        double additionalRate = 10.0;

        if(hoursParked == 0 ){
            return  0.0;
        }else if (hoursParked == 1){
            return  initalRate;
        }else{
           return initalRate + ((hoursParked - 1) * additionalRate);
        }
    }


}
