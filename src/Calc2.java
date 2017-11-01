import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calc2 extends Application{
	
	int num1 =0;
	int num2 = 0;
	int result = 0;
	int pressed = 0; 
	
	public static void main(String[] args){
		launch(args);
	}
   
	
	public void start(Stage stage) throws Exception{
		ButtonPressed buttonPressed = new ButtonPressed(); 

		
		stage.setTitle("Calculator");
		
		TextField tfNum1;
		TextField tfNum2;
		Button btnDivide;
		Button btnMultiply;
		Button btnAddition;
		Button btnSubtraction;
		Button btnClear;
		Label lblAnswer;
		Label prompt1, prompt2;
		prompt1 = new Label("Number 1:");
		prompt2 = new Label("Number 2:");
		lblAnswer = new Label("Answer: 0");

		
		
		tfNum1 = new TextField();
		tfNum2 = new TextField();
		
		
		HBox hb = new HBox();
		
		tfNum1.setText("0");
		tfNum2.setText("0");

		
		
		btnDivide = new Button("/");
		btnDivide.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				num1 = Integer.parseInt(tfNum1.getText());
				num2 = Integer.parseInt(tfNum2.getText());

				
				/*result = num1 / num2;
				lblAnswer.setText(("Answer: " + result));		*/
				
				pressed = 4;
				ButtonCalc butt = buttonPressed.getButton(pressed);
				result = butt.compute(num1, num2);
				lblAnswer.setText(("Answer: " + result));

			}
		
		
	});
		
		
		btnMultiply = new Button("*");
		btnMultiply.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				num1 = Integer.parseInt(tfNum1.getText());
				num2 = Integer.parseInt(tfNum2.getText());
				/*result = num1 * num2;
				lblAnswer.setText(("Answer: " + result));	*/	
				
				pressed = 3;
				ButtonCalc butt = buttonPressed.getButton(pressed);
				result = butt.compute(num1, num2);
				lblAnswer.setText(("Answer: " + result));
			}
		
		
	});
		
		
		btnAddition = new Button("+");
		btnAddition.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				num1 = Integer.parseInt(tfNum1.getText());
				num2 = Integer.parseInt(tfNum2.getText());
				/*result = num1 + num2;
				lblAnswer.setText(("Answer: " + result));	*/	
				
				pressed = 1;
				ButtonCalc butt = buttonPressed.getButton(pressed);
				result = butt.compute(num1, num2);
				lblAnswer.setText(("Answer: " + result));
			}
		
		
	});
		
		
		btnSubtraction = new Button("-");
		btnSubtraction.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				num1 = Integer.parseInt(tfNum1.getText());
				num2 = Integer.parseInt(tfNum2.getText());
				/*result = num1 - num2;
				lblAnswer.setText(("Answer: " + result));	*/		
				
				pressed = 2;
				ButtonCalc butt = buttonPressed.getButton(pressed);
				result = butt.compute(num1, num2);
				lblAnswer.setText(("Answer: " + result));
			}
		
		
	});
		
		
		btnClear = new Button("Clear");
		btnClear.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				
				tfNum1.setText("0");
				tfNum2.setText("0");

				
				num1 = 0;
				num2 = 0;
				result = 0;
				lblAnswer.setText(("Answer: " + result));						
			}
		
		
	});
		
		
		       
		VBox root = new VBox();	
		Scene scene = new Scene(root, 500, 500); //Window Size
		stage.setScene(scene);
		
		hb.getChildren().addAll(prompt1, tfNum1);
		hb.setSpacing(10);
		root.getChildren().addAll(prompt1, tfNum1, prompt2, tfNum2, btnDivide, btnMultiply, btnAddition, btnSubtraction, btnClear, lblAnswer);
		stage.show();
	}
	
	
	
	
	
}
