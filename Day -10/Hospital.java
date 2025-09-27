abstract class Doctor {
    String doctorname;
    Doctor(String doctorname) {
        this.doctorname = doctorname;
    }
    abstract void treatpatient(String patientname);
}

class Surgeon extends Doctor {
    Surgeon(String doctorname) {
        super(doctorname);
    }
    @Override
    void treatpatient(String patientname) {
        System.out.println("Surgeon " + doctorname + " is treating patient " + patientname + " with surgery.");
    }
}

class Dentist extends Doctor {
    Dentist(String doctorname) {
        super(doctorname);
    }
    @Override
    void treatpatient(String patientname) {
        System.out.println("Dentist " + doctorname + " is treating patient " + patientname + " with dental care.");
    }
}

class Cardiologist extends Doctor {
    Cardiologist(String doctorname) {
        super(doctorname);
    }
    @Override
    void treatpatient(String patientname) {
        System.out.println("Cardiologist " + doctorname + " is treating patient " + patientname + " with heart care.");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor surgeon = new Surgeon("Sridhar");
        Doctor dentist = new Dentist("Sri");
        Doctor cardiologist = new Cardiologist("Sridhar");

        surgeon.treatpatient("A");
        dentist.treatpatient("B");
        cardiologist.treatpatient("C");
    }
}