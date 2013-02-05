package gnu.testlet.java.report.ui;

import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.JavaUtilTest;
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
	public Main() {
		initWidget(uiBinder.createAndBindUi(this));
		javaLangButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				JavaLangTests javaLangTests = new JavaLangTests(); 		
				Tester tester = new Tester(javaLangTests.getTests());
				tester.testAll(); 
				String result = tester.buildHTMLReport();
				Document.get().getBody().setInnerHTML(result); 
			}
		}); 
		
		javaUtilButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				JavaUtilTest javaUtilTests = new JavaUtilTest(); 		
				Tester tester = new Tester(javaUtilTests.getTests());
				tester.testAll(); 
				String result = tester.buildHTMLReport();
				Document.get().getBody().setInnerHTML(result); 
			}
		}); 
	}

}
