package com.rabidgremlin.helloworld;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Basic tests for the Hello class.
 * 
 * @author rabidgremlin
 *
 */
public class TestHello
{
	/**
	 * Tests the world greeting.
	 * 
	 */
	@Test
	public void testWorldGreeting()
	{
		Hello hello = new Hello();

		assertThat(hello.sayHello(), is("Hello, World!"));
		assertThat(hello.sayHello(null), is("Hello, World!"));
	}

	/**
	 * Tests the greeting of Bob.
	 * 
	 */
	@Test
	public void testBobGreeting()
	{
		Hello hello = new Hello();

		assertThat(hello.sayHello("Bob"), is("Hello, Bob!"));
		assertThat(hello.sayHello("bob"), is("Hello, bob!"));
	}
}
