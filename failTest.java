  import org.testng.Assert;
  import org.testng.annotations.Test;

  public class failTest {
   
  	Details employee = new Details();
  	Calculation calc = new Calculation();
  	@Test(priority = 0)
  	public void testAnnualSalary()
  	{
  		employee.SetName("Abhishesh");
  		employee.SetAge(20);
  		employee.SetSalary(5000);
  		double AnnualSalary = calc.AnnualSalary(employee);
  		Assert.assertEquals(6000,AnnualSalary,0.0,"6000");
  	}
  	
  	@Test(priority = 1)
  	public void testBonus()
  	{
  		employee.SetAge(21);
  		employee.SetName("Abhishek");
  		employee.SetSalary(10000);
  		double bonus = calc.Bonus(employee);
  		Assert.assertEquals(100,bonus,0.0,"100");
  	}
  }

