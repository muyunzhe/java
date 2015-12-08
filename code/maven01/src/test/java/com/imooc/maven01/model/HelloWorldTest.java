package com.imooc.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest{
	@Test
	public void testHello(){
		Assert.assertEquals("hello world!",new HelloWorld().sayHello());
	}
}
