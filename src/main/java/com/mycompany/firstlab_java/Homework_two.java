/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstlab_java;

/**
 *
 * @author hnaji
 */
public class Homework_two {
    
    public static void main(String[] args){
        //session 6
    String myString="My Name is Hana";
    int studentNumber=12;
    int teacherNumber=3;
    System.out.println(myString);
    System.out.println("My Name is Hana");
    System.out.println("My Name is Hana Najih");
    System.out.print("My Name is Hana"); // if we remove ln the text will display in same line
    System.out.println("i like the \"java\" programming");
    System.out.println("i like the \"java\" \nprogramming");
    System.out.println("The number of students is: "+ studentNumber);
    System.out.println("The number of students is: "+ teacherNumber);
    
    //session 7
    String name="BahzAd";
    String lastName="Morady";
    System.out.println("my first name is:"+name);
        System.out.println("is my last name bahzad: "+lastName.equals(name));

String sentence="this is a short sentence";
System.out.println(sentence);
System.out.println("the number os its characters equals to "+sentence.length());
System.out.println("this will make cappital letters to small letters"+name.toLowerCase());
   System.out.println("this will make all letters capital"+name.toUpperCase());
    //session 8
    int studentNumberr=121;
    System.out.println("this will add 1 to the number and print immediatly "+(++studentNumberr));
    
    System.out.println("this will add the number but wont show the addition"+studentNumberr++);
    
    double x;// that variable we use for multiplication or division its better to be double 
    int y=10;
    x=y*(2+6);
    System.out.println("the value of x is "+x);
    ///////////session 9
    System.out.print("my weight on earth");
    double myWeightOnEarth=85.5;
    System.out.print(myWeightOnEarth);
    
    //if we calculate our weight on jupiter
    System.out.print("my weight on earth");
    double myWeightOnJupiter=85.5*2.54;
    System.out.print(myWeightOnJupiter);
    //if we were in saturn
    System.out.print("my weight on earth");
    double myWeightOnSaturn=85.5*1.08;
    System.out.print(myWeightOnSaturn);
    
    //////session 10
    
   // 
System.out.println("How many people should get on?");

int weightOfEachPerson = 75;
int elevatorCapacity = 750;
int numberOfPeople = elevatorCapacity / weightOfEachPerson;
boolean doorClosingOrder = numberOfPeople > 10;
System.out.println("Is the number of people more than 10?");
System.out.println(doorClosingOrder);
    
    }


}



