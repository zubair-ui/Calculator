package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	private String firstNumber="";
	private String secondNumber="";
	private String operator="";
	private String result="";
	
	
	@Override
	public void start(Stage stage1) {

        Image window = new Image("file:window.jpg");
        ImageView imgV = new ImageView();
		imgV.setImage(window);
		imgV.setFitWidth(200);
		imgV.setFitHeight(120);
		
		
		Label frontLabel = new Label("");
		frontLabel.setLayoutY(90);
		frontLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 17));
		
		Label backLabel = new Label("");
		backLabel.setFont(Font.font(15));
		backLabel.setOpacity(0.7);
		
		
		
		Button[] operators=new Button[5];
		operators[0]=new Button("+");
		operators[1]=new Button("- ");
		operators[2]=new Button("* ");
		operators[3]=new Button("/ ");
		operators[4]=new Button("=");
		
		Button[] numbers=new Button[12];
		int locY147=300;
		int locY0258=345;
		int locY369=300;
		int locYOperators=165;
		for(int i=0;i<12;i++) {
			if(i<10) {
			numbers[i]=new Button(""+i);
			numbers[i].setFont(Font.font(20));
			}
			else if(i==10) {
				numbers[i]=new Button("C");
				numbers[i].setFont(Font.font(19.7));
			}
			else {
				numbers[i]=new Button(". ");
				numbers[i].setFont(Font.font(20));
			}
			if(i==1||i==4||i==7) {
				numbers[i].setLayoutX(20);
				numbers[i].setLayoutY(locY147);
				locY147-=45;
			}
			else if(i==0||i==2||i==5||i==8) {
				numbers[i].setLayoutX(58);
				numbers[i].setLayoutY(locY0258);
				locY0258-=45;
			}
			else if(i==3||i==6||i==9) {
				numbers[i].setLayoutX(96);
				numbers[i].setLayoutY(locY369);
				locY369-=45;
			}
			
			if(i<5) {
				operators[i].setFont(Font.font(20));
				operators[i].setLayoutX(135);
				operators[i].setLayoutY(locYOperators);
				locYOperators+=45;
			}
			
		}
		numbers[10].setLayoutX(20);
		numbers[10].setLayoutY(345);
		numbers[11].setLayoutX(96);
		numbers[11].setLayoutY(345);
		
		
		
		Button[] allButtons=new Button[17];
		for(int i=0,y=12;i<12;i++,y++) {
			if(y<17) {
				allButtons[y]=operators[i];
			}
			allButtons[i]=numbers[i];
		}
		
		
		
		allButtons[0].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"0");
		});
		allButtons[1].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"1");
		});
		allButtons[2].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"2");
		});
		allButtons[3].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"3");
		});
		allButtons[4].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"4");
		});
		allButtons[5].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"5");
		});
		allButtons[6].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"6");
		});
		allButtons[7].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"7");
		});
		allButtons[8].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"8");
		});
		allButtons[9].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+"9");
		});
		allButtons[10].setOnAction(e ->{
			frontLabel.setText("");
			backLabel.setText("");
			firstNumber=secondNumber=result="";
		});
		allButtons[11].setOnAction(e ->{
			frontLabel.setText(frontLabel.getText()+".");
		});
		
		allButtons[12].setOnAction(e ->{
			if(result.equals("")) {
				firstNumber=frontLabel.getText();
				frontLabel.setText("");
				result=firstNumber;
			}
			operator="+";
			backLabel.setText(firstNumber+operator);
			secondNumber=frontLabel.getText();
			if(!secondNumber.equals("")) {
				double d1,d2;
				d1=Double.parseDouble(firstNumber);
				d2=Double.parseDouble(secondNumber);
				
				result="";
				result+=(d1+d2);
				frontLabel.setText("");
				backLabel.setText(result);
				firstNumber=result;
			}
		});
		allButtons[13].setOnAction(e ->{
			if(result.equals("")) {
				firstNumber=frontLabel.getText();
				frontLabel.setText("");
				result=firstNumber;
			}
			operator="-";
			backLabel.setText(firstNumber+operator);
			secondNumber=frontLabel.getText();
			if(!secondNumber.equals("")) {
				double d1,d2;
				d1=Double.parseDouble(firstNumber);
				d2=Double.parseDouble(secondNumber);
				
				result="";
				result+=(d1-d2);
				frontLabel.setText("");
				backLabel.setText(result);
				firstNumber=result;
			}
		});
		allButtons[14].setOnAction(e ->{
			if(result.equals("")) {
				firstNumber=frontLabel.getText();
				frontLabel.setText("");
				result=firstNumber;
			}
			operator="*";
			backLabel.setText(firstNumber+operator);
			secondNumber=frontLabel.getText();
			if(!secondNumber.equals("")) {
				double d1,d2;
				d1=Double.parseDouble(firstNumber);
				d2=Double.parseDouble(secondNumber);
				
				result="";
				result+=(d1*d2);
				frontLabel.setText("");
				backLabel.setText(result);
				firstNumber=result;
			}
		});
		allButtons[15].setOnAction(e ->{
			if(result.equals("")) {
				firstNumber=frontLabel.getText();
				frontLabel.setText("");
				result=firstNumber;
			}
			operator="/";
			backLabel.setText(firstNumber+operator);
			secondNumber=frontLabel.getText();
			if(!secondNumber.equals("")) {
				double d1,d2;
				d1=Double.parseDouble(firstNumber);
				d2=Double.parseDouble(secondNumber);
				
				result="";
				result+=(d1/d2);
				frontLabel.setText("");
				backLabel.setText(result);
				firstNumber=result;
			}
		});
		allButtons[16].setOnAction(e ->{
			secondNumber=frontLabel.getText();
			if(!secondNumber.equals("")) {
				double d1,d2;
				d1=Double.parseDouble(firstNumber);
				d2=Double.parseDouble(secondNumber);
				
				result="";
				if(operator.equals("+")) {
					result+=(d1+d2);
				}
				else if(operator.equals("-")) {
					result+=(d1-d2);
				}
				else if(operator.equals("*")) {
					result+=(d1*d2);
				}
				else if(operator.equals("/")) {
					result+=(d1/d2);
				}
				
				frontLabel.setText("");
				backLabel.setText(result);
				firstNumber=result;
			}
		});
		
		
		
		
		Group root = new Group(allButtons);
		root.getChildren().add(imgV);
		root.getChildren().add(frontLabel);
		root.getChildren().add(backLabel);
        Scene scene = new Scene(root, 200, 400);
        scene.setFill(Color.DEEPSKYBLUE);
        
        Image icon = new Image("file:icon.png");
        stage1.getIcons().add(icon);
        stage1.setScene(scene);
        stage1.setResizable(false);
        stage1.setTitle("Calculator");
        stage1.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
