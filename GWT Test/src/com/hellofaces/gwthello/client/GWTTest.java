package com.hellofaces.gwthello.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.hello.hellomain.client.HelloWorldPresenter;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTTest implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		GWTHelloView myView = new GWTHelloView();
		new HelloWorldPresenter(myView);
		RootPanel.get().add(myView);
	}
}
