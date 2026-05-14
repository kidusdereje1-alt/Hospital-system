// File: HospitalSystem.java

package hospital;

import java.util.ArrayList;


abstract class Person {


    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public abstract void displayInfo();
}


class Patient extends Person {

    protected String disease;

    public Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient Age: " + getAge());
        System.out.println("Disease: " + disease);
    }
}


class Doctor extends Person {

    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Doctor Age: " + getAge());
        System.out.println("Specialization: " + specialization);
    }
}


class HospitalSystem {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Person> people = new ArrayList<>();

        try {

            // Creating objects with fixed names
            Patient patient = new Patient("John", 25, "Flu");
            Doctor doctor = new Doctor("Dr. Smith", 45, "Cardiology");

            // Polymorphism
            people.add(patient);
            people.add(doctor);

            System.out.println("===== HOSPITAL SYSTEM =====");

            // Loop through ArrayList
            for (Person p : people) {
                p.displayInfo();
                System.out.println("-------------------");
            }

        }
        // Exception Handling
        catch (Exception e) {
            System.out.println("An error occurred!");
        }
    }
}