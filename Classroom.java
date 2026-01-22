/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classroom;

/**
 *
 * @author Lenovo
 */
class Classroom {
   
    String name;
    int age;
    String course;

  
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Student Information\n");

        Classroom student1 = new Classroom();
        student1.name = "Noveneil Molinas";
        student1.age = 17;
        student1.course = "BSHM";

        Classroom student2 = new Classroom();
        student2.name = "Crinel Joyce Balwit";
        student2.age = 18;
        student2.course = "BSIT";

        student1.displayInfo();
        student2.displayInfo();
    }
}
