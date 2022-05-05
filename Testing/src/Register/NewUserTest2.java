package Register;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Traingle.TriangleType;

class NewUserTest2 {
	
	 private NewUser2 obj1;
		@BeforeEach
		void setUp() throws Exception {
			this.obj1 = new NewUser2();
		}

	@Ignore
	void test1() {
		assertEquals("Registarrion fail",this.obj1.Register("Salma@gmail.com", "123456", "123456"));
	}
	
	@Test
	void test2(){
		assertEquals("Registarrion fail",this.obj1.Register("Salma@gmail.com", "123456789", "123456789"));
	}
	
	@Ignore
	void test3(){
		assertEquals("Registarrion fail",this.obj1.Register("Salma@", "12345678@", "12345678@"));
	}
	
	@Ignore
	void test4(){
		assertEquals("Registarrion fail",this.obj1.Register("Salma@gmail.com", "12345678@", "123456789"));
	}
	@Ignore
	void test5(){
		assertEquals("Registarrion fail",this.obj1.Register("Salma@", "12345678", "12345678"));
	}
	@Test
	void test6(){
		assertEquals("Registarrion done",this.obj1.Register("salma@gmail.com", "12345678$", "12345678$"));
	}
	
	@Test
	void test7(){
		assertEquals("Registarrion done",this.obj1.Register("SALMA@gmail.com", "a12345678@9", "a12345678@9"));
	}
	@Test
	void test8(){
		assertEquals("Registarrion fail",this.obj1.Register("SALM A@gmail.com", "12345678@9", "12345678@9"));
	}
	
	

}
