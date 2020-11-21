package com.mycompany.assignment1;

import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 *
 * @author paulkirwan
 */
public class Student {
    private final String name;
    private final DateTime dateOfBirth;
    private final String id;
    private final List<Module> modules = new ArrayList<>();
    private Course course;
    
    public Student(String name, DateTime dateOfBirth, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getId() {
        return id;
    }
    
    public List<Module> getModules() {
        return modules;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    public void addModule(Module module) {
        modules.add(module);
    }
    
    public void removeModule(Module module) {
        modules.remove(module);
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", username=" + createUsername(DateTime.now()) + '}';
    }
    
    //calculate age based on current date and date of birth
    public int calculateAge(DateTime currentDate) {
        Period period = new Period(dateOfBirth, DateTime.now());
        return period.getYears();
    }
    
    //combine name and age to create username
    public String createUsername(DateTime currentDate) {
        //Remove whitespace and convert to lowercase
        String formattedName = name.replaceAll("\\s","").toLowerCase();
        return formattedName + calculateAge(currentDate);
    }
}
