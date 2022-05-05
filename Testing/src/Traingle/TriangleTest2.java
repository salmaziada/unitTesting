package Traingle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import singleChar.ReplaceChar;


public class TriangleTest2 {
	 private TriangleType2 obj1;
		@BeforeEach
		void setUp() throws Exception {
			this.obj1 = new TriangleType2();
		}
	

	@Test
public	void test1() {
		
		assertEquals("Not Triangle.",this.obj1.Type(0, 0, 0));
		
	}
	
	@Test
public	void test2() {
		assertEquals("Not Triangle.",this.obj1.Type(-1, -1,-1));
		
	}
	
	@Test
public	void test3() {
		assertEquals("Not Triangle.",this.obj1.Type(3, 2,5));
		
	}
	
	
	@Ignore
public	void test4() {
		assertEquals("Triangle is Equilateral Triangle.",this.obj1.Type(3, 3,3));
		
	}
	
	@Test
public	void test5() {
		assertEquals("Triangle is Isosceles Triangle.",this.obj1.Type(50, 10,50));
		
	}

	@Test
	
	public	void test6() {
		assertEquals("Triangle is Isosceles Triangle.",this.obj1.Type(50, 50,10));
		
	}
@Test
	
	public	void test7() {
		assertEquals("Triangle is Isosceles Triangle.",this.obj1.Type(10, 50,50));
		
	}
	

	@Ignore
public	void test8() {
		assertEquals("Triangle is Scalene Triangle.",this.obj1.Type(50, 30,40));
		
	}

}
