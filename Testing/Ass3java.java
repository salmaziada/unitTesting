package singleChar;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

import org.junit.Test;

  public class SingleCharTest {
	 private ReplaceChar obj1;
	
	

	@Test
	public void test1() {
		this.obj1 = new ReplaceChar();

		
		assertEquals(" ",this.obj1.ReplaceMultipleSpaces("  "));
		
		
	}
	
	@Test
	public void test2() {
		this.obj1 = new ReplaceChar();

		
		assertEquals("New-York",this.obj1.ReplaceMultipleSpaces("New-York"));
		
		
	}
	
	@Test
	public void test3() {
		this.obj1 = new ReplaceChar();

		
		assertEquals(" I love Palestaine",this.obj1.ReplaceMultipleSpaces("  I love Palestaine"));
		
		
	}
	
	@Test
	public void test4() {
		this.obj1 = new ReplaceChar();

		
		assertEquals(" I love Palestaine",this.obj1.ReplaceMultipleSpaces("   I love Palestaine"));
		
		
	}
	
	
	@Test
	public void test5() {
		this.obj1 = new ReplaceChar();

		
		assertEquals("I love Palestaine ",this.obj1.ReplaceMultipleSpaces("I love Palestaine  "));
		
		
	}
	
	
	@Test
	public void test6() {
		this.obj1 = new ReplaceChar();

		
		assertEquals("I love Palestaine ",this.obj1.ReplaceMultipleSpaces("I love Palestaine   "));
		
		
	}
	
	
	@Test
	public void test7() {
		this.obj1 = new ReplaceChar();

		
		assertEquals("I love Palestaine",this.obj1.ReplaceMultipleSpaces("I love  Palestaine"));
		
		
	}
	
	
	@Test
	public void test8() {
		this.obj1 = new ReplaceChar();

		
		assertEquals("I love Palestaine",this.obj1.ReplaceMultipleSpaces("I love   Palestaine"));
		
		
	}
	
	
	@Test
	public void test9() {
		this.obj1 = new ReplaceChar();

		
		assertEquals(" I love Palestaine ",this.obj1.ReplaceMultipleSpaces("  I love   Palestaine "));
		
		
	}
	
	@Test
	public void test10() {
		this.obj1 = new ReplaceChar();

		assertEquals("",this.obj1.ReplaceMultipleSpaces(""));
		
		
	}
	

}
