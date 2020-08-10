package m2.s07;

public class Dog {
	static final int MAX_DOGS = 1000;
	static int counter;
	
	// very strange example - don't do this in production code
	static Dog[] dogs = new Dog[MAX_DOGS];
	
	Dog() {
		counter += 1;
	}
	
	static void killAll() {
		for(Dog dog : dogs) {
			if(dog != null) {
				dog.kill();
			}
		}
	}
	
	void kill() {
		
	}
}

class DogUser {
	void f() {
		System.out.println(Dog.counter);
		
		Dog.killAll();
		
		Dog bob = new Dog();
		bob.kill();
	}
}
