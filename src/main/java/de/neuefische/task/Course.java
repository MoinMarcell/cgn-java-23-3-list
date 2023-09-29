package de.neuefische.task;

import java.util.Objects;

public class Course {
    private String name;
    private String teacher;
    private String room;

    public Course(String name, String teacher, String room) {
        this.name = name;
        this.teacher = teacher;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(teacher, course.teacher) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, room);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
