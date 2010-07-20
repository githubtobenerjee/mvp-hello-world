package com.hellogwt.hello.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.hello.hellomain.client.HelloWorldPresenter;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTHello implements EntryPoint {

	public void onModuleLoad() {
		HelloView myView = new HelloView();
		new HelloWorldPresenter(myView);
		RootPanel.get().add(myView);
	}
}
