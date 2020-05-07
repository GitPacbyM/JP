//if you create any method in interface, they are be default public static, so need not to mention while writing methods.
// we cannt create object of interface, we can only create reference of interface
// we can achieve multiple inheritance with interfaces

interface writerr {
	 void write();
	
}

class penn implements writerr {

	public void write() {

		System.out.println("i am pen");
	}

}



class pencill implements writerr  {
	public void write() {

		System.out.println("i am pencil");
	}
}

class kit {

	public void dosomething(writerr p) {
		p.write();
	}

}

public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kit k = new kit();
		writerr pc = new pencill();
		writerr p = new penn();
		k.dosomething(p);
		k.dosomething(pc);

	}

}
