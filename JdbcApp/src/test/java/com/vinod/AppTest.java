package com.vinod;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	JdbcTest jt = new JdbcTest();
    	jt.displayEmpDetails();
        assertTrue( true );
    }
}
