import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.animation.*;
//U10416038 Ma Chia-Liang
public class TestPane extends Application {
	double now=0.0;
	double temp = 0.0 ;
	int cal = 5;
	boolean isDouble=false;
	boolean isMid=false;
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  
	
	
    // Create a scene and place a button in the scene
	Button btn[] = new Button[28];
	// Arrays for Creating Buttons
	String btnContent[] = {"MC", "MR", "MS", "M+", "M-",
            "←", "CE", "C", "±", "√", "7", "8", "9", "/",
            "%", "4", "5", "6", "*", "1/x","1","2","3","-","=",
            "0",".","+"};
	
    Pane pane = new Pane();
	//Create a MenuBar
	MenuBar menu = new MenuBar();
	//Create three Menus for the Bar
	Menu mlist1 = new Menu("檢視(V)");
    Menu mlist2 = new Menu("編輯(E)");
    Menu mlist3 = new Menu("說明(H)");
	//Add item to Menu
    MenuItem mitem1[] = new MenuItem[10];
	//Arrays for name Item
    String nameForItem1[] = {"標準型(T)","工程型(S)","程式設計師(P)","統計資料(A)","歷程紀錄(Y)","數字分位(I)","基本(B)","單位換算(U)","日期計算(D)","工作表(W)"};
	for(int j=0;j<10;++j) {
        mitem1[j] = new MenuItem(nameForItem1[j]);
        mlist1.getItems().add(mitem1[j]);
    }
	MenuItem mitem2[] = new MenuItem[3];
	String nameForItem2[] = {"複製(C)","貼上(P)","歷程記錄(H)"};
	for(int j=0;j<3;++j) {
        mitem2[j] = new MenuItem(nameForItem1[j]);
        mlist2.getItems().add(mitem2[j]);
    }
	//Add the Menus to the Bar
	menu.getMenus().addAll(mlist1,mlist2,mlist3);
    menu.setLayoutX(20);
	//Add the Bar to Pane
	pane.getChildren().add(menu);
	
	//The TextArea showing Result
	TextArea result = new TextArea();
    pane.getChildren().add(result);
    result.setPrefSize(260, 100);
    result.setLayoutX(10);
    result.setLayoutY(35);
    result.setEditable(false);
	
	
	//Set buttons
	for(int i = 0;i<28;++i) {
        /* Create every Button and set their default size */
        btn[i] = new Button(btnContent[i]);
        btn[i].setPrefSize(46, 30);
        if(i<=4) {
            btn[i].setLayoutX(15+51*i);
            btn[i].setLayoutY(146);
            pane.getChildren().add(btn[i]);
        }
        else if(i>4&&i<=9) {
            btn[i].setLayoutX(15+51*(i-5));
            btn[i].setLayoutY(185);
            pane.getChildren().add(btn[i]);
        }
        else if(i>9&&i<=14) {
            btn[i].setLayoutX(15+51*(i-10));
            btn[i].setLayoutY(224);
            pane.getChildren().add(btn[i]);
        }
        else if(i>14&&i<=19) {
            btn[i].setLayoutX(15+51*(i-15));
            btn[i].setLayoutY(263);
            pane.getChildren().add(btn[i]);
        }
        else if(i>19&&i<=23) {
            btn[i].setLayoutX(15+51*(i-20));
            btn[i].setLayoutY(302);
            pane.getChildren().add(btn[i]);
        }
        else if(i==24) {
            btn[i].setLayoutX(15+51*(i-20));
            btn[i].setLayoutY(302);
            btn[i].setPrefSize(46, 70);
            pane.getChildren().add(btn[i]);
        }
        else if(i==25) {
            btn[i].setLayoutX(15+51*(i-25));
            btn[i].setLayoutY(341);
            btn[i].setPrefSize(96, 13);
            pane.getChildren().add(btn[i]);
        }
        else {
            btn[i].setLayoutX(15+51*(i-24));
            btn[i].setLayoutY(341);
            pane.getChildren().add(btn[i]);
            }  
        }
		
