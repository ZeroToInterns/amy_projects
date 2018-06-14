
public class LoanApplicant {

	private double annualSalary;
	private int yearsOnJob;
	
	//constructor
	public LoanApplicant(double annualSalary, int yearsOnJob) {
		this.annualSalary = annualSalary;
		this.yearsOnJob = yearsOnJob;
	}
	
	//returns true if the applicant qualifies otherwise it returns false
	public boolean qualifies() {
		if (annualSalary > 30000) {
			if (annualSalary > 100000) {
				return true;
			}
			else if (annualSalary <= 100000 && annualSalary > 50000 && yearsOnJob >= 2) {
				return true;
			}
			else if (annualSalary <= 50000 && yearsOnJob >= 5) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;	
		}
	}
	
	//sets a number of years on the job
	public void setYearsOnJob(int years) {
		if (years < 0) {
			System.out.println("Years on job cannot be a negative");
		}
		else {
			this.yearsOnJob = years;
		}
	}
	
	//gets the number of years on the job
	public int getYearsOnJob() {
		return yearsOnJob;
	}
	
	//sets a new annual salary
	public void setAnnualSalary(double salary) {
		if (salary < 0) {
			System.out.println("Annual salary cannot be a negative");
		}
		else {
			this.annualSalary = salary;
		}
	}
}
