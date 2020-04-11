package m3.s03ctor;

public class Dog {
	String name;
	
	public Dog() {
	    name = "No name";
		System.out.println("A new dog has been created");
	}
	
	public void bark() {
		System.out.println(name + ": yap");
	}
}
