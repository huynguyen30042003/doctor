package Controller;

import java.util.ArrayList;

import Common.Algorithm;
import Common.Library;
import Model.Doctor;
import View.Menu;

public class DoctorManager extends Menu<String> {
    static String[] options = { "Add Doctor", "Update Doctor", "Delete Doctor", "Search Doctor", "Exit" };
    static ArrayList<Doctor> dataDoctor = new ArrayList<>();
    Algorithm algorithm = new Algorithm();

    public DoctorManager() {
        super("====== Doctor Management ======", options);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Doctor doctor = new Doctor();
                doctor.setIncludeCode(Library.validCode(dataDoctor, "Enter code"));
                doctor.input();
                dataDoctor.add(doctor);
                break;
            case 2:
                algorithm.update(dataDoctor);
                break;
            case 3:
                algorithm.delete(dataDoctor);

                break;
            case 4:
                algorithm.searchByCode(dataDoctor);
                break;
            case 5:
            System.out.println(dataDoctor);
                System.exit(0);
                break;
        }

    }

    public static void main(String[] args) {
        new DoctorManager().run();
    }
}
