package com.hellogwt.hello.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.hello.hellomain.client.HelloWorldViewInterface;
import com.hello.hellomain.client.Listener;

public class HelloView extends Composite implements HelloWorldViewInterface{

	private static HelloViewUiBinder uiBinder = GWT
			.create(HelloViewUiBinder.class);

	interface HelloViewUiBinder extends UiBinder<Widget, HelloView> {
	}

	@UiField
	Button HelloButton;
	Listener myListner;
	@UiField
	Label HelloLabel;

	public HelloView() {
		initWidget(uiBinder.createAndBindUi(this));
		HelloButton.setText("Button");
	}

	@Override
	public void setClickListener(Listener inListener) {
		myListner = inListener;
		
	}

	@Override
	public void setClickText(String clickText) {
		HelloButton.setText(clickText);
		
	}

	@Override
	public void setHelloText(String labelText) {
		HelloLabel.setText(labelText);
		
	}


}
