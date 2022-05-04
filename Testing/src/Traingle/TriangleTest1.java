package Traingle;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import singleChar.ReplaceChar;


public class TriangleTest1 {
	 private TriangleType obj1;
		@BeforeEach
		void setUp() throws Exception {
			this.obj1 = new TriangleType();
		}
	

	@Test
public	void test1() {
		this.obj1 = new TriangleType();
		assertEquals("Not Triangle.",this.obj1.Type(0, 0, 0));
		
	}
	
	@Test
public	void test2() {
		this.obj1 = new TriangleType();
		assertEquals("Not Triangle.",this.obj1.Type(-1, -1,-1));
		
	}
	
	@Test
public	void test3() {
		this.obj1 = new TriangleType();
		assertEquals("Not Triangle.",this.obj1.Type(3, 2,5));
		
	}
	
	
	@Test
public	void test4() {
		this.obj1 = new TriangleType();
		assertEquals("Triangle is Equilateral Triangle.",this.obj1.Type(3, 3,3));
		
	}
	
	@Test
public	void test5() {
		this.obj1 = new TriangleType();
		assertEquals("Triangle is Isosceles Triangle.",this.obj1.Type(50, 10,50));
		
	}
	
	public	void test6() {
		this.obj1 = new TriangleType();
		assertEquals("Triangle is Isosceles Triangle.",this.obj1.Type(50, 50,10));
		
	}
	
	@Test
public	void test7() {
		this.obj1 = new TriangleType();
		assertEquals("Triangle is Scalene Triangle.",this.obj1.Type(50, 30,40));
		
	}

}
