package dev.fullstackcode.stacksrc.demo.test;


import dev.fullstackcode.stacksrc.demo.Employee;
import dev.fullstackcode.stacksrc.demo.Gender;
import nz.lae.stacksrc.junit5.ErrorDecorator;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ErrorDecorator.class)
public class EmployeeTest {

    Employee emp = new Employee().getEmployee();

    @Test
    public void TestGetEmployee() {

        assertEquals("Alex",emp.getFirst_name());
        assertEquals("Smith",emp.getLast_name());
        assertEquals(Gender.F,emp.getGender());
        assertEquals("Historical Society of Victoria",emp.getAddressLine1());
        assertEquals("239 A'Beckett Street",emp.getAddressLine2());
        assertEquals("Melbourne",emp.getCity());
        assertEquals("Australia",emp.getCountry());

    }



}
