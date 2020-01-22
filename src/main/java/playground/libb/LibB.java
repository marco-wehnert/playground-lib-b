package playground.libb;

import playground.liba.LibA;

public class LibB {

	public void print() {
		System.out.println("LibB");
		LibA libA = new LibA();
		libA.print();
	}
}
