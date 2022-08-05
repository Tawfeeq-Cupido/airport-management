package za.ac.cput.factory.employee;

/*
 * Author : Adecel Rusty Mabiala
 * Student Number : 219197229
 * Assessment 01 (Term1)
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.employee.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test() {
        Employee employee = EmployeeFactory.employee("123423445",
                "Kimpasti Zaraki",
                "trolls Department",
                "234890");
        assertNotNull(employee);

        System.out.println(employee);
    }
}