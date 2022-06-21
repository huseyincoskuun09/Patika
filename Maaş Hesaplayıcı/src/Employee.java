
public class Employee {
	
	private String name ;
	private int salary ;
	private int workHours ;
	private int hireYear ;
	double tax;
    double bonus;
    double raiseSalary;
	
	
	
	
	 
	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.tax = 0 ;
		this.bonus = 0 ;
		this.raiseSalary = 0 ;
	}
	
	
	

	 public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public double getTax() {
		return tax;
	}




	public void setTax(double tax) {
		this.tax = tax;
	}




	public double getBonus() {
		return bonus;
	}




	public void setBonus(double bonus) {
		this.bonus = bonus;
	}




	public double getRaiseSalary() {
		return raiseSalary;
	}




	public void setRaiseSalary(double raiseSalary) {
		this.raiseSalary = raiseSalary;
	}




	void tax() {
		double vergı = 0.03 ; 
		if(salary>1000) {
			 this.tax = (salary*vergı);
			
			System.out.println("Tax : " +this.tax);
		}
		else {
			System.out.println("There is no tax because of salary less than 1000");
		}
		
		
	}
	 void bonus() {
		
		if(workHours>40 ) {
			
			 this.bonus  = (workHours-40)*30 ; 
			 System.out.println("Bonus : " +this.bonus);
			
		}
	}
	 void raiseSalary() {
		
		if(2022-hireYear<10) {
			this.raiseSalary = (this.salary*0.05);
		}
		else if(2022-hireYear>9 && 2022-hireYear<20) {
			this.raiseSalary = (this.salary*0.10 );
		
	}
		else if(2022-hireYear>19) {
			this.raiseSalary = (salary*0.15) ;
			
		}
		System.out.println("Raise Salary :"+this.raiseSalary);
	

}


	void printInfo(){
       
        System.out.println("Employee Name : " +this.name);
        System.out.println("Employee Salary : " +this.salary);
        System.out.println("Work Hour Per Week : "+this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        

}
	
	
}