package com.hello.hellomain.client;

public class HelloWorldPresenter {
	
	HelloWorldViewInterface myView;
	
	public HelloWorldPresenter(HelloWorldViewInterface inView) {
		bind(inView);
	}
	
	public void bind(HelloWorldViewInterface inInterface)
	{
		myView = inInterface;
		myView.setClickListener(new Listener() {
			
			@Override
			public void onAction() {
				myView.setHelloText("I was Clicked");
				
			}
		});
		myView.setHelloText("Hello World");
		myView.setClickText("ClickMe");
	}

}
