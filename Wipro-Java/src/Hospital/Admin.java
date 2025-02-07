package Hospital;

class Admin extends Person {

    public Admin(String name, String email, String phone) {
        super(name, email, phone);
    }

    public void manageDoctor(Doctor doctor) {
        // Admin can manage doctors, schedule appointments, etc.
        System.out.println(getName() + " is managing Dr. " + doctor.getName());
    }

    public void managePatient(Patient patient) {
        // Admin can manage patients' data
        System.out.println(getName() + " is managing patient " + patient.getName());
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is generating system reports.");
    }
}

