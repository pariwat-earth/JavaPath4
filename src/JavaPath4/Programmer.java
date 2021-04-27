package JavaPath4;

public class Programmer extends Employee implements IWebsiteCreator{

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	@Override
	public int getSalary() {
		return super.getSalary();
	}
	
	public void createWabsite(String template, String titleName) {}
	public void installWindows(String version,String productKey) {}
	public static void main(String[] args) {
	}
	@Override
	public void createWebsite(String template, String titleNamey) {
		// TODO Auto-generated method stub
		
	}
}
