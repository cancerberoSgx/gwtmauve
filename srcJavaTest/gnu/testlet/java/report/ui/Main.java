package gnu.testlet.java.report.ui;

import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.JavaUtilTest;
import gnu.testlet.java.report.MainController;
import gnu.testlet.java.report.Tester;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Widget, Main> {
	}

	@UiField Button javaLangButton, javaUtilButton;
	private MainController controller; 
	public Main() {
		controller = new MainController();
		initWidget(uiBinder.createAndBindUi(this));
		javaLangButton.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				controller.performJavaLangTests(); 
			}
		}); 		
		javaUtilButton.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				controller.performJavaUtilTests(); 
			}
		}); 
	}

}
