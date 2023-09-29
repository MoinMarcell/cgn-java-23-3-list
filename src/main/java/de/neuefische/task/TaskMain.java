package de.neuefische.task;

import java.util.ArrayList;
import java.util.List;

public class TaskMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student max = new Student("Max", "Muster", "1");
        Student marie = new Student("Marie", "Muster", "2");

        students.add(max);
        students.add(marie);

        School school = new School();
        school.addStudent(marie);
        school.addStudent(max);
        System.out.println(school);
        System.out.println(school.getStudentByMatriculationNumber("4"));

        Course math = new Course("Math", "Teacher", "1");
        Course ds = new Course("Data Science", "Teacher", "1");

        max.addCourse(math);
        max.addCourse(ds);

        System.out.println(school.getCoursesFromStudent(max.getMatriculationNumber()));
    }
}
