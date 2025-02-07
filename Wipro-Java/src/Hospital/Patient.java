package Hospital;

class Patient extends Person {
    private String medicalHistory;
//    private double balance;

    public Patient(String name, String email, String phone, String medicalHistory) {
        super(name, email, phone);
        this.medicalHistory = medicalHistory;
//        this.balance = 0.0;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void bookAppointment(Doctor doctor) {
        // Code to book an appointment
        System.out.println(getName() + " has booked an appointment with Dr. " + doctor.getName());
    }

    public void makePayment(double amount) {
//        this.balance += amount;
        System.out.println(getName() + " has paid " + amount + " for the consultation.");
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is viewing their medical history.");
    }
}

