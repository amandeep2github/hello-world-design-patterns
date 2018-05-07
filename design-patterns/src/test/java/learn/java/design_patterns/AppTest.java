package learn.java.design_patterns;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import learn.java.design_patterns.strategy.HelloWorldStrategy;
import learn.java.design_patterns.strategy.SimpleStrategy;



/**
 * Unit test for simple App.
 */

public class AppTest 
    
{

	PrintStream ps;
	ByteArrayOutputStream baos;
	
	@Before
	public void setup(){
		baos = new ByteArrayOutputStream(50);
    	ps = System.out;
    	System.setOut(new PrintStream(baos));
	}
	
    @Test
    public void testApp()
    {
    	
    	App.main(new String[]{});
        assertEquals("Hello World!", baos.toString() );
    }
    
    @Test
    public void testStrategy(){
    	HelloWorldStrategy hws = new HelloWorldStrategy();
    	hws.setHwStrategy(new SimpleStrategy());
    	hws.sayIt();
    	assertEquals("Hello World!", baos.toString() );
    }
    
    @After
    public void tearDown(){
    	System.setOut(ps);
    }
    
    
}
