package calcTest;
import static org.junit.Assert.*;

import org.junit.Test;

import calc.Calc;

public class CalcTest {

	@Test
	public void CalcTestSol() {
		Calc cal = new Calc(2,2);
		
		int add = cal.add();
		assertEquals(add, 4);
		
		int sub = cal.sub();
		assertEquals(sub, 0);
		
		int mul = cal.mul();
		assertEquals(mul, 4);
		
		int div = cal.div();
		assertEquals(div, 1);
	}

}