package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3HomeLoan {

	
	@Test
	public void loan1() {
		System.out.println("HomeLoan1");
	}
	
	@Test
	public void loan2() {
		
		System.out.println("HomeLoan2");
	}
	
	@Parameters({"URL"})
	@Test
	public void loan3(String U) {
		
		System.out.println("HomeLoan3");
		System.out.println(U);
	}
	
	@Test
	public void loan4() {
		
		System.out.println("HomeLoan4");
	}
	
	@Test
	public void loan5() {
		
		System.out.println("HomeLoan5");
	}
	
	@Test
	public void loan6() {
		
		System.out.println("HomeLoan6");
	}
}
