import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calc extends JFrame {
	    
	
	public String[] history =  new String[5];

public double solver(String s) {
    
	if(s.contains("+"))
    {
    	String[] ar = s.split("\\+");
        double v1 = Double.parseDouble(ar[0]);
        double v2 = Double.parseDouble(ar[1]);
        double res = v1 + v2;
        return res;	
    	
    }
	
    else if(s.contains("-"))
    {
    	String[] ar = s.split("\\-");
        double v1 = Double.parseDouble(ar[0]);
        double v2 = Double.parseDouble(ar[1]);
        double res = v1 - v2;
        return res;
    	
    	
    }
	
    else if(s.contains("*"))
    {
    	String[] ar = s.split("\\*");
        double v1 = Double.parseDouble(ar[0]);
        double v2 = Double.parseDouble(ar[1]);
        double res = v1 * v2;
        return res;
    	
    	
    }
	
    else 
    {
    	
    		String[] ar = s.split("\\/");
	        double v1 = Double.parseDouble(ar[0]);
	        double v2 = Double.parseDouble(ar[1]);
	        double res = v1 / v2;
	        return res;
	    
    	
    }
}
    
    
    
}