package de.neuefische.task;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudentByMatriculationNumber(String matriculationNumber){
        for(Student student : students){
            if(student.getMatriculationNumber().equals(matriculationNumber)){
                return student;
            }
        }
        return null;
    }

    public void deleteStudentByMatriculationNumber(String matriculationNumber){
        /*for(Student student : students){
            if(student.getMatriculationNumber().equals(matriculationNumber)){
                students.remove(student);
            }
        }*/
        Student studentToDelete = getStudentByMatriculationNumber(matriculationNumber);
        if(studentToDelete != null){
            students.remove(studentToDelete);
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
