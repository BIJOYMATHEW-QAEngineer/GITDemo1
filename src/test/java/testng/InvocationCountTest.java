package testng;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10)
	public void Sum() {
		int a = 1;
		int b = 2;
		int c = a + b;
		int d = a + b;
		int e = a + b;
		int f = a + b;
		int g = a + b;
		int h = a + b;
		int i = a + b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

	}

}
