package Hospital;

class Doctor extends Person {
    private String specialization;
    private String[] schedule;

    public Doctor(String name, String email, String phone, String specialization) {
        super(name, email, phone);
        this.specialization = specialization;
        this.schedule = new String[5]; // assuming a simple schedule for the day (5 appointments)
    }

    public String getSpecialization() {
        return specialization;
    }

    public void manageAppointment(int slot, String patientName) {
        if (slot < schedule.length) {
            schedule[slot] = patientName;
            System.out.println("Appointment scheduled for " + patientName + " at slot " + (slot + 1));
        } else {
            System.out.println("Invalid appointment slot.");
        }
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is accessing their schedule.");
    }
}
