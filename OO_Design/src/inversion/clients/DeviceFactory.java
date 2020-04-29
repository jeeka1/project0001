package inversion.clients;

import inversion.processes.GeneralManufacturingClass;
import inversion.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {

	public static void main(String args[]) {
		
		GeneralManufacturingClass manfacturer = new SmartPhoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	}
}
