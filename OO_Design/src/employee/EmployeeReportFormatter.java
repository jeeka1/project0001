package employee;

import domain.Employee;
import reporting.FormatType;
import reporting.ReportFormatter;

public class EmployeeReportFormatter  extends ReportFormatter {

	public EmployeeReportFormatter(Employee  employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}

	Employee anEmployee;
//	FormatType formatType;
	
	public String getFormattedEmployee() {
		return getFormattedValue();
	}
	
}
