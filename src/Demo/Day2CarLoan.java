package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2CarLoan {

	
	@Test(dataProvider = "getdata")
	public void loan1(String username,String pass) {
		System.out.println("CarLoan1");
		System.out.println(username);
		System.out.println(pass);
	}
	

	@Test
	public void loan2() {
		
		System.out.println("CarLoan2");
		
	}
	
	@Test
	public void loan3() {
		
		System.out.println("CarLoan3");
	}
	
	@Test
	public void loan4() {
		
		System.out.println("CarLoan4");
	}
	
	@Test
	public void loan5() {
		
		System.out.println("CarLoan5");
	}
	
	@Test
	public void loan6() {
		
		System.out.println("CarLoan6");
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="FirstUsername";
		data[0][1]="FirstPass";
		
		data[1][0]="SecondUsername";
		data[1][1]="SecondPass";
		
		data[2][0]="ThirdUsername";
		data[2][1]="ThirdPass";
		
		return data;
		
		
	}
	
}
