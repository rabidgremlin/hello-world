package com.rabidgremlin.helloworld;

/**
 * Simple class for saying hello.
 * 
 * @author rabidgremlin
 *
 */
public class Hello
{
	/**
	 * Returns a hello string greeting the specified person.
	 * 
	 * @param toWhom
	 *            The name of the person to greet. If toWhom is null then the World is greeted.
	 * @return A nicely formatted hello string.
	 */
	public String sayHello(String toWhom)
	{
		if (toWhom == null)
		{
			return "Hello, World!";
		}

		return "Hello, " + toWhom + "!";
	}

	/**
	 * Returns a hello string.
	 * 
	 * @return A nicely formatted hello string.
	 */
	public String sayHello()
	{
		return sayHello(null);
	}
}
