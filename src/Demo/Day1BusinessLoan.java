package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1BusinessLoan {
	
	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void loan1(String ur) {
		System.out.println("BusinessLoan1");
		System.out.println(ur);
	}
	
	@Test(groups={"smoke"})
	public void loan2()
	{
		System.out.println("BusinessLoan2");
	}
	
	@Test(groups={"smoke"})
	public void loan3()
	{
		System.out.println("BusinessLoan3");
	}
	@Test(groups={"smoke"})
	public void loan4()
	{
		System.out.println("BusinessLoan4");
	}
	@Test
	public void loan5()
	{
		System.out.println("BusinessLoan5");
	}
	@Test
	public void loan6()
	{
		System.out.println("BusinessLoan6");
	}
}
