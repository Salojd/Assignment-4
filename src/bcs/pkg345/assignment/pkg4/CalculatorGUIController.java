
package bcs.pkg345.assignment.pkg4;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorGUIController {
    
    @FXML
    private TextField input;

    @FXML
    private Button zeroBtn;

    @FXML
    private Button oneBtn;

    @FXML
    private Button twoBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button eightBtn;

    @FXML
    private Button nineBtn;

    @FXML
    private Button addBtn;

    @FXML
    private Button subBtn;

    @FXML
    private Button multiBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button equalBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private void zeroBtnAction(){
        zeroBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "0");
    }
    });
    } 

    @FXML
    void oneBtnAction(){
        oneBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "1");
    }
    });
    } 
    
    @FXML
    void twoBtnAction(){
        twoBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "2");
    }
    });
    } 
    
    @FXML
    void threeBtnAction(){
        threeBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "3");
    }
    });
    } 
     
    @FXML
    void fourBtnAction(){
        fourBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "4");
    }
    });
    } 
     
    @FXML
    void fiveBtnAction(){
        fiveBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "5");
    }
    });
    } 
    
    @FXML
    void sixBtnAction(){
        sixBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "6");
    }
    });
    } 
    
    @FXML
    void sevenBtnAction(){
        sevenBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "7");
    }
    });
    } 
    
    @FXML
    void eightBtnAction(){
        eightBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "8");
    }
    });
    } 
    
    @FXML
    void nineBtnAction(){
        nineBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "9");
    }
    });
    } 
    
    
    @FXML
    void addBtnAction(){
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "+");
    }
    });
    } 
    
    @FXML
    void subBtnAction(){
        subBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "-");
    }
    });
    } 
    
    @FXML
    void multiBtnAction(){
        multiBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "*");
    }
    });
    } 
    
    @FXML
    void divideBtnAction(){
        divideBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(input.getText() + "/");
    }
    });
    } 
    
    @FXML
    void equalBtnAction(){
        equalBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText(getResult(input.getText().trim()) + "");
    }
    });
    }
    
    @FXML
    void clearBtnAction(){
        clearBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        input.setText("");
    } 
    });
    }
    
    private double getResult(String s){
        
    ArrayList<String> operandList = new ArrayList<String>();
    String operator = ""; 
    StringTokenizer st = new StringTokenizer(s, "+-*/", true);
    while (st.hasMoreTokens()){
        String token = st.nextToken();
        if ("+-/*".contains(token))
            operator = token.trim();
        else
            operandList.add(token.trim());
    }

    double result = 0; 
    switch(operator)
    {
    case "+" ->     {
    double a = Double.parseDouble(operandList.get(0));
    double b = Double.parseDouble(operandList.get(1));
    result = (a + b);
    }
    case "-" ->     {
    double a = Double.parseDouble(operandList.get(0));
    double b = Double.parseDouble(operandList.get(1));
    result = (a - b);
    }
    case "*" ->     {
    double a = Double.parseDouble(operandList.get(0));
    double b = Double.parseDouble(operandList.get(1));
    result = (a * b);
    }
    case "/" ->     {
    double a = Double.parseDouble(operandList.get(0));
    double b = Double.parseDouble(operandList.get(1));
    if(b == 0)
        result = 0;
    else
        result = (a / b);
    }
    }
    return result;
    }
}
