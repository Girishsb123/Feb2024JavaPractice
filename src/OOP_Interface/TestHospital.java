package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.DentalService();
		fh.ENTService();
		fh.gynoService();
		fh.oncoService();
		fh.physioService();
		fh.pediaService();
		
		
		fh.emergencyService();
		fh.checkUpService();
		fh.CovidVaccination();
		
		//fh.minbill=20;
		
		System.out.println(fh.minbill);
		System.out.println(USMedical.minbill);
		
		System.out.println("-------------");
		
		
		//top casting
		//child class object can be referred by parent interface ref var
		USMedical us = new FortisHospital();
		us.physioService();
		us.emergencyService();
		us.oncoService();
		
		//USMedical us = new USMedical();
		//Can't create object
		
		
		
	}

}
