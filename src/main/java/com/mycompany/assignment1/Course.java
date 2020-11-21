package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author paulkirwan
 */
public class Course {
    
    private final String name;
    private final DateTime startDate;
    private final DateTime endDate;
    private final List<Module> modules = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public String getName() {
        return name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
        student.setCourse(this);
    }
    
    public void removeStudent(Student student) {
        students.remove(student);
        student.setCourse(null);
    }
    
    public void addModule(Module module) {
        modules.add(module);
        module.addCourse(this);
    }
    
    public void removeModule(Module module) {
        modules.remove(module);
        module.removeCourse(this);
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + '}';
    }
}
