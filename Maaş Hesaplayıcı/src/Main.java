
public class Main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Hüseyin", 5000, 50 , 2010);
	

		employee.printInfo();
		employee.tax();
		employee.bonus();
	    employee.raiseSalary();
	    System.out.println("After Tax and Bonus calc Salary : "+((employee.getBonus()-employee.getTax())+employee.getSalary()));
	    System.out.println("Total Salary : "+(employee.raiseSalary+employee.getSalary())) ;
	    
	}

}
