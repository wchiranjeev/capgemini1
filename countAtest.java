package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class countAtest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.countA("rayan");
		
		assertEquals(2, output);
	}

}
