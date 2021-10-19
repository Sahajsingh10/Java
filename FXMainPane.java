package lab5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	
	Label label1;
	
	TextField text;
	HBox h1;
	HBox h2;
	HBox h3;
	
	
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	DataManager n;
	
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		Button button1 = new Button("Hello");
		Button button2 = new Button("Howdy");
		Button button3 = new Button("chinese");
		Button button4 = new Button("clear");
		Button button5 = new Button("Exit");
		
		Label label1 = new Label("Feedback");
		
		TextField text = new TextField();
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		 n = new DataManager();
		
		h1.setAlignment(Pos.CENTER);
		h2.setAlignment(Pos.CENTER);
		
		Insets val = new Insets(10);
		HBox.setMargin(button1, val);
		HBox.setMargin(button2, val);
		HBox.setMargin(button3, val);
		HBox.setMargin(button4, val);
		HBox.setMargin(button5, val);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		h1.getChildren().addAll(button1,button2,button3,button4,button5);
		h2.getChildren().addAll(label1,text);		
		getChildren().addAll(h1,h2);
		
		
		
		
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	 class ButtonHandler implements EventHandler<ActionEvent>{
		 	
		public void handle(ActionEvent event) {
			if (event.getTarget() == button1) {
				text.setText(DataManager.getHello());
			}
			else if (event.getTarget() == button2) {
				text.setText(DataManager.getHowdy());
			}
			else if (event.getTarget() == button3) {
				text.setText(DataManager.getChinese());
			}
			else if (event.getTarget() == button4) {
				text.setText("");
			}
			else if (event.getTarget() == button5) {
				System.exit(0);
				Platform.exit();
				
			}
		}
	 }
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
	
	}
	 
	}


