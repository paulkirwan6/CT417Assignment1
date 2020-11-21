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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("name", new DateTime(), "studentId");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        course.addStudent(student);
        List<Student> students = course.getStudents();
        assert(students.contains(student));
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student student = new Student("name", new DateTime(), "studentId");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        course.addStudent(student);
        course.removeStudent(student);
        assert(course.getStudents().isEmpty());
    }

    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("name", "id");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        course.addModule(module);
        List<Module> modules = course.getModules();
        assert(modules.contains(module));
    }

    /**
     * Test of removeModule method, of class Course.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module module = new Module("name", "id");
        Course course = new Course("name", new DateTime(), new DateTime());
        
        course.addModule(module);
        course.removeModule(module);
        assert(course.getModules().isEmpty());
    }
}
