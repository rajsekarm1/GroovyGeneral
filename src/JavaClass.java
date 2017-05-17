
class Base{
	public void method1(float value){
		System.out.println("Base::method1");
	}
	
	
}

class Concerte extends Base{
	public void method1(int value){
		System.out.println("Concerte::method1");
	}
}


public class JavaClass {

	public static void main(String[] args) {
		Base base = new Concerte();
		base.method1(10.0f);

	}

}
