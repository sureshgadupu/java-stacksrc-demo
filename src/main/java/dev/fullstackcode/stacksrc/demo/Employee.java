package dev.fullstackcode.stacksrc.demo;

import java.time.LocalDate;

public class Employee {

    private Integer id;
    private String first_name;
    private String last_name;
    private Gender gender;

    private LocalDate birth_date;
    private LocalDate hire_date;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private  String state;

    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee getEmployee() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setFirst_name("Alex");
        emp.setLast_name("Smith");
        emp.setGender(Gender.F);
        emp.setBirth_date(LocalDate.of(1980,11,12));
        emp.setHire_date(LocalDate.of(2020,11,12));
        emp.setAddressLine1("Royal Historical Society of Victoria,");
        emp.setAddressLine2("239 A'Beckett Street");
        emp.setCity("Melbourne");
        emp.setCountry("Australia");
        return emp;
    }

}
