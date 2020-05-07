class k {

	public void show() {
		System.out.println("in class x");
	}
	public void display() {
		System.out.println("display in class x");
	}

}

class y extends k {
	public void show() {
		System.out.println("in class y");
	}
	
	public void config() {
		System.out.println("in config");
	}

}

class z extends k {
	public void show() {
		System.out.println("in class z");
	}

}

public class DynamicMethodDispatchPractice {
	
	//compile time and runtime

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class reference is x but the calling constructor is y. This way we can only call methods that are in A.
	k obj=new y(); //Linking here is done at run time. So which method to be exceuted is also decided at run time. It is called runtime polymorphism
	obj.show();
	obj.display();//we can only call methods that are in super class
	//obj.config(); This doesn't work because class x doesn't have the method config.
	obj=new z();
	obj.show(); //dynamic method dispatch, as reference is of class x and method executed is in class z. Which method to be executed is decided during run time. It is also called as runtime polymorphism.
	
	//To achive dynamic method dispatch, we have to follow concept of runtime polymorphism.
	
	
	
	}

}
