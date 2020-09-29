

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreeterUnitTests2 {

	Greeter greeter = new Greeter();
	
	@BeforeEach
	void createObject() {
		greeter = new Greeter();
	}
	
	@Test
	void testSayHello() {
		assertEquals("Hello Melanie", greeter.sayHello("Melanie"));
		assertEquals("Hello hello BOB", greeter.sayHello("hello BOB"));
		assertEquals("Hello ", greeter.sayHello(""));
		assertEquals("Hello 12345", greeter.sayHello("12345"));
	}
		
	@Test
	void testSaySomething() {
		assertEquals("Hello Melanie, how are you?!", greeter.sayAnything("Hello Melanie, how are you?"));
		assertEquals("BOB!", greeter.sayAnything("BOB"));
		assertEquals("Hello !", greeter.sayAnything("Hello "));
		assertEquals("12345-333!", greeter.sayAnything("12345-333"));
	}
		
}