		btn[5].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			String s = result.getText();
            s = s.substring(0, s.length() - 1);
            result.setText(s);
        }
      }
    );



		btn[6].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			result.clear();
			cal=5;
			isDouble=false;
        }
      }
    );
	
	btn[7].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			result.clear();
			isDouble=false;
        }
      }
    );
	
	btn[8].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			 result.setText(String.valueOf(-Double.valueOf(result.getText())));
        }
      }
    );
	
	btn[10].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
			
          result.appendText("7");
        }
      }
    );
	
	btn[11].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("8");
        }
      }
    );
	
	btn[12].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("9");
        }
      }
    );
	
	btn[15].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("4");
        }
      }
    );
	
	btn[16].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("5");
        }
      }
    );
	
	btn[17].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("6");
        }
      }
    );
	
	btn[20].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("1");
        }
      }
    );
	
	btn[21].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("2");
        }
      }
    );
	
	btn[22].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
          result.appendText("3");
        }
      }
    );
	
	btn[25].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(cal==0){
				result.clear();
				cal = 5;
			}else if(isMid==true){
				result.clear();
				isMid=false;
			}
			result.appendText("0");
        }
      }
    );
	
	btn[26].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			if(isDouble==false){
				result.appendText(".");
				isDouble=true;
			}
        }
      }
    );
	
	btn[27].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			
			if(cal==5){
				now=Double.valueOf(result.getText());
				cal = 1;
				isDouble=false;
				result.clear();
				
			}else if(cal == 1){
				temp=Double.valueOf(result.getText());
			  double a = now+temp;
			    now = a;
				cal = 1;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 2){
			  temp=Double.valueOf(result.getText());
			  double a = now-temp;
			    now = a;
				cal = 1;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 3){
			  temp=Double.valueOf(result.getText());
			  double a = now*temp;
			    now = a;
				cal = 1;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 4){
			  temp=Double.valueOf(result.getText());
			  double a = now/temp;
			    now = a;
				cal = 1;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }
        }
        
      }
    );
	
	btn[23].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			
			if(cal==5){
				now=Double.valueOf(result.getText());
				cal = 2;
				isDouble=false;
				result.clear();
				
			}else if(cal == 1){
				temp=Double.valueOf(result.getText());
			  double a = now+temp;
			    now = a;
				cal = 2;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 2){
			  temp=Double.valueOf(result.getText());
			  double a = now-temp;
			    now = a;
				cal = 2;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 3){
			  temp=Double.valueOf(result.getText());
			  double a = now*temp;
			    now = a;
				cal = 2;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 4){
			  temp=Double.valueOf(result.getText());
			  double a = now/temp;
			    now = a;
				cal = 2;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
		  }
        }
      }
    );
	
	btn[18].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			
			if(cal==5){
				now=Double.valueOf(result.getText());
				cal = 3;
				isDouble=false;
				result.clear();
				
			}else if(cal == 1){
				temp=Double.valueOf(result.getText());
			  double a = now+temp;
			    now = a;
				cal = 3;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 2){
			  temp=Double.valueOf(result.getText());
			  double a = now-temp;
			    now = a;
				cal = 3;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 3){
			  temp=Double.valueOf(result.getText());
			  double a = now*temp;
			    now = a;
				cal = 3;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 4){
			  temp=Double.valueOf(result.getText());
			  double a = now/temp;
			    now = a;
				cal = 3;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }
        }
      }
    );

	btn[13].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
			
			if(cal==5){
				now=Double.valueOf(result.getText());
				cal = 4;
				isDouble=false;
				result.clear();
				
			}else if(cal == 1){
				temp=Double.valueOf(result.getText());
			  double a = now+temp;
			    now = a;
				cal = 4;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 2){
			  temp=Double.valueOf(result.getText());
			  double a = now-temp;
			    now = a;
				cal = 4;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 3){
			  temp=Double.valueOf(result.getText());
			  double a = now*temp;
			    now = a;
				cal = 4;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }else if(cal == 4){
			  temp=Double.valueOf(result.getText());
			  double a = now/temp;
			    now = a;
				cal = 4;
				isDouble=false;
				result.setText(String.valueOf(a));
				isMid=true;
				
		  }
        }
      }
    );
	
	btn[24].setOnAction(new EventHandler<ActionEvent>() {
        @Override 
        public void handle(ActionEvent e) {
          temp=Double.valueOf(result.getText());
		  if(cal == 1){
			  double a = now+temp;
			    result.setText(String.valueOf(a));
				cal = 0;
				isDouble=false;
				
				
		  }if(cal == 2){
			  double a = now-temp;
			    result.setText(String.valueOf(a));
				cal = 0;
				isDouble=false;
				
		  }if(cal == 3){
			  double a = now*temp;
			    result.setText(String.valueOf(a));
				cal = 0;
				isDouble=false;
				
		  }if(cal == 4){
			  double a = now/temp;
			    result.setText(String.valueOf(a));
				cal = 0;
				isDouble=false;
				
		  }
        }
      }
    );
	
		//Set for stage and scene
		Scene scene = new Scene(pane, 270, 380);
        primaryStage.setResizable(false);
        primaryStage.setTitle("U10416038   Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
   //Main method
  public static void main(String[] args) {
    launch(args);
  }
}
