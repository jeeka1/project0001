package inversion.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingClass{

	public LaptopManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("Assemled laptop");
	}

	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("tested laptop");
	}

	@Override
	protected void packageDevice() {
		// TODO Auto-generated method stub
		System.out.println("packaged laptop");
	}

	@Override
	protected void storeDevice() {
		// TODO Auto-generated method stub
		System.out.println("stored laptop");
	}

}
