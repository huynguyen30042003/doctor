package Model;

import java.util.ArrayList;

import Common.Library;

public class Doctor {
    private String includeCode;
    private String name;
    private String specialization;
    private int availability;

    public Doctor() {

    }

    public Doctor(String includeCode, String name, String specialization, int availability) {
        this.includeCode = includeCode;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getIncludeCode() {
        return includeCode;
    }

    public void setIncludeCode(String includeCode) {
        this.includeCode = includeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void input() {
        if (includeCode == null) {
            setIncludeCode(Library.validString("Enter code"));
        }
        setName(Library.validString("Enter name"));
        setSpecialization(Library.validString("Enter specialization"));
        setAvailability(Library.getInt("Enter Availability", 0, 10));
    }

    @Override
    public String toString() {
        return "Doctor [includeCode=" + includeCode + ", name=" + name + ", specialization=" + specialization
                + ", availability=" + availability + "]";
    }

}
