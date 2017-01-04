package Homework2;
public class Developer extends Employee {
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public Developer() {
		
	}

	public Developer(Employee employee) {
		super(employee);
	}

	@Override
	public String getView() {
		int sec = 20;
		// TODO Auto-generated method stub
		return Main.padRight("Full Name", sec) + Main.PrintCheck(this.getLastName()) + " "
				+ Main.PrintCheck(this.getFirstName()) + "\n" + Main.padRight("Comment", sec)
				+ Main.PrintCheck(this.getComment()) + "\n" + Main.padRight("Salary", sec)
				+ Main.PrintCheck(this.getSalary()) + "\n";
	}
}
