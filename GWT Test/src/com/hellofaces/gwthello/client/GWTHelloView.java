package com.hellofaces.gwthello.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.hello.hellomain.client.HelloWorldViewInterface;
import com.hello.hellomain.client.Listener;

public class GWTHelloView extends Composite implements HelloWorldViewInterface {

	private static GWTHelloViewUiBinder uiBinder = GWT
			.create(GWTHelloViewUiBinder.class);

	interface GWTHelloViewUiBinder extends UiBinder<Widget, GWTHelloView> {
	}

	private Listener clickListener;
	
	@UiField Label HelloLabel;
	@UiField Button ClickButton;
	
	public GWTHelloView() {
		
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setClickListener(Listener inListener) {
		clickListener = inListener;
		
	}

	@Override
	public void setClickText(String clickText) {
		ClickButton.setText(clickText);
	}

	@Override
	public void setHelloText(String labelText) {
		HelloLabel.setText(labelText);
		
	}
	
	@UiHandler("ClickButton")
	public void onClickEvent(ClickEvent inClick)
	{
		clickListener.onAction();
	}
}
