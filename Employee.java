package Homework2;
public class Employee extends Person implements View {
	private double salary;
	private int years;

	public Employee() {

	}

	public Employee(Employee employee) {
		this.setId(employee.getId());
		this.setCreatedDate(employee.getCreatedDate());
		this.setUpdatedDate(employee.getUpdatedDate());
		this.setCreatedBy(employee.getCreatedBy());
		this.setUpdatedBy(employee.getUpdatedBy());
		this.setState(employee.getState());
		this.setVersion(employee.getVersion());
		this.setBirthDate(employee.getBirthDate());
		this.setLastName(employee.getLastName());
		this.setFirstName(employee.getFirstName());
		this.setSalary(employee.getSalary());
		this.setYears(employee.getYears());
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String getView() {
		int spy = 20;

		return Main.padRight("ID", spy) + Main.PrintCheck(this.getId()) + "\n" + Main.padRight("Created Date", spy)
		+ Main.PrintDate(this.getCreatedDate()) + "\n" + Main.padRight("Updated Date", spy)
		+ Main.PrintDate(this.getUpdatedDate()) + "\n" + Main.padRight("Created By", spy)
		+ Main.PrintCheck(this.getCreatedBy()) + "\n" + Main.padRight("Updated By", spy)
		+ Main.PrintCheck(this.getUpdatedBy()) + "\n" + Main.padRight("State", spy)
		+ Main.PrintCheck(this.getState()) + "\n" + Main.padRight("Version", spy)
		+ Main.PrintCheck(this.getVersion()) + "\n" + Main.padRight("BirthDate", spy)
		+ Main.PrintDate(this.getBirthDate()) + "\n" + Main.padRight("Last Name", spy)
		+ Main.PrintCheck(this.getLastName()) + "\n" + Main.padRight("First Name", spy)
		+ Main.PrintCheck(this.getFirstName()) + "\n" + Main.padRight("Salary", spy)
		+ Main.PrintCheck(this.getSalary()) + "\n" + Main.padRight("Years", spy)
		+ Main.PrintCheck(this.getYears())+ "\n";


	}
}
