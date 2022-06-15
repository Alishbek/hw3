package com.alishbek;

public class Main {

    public static void main(String[] args) {
        double numbers[]={1.7, 2.45, -0.17, 44.5, 22.22, -9.34, -0.88, -31.322, 0.933, 7.64, 3.14, -4.2, -2.146, 5.32, 3.2};
        double sumOfPositiveNumbers = 0.0;
        int numberOfNumbers = 0;
        for (double currentsNumbers:numbers) {
        if(currentsNumbers>0){
             sumOfPositiveNumbers=sumOfPositiveNumbers+currentsNumbers;
             numberOfNumbers=numberOfNumbers+1;
        }else{continue;}
        }
        for (double currentsNumbers2:numbers) {
            if(currentsNumbers2>0){
                sumOfPositiveNumbers=sumOfPositiveNumbers-currentsNumbers2;
                numberOfNumbers=numberOfNumbers-1;
            }else{
                break;
            }
        }
        System.out.println(sumOfPositiveNumbers/numberOfNumbers);

    }
}
