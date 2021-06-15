package javapatterns;

abstract class Employee {
	abstract void totalSalary();
}

class Teachers extends Employee{
	private int salary;
	Teachers(int sal){
		this.salary = sal;
	}
	
	//Teachers salary will be calculated annually.
	@Override
	public void totalSalary(){
		System.out.print(12*salary+"\n");
	}
}

class Workers extends Employee{
	private int salary;
	Workers(int sal){
		this.salary = sal;
	}
	
	//Workers salary will be calculated on daily basis.
	@Override
	public void totalSalary(){
		System.out.print(salary+"\n");
	}
}

class EmployeeFactory {
	static Employee getInstance(String type, int sal) {
		if( type == "Workers") {
			return new Workers(sal);
		}
		else {
			return new Teachers(sal);
		}
	}
}

public class FactoryDP {
	public static void main(String args[]) {
	
	Employee e1 = EmployeeFactory.getInstance("Workers", 1250);
	e1.totalSalary();
	Employee e2 = EmployeeFactory.getInstance("Teachers", 1250);
	e2.totalSalary();
		
	}
}
