package Traingle;

public class TriangleType {
	
	public  String Type(double a,double b, double c) {



		if(a+b>c && b+c>a && a+c>b)

		{

		
		if(a==b && b==c)

		  return ("Triangle is Equilateral Triangle.");

		else if(a==b || b==c || c==a)

			return("Triangle is Isosceles Triangle.");

		else

			return("Triangle is Scalene Triangle.");

		}
		
		

		else

		 return null;


	}

	}	


	


