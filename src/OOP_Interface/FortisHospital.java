package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {
	
//	int minbill = 100;

	// US
	@Override
	public void physioService() {
		System.out.println("FS - physioService");

	}

	@Override
	public void oncoService() {
		System.out.println("FS - oncoService");

	}

	// UK
	@Override
	public void pediaService() {
		System.out.println("FS - pediaService");

	}

	@Override
	public void gynoService() {
		System.out.println("FS - gynoService");

	}

	// Indian
	@Override
	public void ENTService() {
		System.out.println("FS - ENTService");

	}

	@Override
	public void DentalService() {
		System.out.println("FS - DentalService");

	}

	@Override
	public void emergencyService() {
		System.out.println("FS - emergencyService");

	}

	// FS
	public void checkUpService() {
		System.out.println("FS - checkUpService");
	}

}
