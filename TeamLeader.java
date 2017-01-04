package Homework2;
public class TeamLeader extends Employee implements View {
	private int projectNum;

	public int getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(int projectnum) {
		this.projectNum = projectnum;
	}

	public TeamLeader(Employee employee) {
		super(employee);
	}

	@Override
	public String getView() {
		StringBuffer kh = new StringBuffer();
		kh.append(this.getLastName().toUpperCase() + " ");
		kh.append(this.getFirstName().toUpperCase());
		kh.append(" Number of Project " + this.getProjectNum());
		kh.append("\n");
		// TODO Auto-generated method stub
		return kh.toString();
	}
}
