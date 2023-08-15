package day15;

public class first {
	

	    public static void main(String[] args) {

	        Patient patient = new Patient("Lily", 15, "2002-09-18", "Viral Fever");
	        patient.patientDetails();

	    }
	}

	class Patient {

	    private String patientName;
	    private int patientAge;
	    private String doa;
	    private String disease;
	    private Information information;
	    private Payment payment;

	    public Patient(String patientName, int patientAge, String doa, String disease) {
	        this.patientName = patientName;
	        this.patientAge = patientAge;
	        this.doa = doa;
	        this.disease = disease;
	        this.information = new Information();
	        this.payment = new Payment();
	    }

	    public  void patientDetails() {
	        System.out.println("Patient Name: " + patientName);
	        System.out.println("Patient Age: " + patientAge);
	        System.out.println("Date of Arrival: " + doa);
	        System.out.println("Disease: " + disease);
	        System.out.println("Block Number: " + information.blockNo);
	        System.out.println("Floor Number: " + information.floorNo);
	        System.out.println("Room Number: " + information.roomNo);
	        System.out.println("Bed Number: " + information.bedNo);
	        System.out.println("Admission Fees: " + payment.admFees);
	        System.out.println("Registration Fees: " + payment.regFees);
	        System.out.println("Balance Amount: " + payment.balAmt);
	        
	      

	}

	class Information {

	    private int blockNo;
	    private int floorNo;
	    private int roomNo;
	    private int bedNo;

	    public Information() {
	        this.blockNo =10;
	        this.floorNo = 4;
	        this.roomNo = 7;
	        this.bedNo = 101;
	    }

	}

	class Payment {

	    private int admFees;
	    private int regFees;
	    private int balAmt;

	    public Payment() {
	        this.admFees = 200000;
	        this.regFees = 5000;
	        this.balAmt = 10000;
	    }

	}
	}
