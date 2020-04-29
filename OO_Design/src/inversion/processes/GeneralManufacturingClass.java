package inversion.processes;

public abstract class GeneralManufacturingClass {
	private String processName;
	
	public GeneralManufacturingClass(String name) {
processName = name;
}

	
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();
	
	//template method
	public void launchProcess() {
		
		if (processName != null && !processName.isEmpty()) {
			
		
		assembleDevice();
		testDevice();
		packageDevice();
		storeDevice();
		
	}else {
		System.out.println("no process name specified");
	}
}
}
