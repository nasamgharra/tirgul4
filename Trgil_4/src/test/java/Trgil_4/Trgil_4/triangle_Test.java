package Trgil_4.Trgil_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class triangle_Test {
	
	Triangle_classification triangle = new Triangle_classification();

	 @Test
	  public void Nottriangle1() {
	       int a = 7;
	       int b = 3;
	       int c = 16;
	       String expected = "Nottriangle";
	       String result = Triangle_classification.classifyTriangle(a, b, c);
	       assertEquals(result , expected);
	    }
	 
	  @Test
	    public void Nottriangle2() {
	        int a = 2;
	        int b = 4;
	        int c = 1;
	        String expected = "Nottriangle";
	        String result = Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
	    }

	    @Test
	    public void Nottriangle3() {
	        int a = 8; 
	        int b = 3;
	        int c = 2;
	        String expected = "Nottriangle";
	        String result =Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
}
	@Test  
		public void equilateralTriangle(){
			int a = 7;
			int b = 7;
			int c=7;
			String expected ="equilateral";
			String result = Triangle_classification.classifyTriangle(a, b, c);
			assertEquals(result , expected);
    }
	    @Test
	    public void isoscelesTriangle1() {
	        int a = 4;
	        int b = 4;
	        int c = 6;
	        String expected ="isosceles";
	        String result = Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void isoscelesTriangle2() {
	        int a = 5;
	        int b = 3;
	        int c = 3;
	        String expected = "isosceles";
	        String result = Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void isoscelesTriangle3() {
	        int a = 8;
	        int b = 5;
	        int c = 8;
	        String expected = "isosceles";
	        String result = Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
	    }
	   
	    @Test
	    public void ScaleneTriangle() {
	        int a = 8;
	        int b = 11;
	        int c = 15;
	        String expected = "Scalene";
	        String result = Triangle_classification.classifyTriangle(a, b, c);
	        assertEquals(result , expected);
	    }
	   
	  
	    
}