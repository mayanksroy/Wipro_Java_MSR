package Hospital;

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String timeSlot;

    public Appointment(Patient patient, Doctor doctor, String timeSlot) {
        this.patient = patient;
        this.doctor = doctor;
        this.timeSlot = timeSlot;
    }

    public void confirmAppointment() {
        System.out.println("Appointment confirmed for " + patient.getName() + " with Dr. " + doctor.getName() + " at " + timeSlot);
    }
}

