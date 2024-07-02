package c07;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
	public String name;

	public Dog() {};
	public Dog(String n) { name = n; }
	public boolean equals(Object o) {
		if((o instanceof Dog) &&
				(((Dog)o).name == name)) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode() {return name.length(); }

	public static void main(String[] args) {
		D d  = (D) (C) new D();
		d.x();
	}
}

abstract class B {
	void x() {
		System.out.println(y());
	}
	abstract List y();// { return "a"; }
//	abstract void z(ArrayList x);
}
abstract class C extends B {
//	abstract String y();
}
class D extends C {
	ArrayList y() { return null; }
//	void z(List x) {}
}
