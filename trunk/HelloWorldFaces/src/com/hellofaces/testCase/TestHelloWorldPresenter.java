package com.hellofaces.testCase;

import com.hello.hellomain.client.HelloWorldPresenter;
import com.hello.hellomain.client.HelloWorldViewInterface;
import com.hello.hellomain.client.Listener;

import junit.framework.TestCase;

public class TestHelloWorldPresenter extends TestCase {

	class MockView implements HelloWorldViewInterface
	{

		String labelText;
		String clickText;
		Listener myListner;
		@Override
		public void setHelloText(String labelText) {
			this.labelText = labelText;
			
		}

		@Override
		public void setClickListener(Listener inListener) {
			myListner = inListener;
			
		}

		@Override
		public void setClickText(String clickText) {
			this.clickText = clickText;
			
		}
		
	}
	
	public void testStartUp()
	{
		MockView testView = new MockView();
		HelloWorldPresenter myPresenter = new HelloWorldPresenter(testView);
		assertEquals("Hello World", testView.labelText);
		assertEquals("ClickMe", testView.clickText);
	}
	
	public void testSimpleClick()
	{
		MockView testView = new MockView();
		HelloWorldPresenter myPresenter = new HelloWorldPresenter(testView);
		testView.myListner.onAction();
		assertEquals("I was Clicked", testView.labelText);
	}
}
