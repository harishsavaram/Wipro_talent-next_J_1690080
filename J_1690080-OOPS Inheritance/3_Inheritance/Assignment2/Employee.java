package inheritance;

public class Employee extends Person{
     double annualSalary;
     int yearOfStart;
     String nationalInsuranceNo;
     Employee()
     {
    	 
     }
     Employee(String Name,double annualSalary,int yearOfStart,String nationalInsuranceNo)
     {
    	 super(Name);
    	 this.annualSalary=annualSalary;
    	 this.yearOfStart=yearOfStart;
    	 this.nationalInsuranceNo=nationalInsuranceNo;
     }
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYearOfStart() {
		return yearOfStart;
	}
	public void setYearOfStart(int yearOfStart) {
		this.yearOfStart = yearOfStart;
	}
	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}
     
}
