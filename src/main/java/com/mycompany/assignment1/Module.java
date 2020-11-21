package com.mycompany.assignment1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author paulkirwan
 */
public class Module {
    
    private final String name;
    private final String Id;
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public Module(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Module{" + "name=" + name + ", Id=" + Id + '}';
    }
}
