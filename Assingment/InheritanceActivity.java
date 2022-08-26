package strings;

class Employee{
	long EmployeeId;
	String EmployeeName;
	String EmployeeAdress;
	long EmployeePhone;
	double basicSalary;
	static double SpecialAllowance = 250.80;
	static double HRA = 1000.50;
	
	Employee(double id , String Name, String Adress , double Phone){
		id = EmployeeId;
		Name = EmployeeName;
		Adress = EmployeeAdress;
		Phone = EmployeePhone;
	
	}
	
	public void CalculateSalary() {
		double salary;
		salary = basicSalary + ( basicSalary * SpecialAllowance/100) + ( basicSalary * HRA/100);
		System.out.println("BAsic Salary is  "+salary);
	}
	
	public void CalculateTransportAllowance() {
		double TransportAllowance = 10/100*basicSalary;
		System.out.println("Transport Allownce "+TransportAllowance);
	}

}

class Manager extends Employee{

	 

	Manager(double id, String Name, String Adress, double Phone , double Salary) {
		super(id, Name, Adress, Phone);
		this.basicSalary = Salary;
	
	}
	
	public void transportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("The Transport allowance for manager is "+transportAllowance);
		
		
	}
	
	
}

class Trainee extends Employee{
	
	Trainee(double id , String Name, String Adress, double Phone , double Salary){
		super(id , Name, Adress, Phone);
		this.basicSalary = Salary;
	}
	
	
}

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager M1 = new Manager(126534,"Peter","Chennai India",237844, 65000); 
		
		Trainee T1 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		
		M1.transportAllowance();
		M1.CalculateSalary();
		
		T1.CalculateTransportAllowance();
		T1.CalculateSalary();
	}

}
