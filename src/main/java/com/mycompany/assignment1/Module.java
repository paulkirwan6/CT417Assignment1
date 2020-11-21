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
    private final List<Student> students = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }
  
    public List<Course> getCourses() {
        return courses;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    
    public void addStudent(Student student) {
        students.add(student);
        student.addModule(this);
    }
    
    public void removeStudent(Student student) {
        students.remove(student);
        student.removeModule(this);
    }

    @Override
    public String toString() {
        return "Module{" + "name=" + name + ", Id=" + Id + '}';
    }
}
