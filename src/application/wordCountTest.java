package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class wordCountTest {

	@Test
	void test() {
	
		int output = Main.wordc();
		//return 1 if there are 20 word, otherwise 0
		assertEquals(1,output);
		System.out.println(output);
	}

}
