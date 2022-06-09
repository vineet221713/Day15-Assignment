package Qustion2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Date of joing in dd-MM-yyyy ");
		String joindate = sc.next();
		
		try {
			LocalDate d1 = LocalDate.parse(joindate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1, c1);
			
			if(p.getYears()>1) {
				System.out.println("Your Bonush Is"+5000);
			}
			else if(p.getYears()<=2&&p.getYears()>1) {
				System.out.println("Your Bonush Is"+8000);
			}
			else if(p.getYears()>2) {
				System.out.println("Your Bonush Is"+10000);
			}
			
			else if(p.getYears()<0||p.getMonths()<0||p.getDays()<0) {
				System.out.println("Age should not be in the future");
			}
			
			
		}
		
		catch(Exception e) {
		System.out.println("Please pass the date in the correct format");	
		}
		

	}

}
