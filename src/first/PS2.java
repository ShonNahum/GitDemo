package first;

import org.testng.annotations.Test;

public class PS2 extends PS { // now PS2 become child and PS is parent, by giving extends keyword the PS2 is acquire the methods/varibles of the parent (PS)
	
	
	@Test
	public void testRun() {
		Text();
		PS3 ps3 = new PS3(3);
		System.out.println(ps3.increment());
		System.out.println(ps3.multiByThree());
	}
	

}
