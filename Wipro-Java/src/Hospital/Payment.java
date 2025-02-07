package Hospital;

class Payment {
    private Patient patient;
    private double amount;

    public Payment(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    public void processPayment() {
        patient.makePayment(amount);
        System.out.println("Payment of " + amount + " processed for patient " + patient.getName());
    }
}
