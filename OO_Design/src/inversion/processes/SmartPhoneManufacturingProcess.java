package inversion.processes;

public class SmartPhoneManufacturingProcess extends GeneralManufacturingClass {

	public SmartPhoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("Assemled Smartphone");
	}

	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("tested Smartphone");
	}

	@Override
	protected void packageDevice() {
		// TODO Auto-generated method stub
		System.out.println("packaged Smartphone");
	}

	@Override
	protected void storeDevice() {
		// TODO Auto-generated method stub
		System.out.println("stored Smartphone");
	}

	
}
