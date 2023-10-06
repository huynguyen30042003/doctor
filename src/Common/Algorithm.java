package Common;

import java.util.ArrayList;

import Model.Doctor;

public class Algorithm {
    public int searchCode(ArrayList<Doctor> dataDoctor, String target) {
        for (int i = 0; i < dataDoctor.size(); i++) {
            if (dataDoctor.get(i).getIncludeCode().toLowerCase().equals(target.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public void searchByCode(ArrayList<Doctor> dataDoctor) {
        ArrayList<Doctor> result = new ArrayList<>();
        String target = Library.validString("Enter code");
        for (Doctor doctor : dataDoctor) {
            if (doctor.getIncludeCode().toLowerCase().contains(target.toLowerCase())) {
                result.add(doctor);
            }
        }
        // System.out.println(result);
        System.out.printf("%-5s%-10s%-20s%-20s", "Code", "Name", "Specialization",
                "availability");
        System.out.println();
        dataDoctor.stream().forEach(doctor -> {
            System.out.printf("%-5s%-10s%-20s%-4s", doctor.getIncludeCode(),
                    doctor.getName(),
                    doctor.getSpecialization(), doctor.getIncludeCode());
            System.out.println();
        });

    }

    public void update(ArrayList<Doctor> dataDoctor) {
        String target = Library.validString("Enter code");
        int index = searchCode(dataDoctor, target);
        if (index >= 0) {
            Doctor doctor = new Doctor();
            doctor = dataDoctor.get(index);
            doctor.input();
            dataDoctor.set(index, doctor);
        } else {
            System.out.println("Code (id) must exist in the DB");
            update(dataDoctor);
        }
    }

    public void delete(ArrayList<Doctor> dataDoctor) {
        String target = Library.validString("Enter code");

        int index = searchCode(dataDoctor, target);
        if (index >= 0) {
            dataDoctor.remove(index);
        } else {
            System.out.println("Code (id) must exist in the DB");
            delete(dataDoctor);
        }
    }
}
