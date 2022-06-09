package Qustion1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB in dd-MM-yyyy formate");
		String dob = sc.next();
		
		
		try {
			LocalDate d1 = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1, c1);
			
			System.out.println(p.getYears());
			
			if(p.getYears()<0||p.getMonths()<0||p.getDays()<0) {
				System.out.println("Date should not be in Future");
			}
		}
		catch(Exception e){
			System.out.println("InvalidDateFormat");
		}
		
	}

}
