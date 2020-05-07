// inheritance
//IS-A - Whenever you have a class(calcAdv) and it extends to another class, it is called IS-A
//Has-A - Whenever you have a class (InheritancePractice) in which you are creating object of another class, it is called Has-A

class calculator // Super, Parent, Base
{

	public int add(int i, int j) {
		return i + j;
	}

}

class calcAdv extends calculator // Sub, Child, Derived

{
	public int sub(int i, int j) {

		return i - j;

	}
}

class calcveryAdv extends calcAdv // Sub

{
	public int multi(int i, int j) {

		return i * j;

	}
}

public class InheritancePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcveryAdv obj = new calcveryAdv();
		int result1 = obj.add(2, 7);
		int result2 = obj.sub(7, 2);
		int result3 = obj.multi(2, 3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
