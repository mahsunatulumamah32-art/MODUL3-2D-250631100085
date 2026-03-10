/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taufiq
 */
public class student {
// Atribut////
    String name;
    int age;
    String city;

    // Method untuk perkenalan
    void introduce() {
        System.out.println("Hi, my name is " + name + 
        " and I am " + age + " years old. I am from " + city);
    }

    // Method utama (main)
    public static void main(String[] args) {

        // Membuat object
        student s1 = new student();

        // Mengisi data
        s1.name = "Mahsunatul Umamah";
        s1.age = 1;
        s1.city = "Bangkalan";

        // Memanggil method
        s1.introduce();
    }
}