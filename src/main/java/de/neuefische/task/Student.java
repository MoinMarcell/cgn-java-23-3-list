package de.neuefische.task;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String matriculationNumber;

    public Student(String firstName, String lastName, String matriculationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculationNumber = matriculationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(matriculationNumber, student.matriculationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, matriculationNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matriculationNumber='" + matriculationNumber + '\'' +
                "}\n";
    }
}
