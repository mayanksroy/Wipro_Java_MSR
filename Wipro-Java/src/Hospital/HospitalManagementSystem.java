package Hospital;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create doctors, patients, and admin
        Doctor doctor1 = new Doctor("Dr. XYZ", "xyz@example.com", "1234567890", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. ABC", "abc@example.com", "9876543210", "Dermatology");

        Patient patient1 = new Patient("John Doe", "john.doe@example.com", "1122334455", "No medical history");
        Patient patient2 = new Patient("Jane Doe", "jane.doe@example.com", "2233445566", "Allergic to penicillin");

        Admin admin = new Admin("Admin", "admin@example.com", "3334445555");

        // Patients book appointments
        patient1.bookAppointment(doctor1);
        patient2.bookAppointment(doctor2);

        // Doctor manages appointments
        doctor1.manageAppointment(0, patient1.getName());
        doctor2.manageAppointment(0, patient2.getName());

        // Admin manages doctors and patients
        admin.manageDoctor(doctor1);
        admin.managePatient(patient1);

        // Payment processing
        Payment payment1 = new Payment(patient1, 100.0);
        payment1.processPayment();

        // Polymorphism: Perform actions
        patient1.performAction(); // Patient-specific action
        doctor1.performAction();  // Doctor-specific action
        admin.performAction();    // Admin-specific action
    }
}

