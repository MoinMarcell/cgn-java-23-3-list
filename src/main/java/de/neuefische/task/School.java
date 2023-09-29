package de.neuefische.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<String, Student> students;

    public School() {
        students = new HashMap<>();
    }

    public void addStudent(Student student){
        students.put(student.getMatriculationNumber(), student);
    }

    public Student getStudentByMatriculationNumber(String matriculationNumber){
        for(Student student : students.values()){
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
            students.remove(studentToDelete.getMatriculationNumber());
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
