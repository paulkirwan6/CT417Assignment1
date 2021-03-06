package com.mycompany.assignment1;

import java.util.List;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author paulkirwan
 */
public class ModuleTest {
    
    public ModuleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("name", new DateTime(), "studentId");
        Module module = new Module("name", "moduleId");
        
        module.addStudent(student);
        List<Student> students = module.getStudents();
        assert(students.contains(student));
    }

    /**
     * Test of removeStudent method, of class Module.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student student = new Student("name", new DateTime(), "studentId");
        Module module = new Module("name", "moduleId");
        
        module.addStudent(student);
        module.removeStudent(student);
        assert(module.getStudents().isEmpty());
    }
    
    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Module module = new Module("name", "id");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        module.addCourse(course);
        List<Course> courses = module.getCourses();
        assert(courses.contains(course));
    }

    /**
     * Test of removeCourse method, of class Module.
     */
    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        Module module = new Module("name", "id");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        module.addCourse(course);
        module.removeCourse(course);
        assert(module.getCourses().isEmpty());
    }
}
