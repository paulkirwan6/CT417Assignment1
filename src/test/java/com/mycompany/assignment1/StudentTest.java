package com.mycompany.assignment1;

import java.util.List;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paulkirwan
 */
public class StudentTest {
   
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
     * Test of calculateAge method, of class Student.
     */
    @Test
    public void testCalculateAge() {
        System.out.println("calculateAge");
        
        //Set current date as a fixed date so test doesn't need to be updated as the student would age
        DateTime currentDate = new DateTime(2020, 11, 20, 0, 0);
        Student student = new Student("Paul Kirwan", new DateTime(1998, 8, 12, 0, 0), "12345678");
        
        int expResult = 22;
        int result = student.calculateAge(currentDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of createUsername method, of class Student.
     */
    @Test
    public void testCreateUsername() {
        System.out.println("createUsername");
        
        DateTime currentDate = new DateTime(2020, 11, 20, 0, 0);
        Student instance = new Student("Paul Kirwan", new DateTime(1998, 8, 12, 0, 0), "12345678");
        
        String expResult = "paulkirwan22";
        String result = instance.createUsername(currentDate);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("name", "id");
        Student student = new Student("name", new DateTime(), "id");
        
        student.addModule(module);
        List<Module> modules = student.getModules();
        assert(modules.contains(module));
    }

    /**
     * Test of removeModule method, of class Student.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module module = new Module("name", "id");
        Student student = new Student("name", new DateTime(), "id");
        
        student.addModule(module);
        student.removeModule(module);
        assert(student.getModules().isEmpty());
    }
}
