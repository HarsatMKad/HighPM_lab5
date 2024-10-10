package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Objects;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Stage currentStage = new Stage();
        currentStage.setResizable(false);
        currentStage.setTitle("Lab5_4");

        Button nextWindow = getNextButton(stage, currentStage);
        Button backWindow = getBackButton(stage, currentStage);

        ArrayList<String> expression = new ArrayList<>();
        expression.add("");

        Label mainTextForm = new Label("");
        mainTextForm.minHeight(50);
        mainTextForm.minWidth(300);

        int buttonSize = 30;
        Button delButton = new Button("C");
        delButton.setMinHeight(buttonSize);
        delButton.setMinWidth(buttonSize);

        Button number0 = new Button("0");
        number0.setMinHeight(buttonSize);
        number0.setMinWidth(buttonSize);
        Button number1 = new Button("1");
        number1.setMinHeight(buttonSize);
        number1.setMinWidth(buttonSize);
        Button number2 = new Button("2");
        number2.setMinHeight(buttonSize);
        number2.setMinWidth(buttonSize);
        Button number3 = new Button("3");
        number3.setMinHeight(buttonSize);
        number3.setMinWidth(buttonSize);
        Button number4 = new Button("4");
        number4.setMinHeight(buttonSize);
        number4.setMinWidth(buttonSize);
        Button number5 = new Button("5");
        number5.setMinHeight(buttonSize);
        number5.setMinWidth(buttonSize);
        Button number6 = new Button("6");
        number6.setMinHeight(buttonSize);
        number6.setMinWidth(buttonSize);
        Button number7 = new Button("7");
        number7.setMinHeight(buttonSize);
        number7.setMinWidth(buttonSize);
        Button number8 = new Button("8");
        number8.setMinHeight(buttonSize);
        number8.setMinWidth(buttonSize);
        Button number9 = new Button("9");
        number9.setMinHeight(buttonSize);
        number9.setMinWidth(buttonSize);

        Button dotButton = new Button(".");
        dotButton.setMinHeight(buttonSize);
        dotButton.setMinWidth(buttonSize);
        dotButton.setDisable(true);
        Button equalsButton = new Button("=");
        equalsButton.setMinHeight(buttonSize);
        equalsButton.setMinWidth(buttonSize);
        equalsButton.setDisable(true);

        Button plusButton = new Button("+");
        plusButton.setMinHeight(buttonSize);
        plusButton.setMinWidth(buttonSize);
        plusButton.setDisable(true);
        Button minusButton = new Button("-");
        minusButton.setMinHeight(buttonSize);
        minusButton.setMinWidth(buttonSize);
        Button multiplyButton = new Button("*");
        multiplyButton.setMinHeight(buttonSize);
        multiplyButton.setMinWidth(buttonSize);
        multiplyButton.setDisable(true);
        Button divideButton = new Button("/");
        divideButton.setMinHeight(buttonSize);
        divideButton.setMinWidth(buttonSize);
        divideButton.setDisable(true);

        delButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(!Objects.equals(expression.getLast(), "")){
                    expression.removeLast();
                    mainTextForm.setText("");
                    expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                }
                if(expression.size() == 1){
                    mainTextForm.setText("");
                    plusButton.setDisable(true);
                    minusButton.setDisable(true);
                    multiplyButton.setDisable(true);
                    divideButton.setDisable(true);
                    dotButton.setDisable(true);
                }
            }
        });

        number0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("0");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("1");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("2");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("3");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("4");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("5");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("6");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("7");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("8");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        number9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("9");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(false);
                minusButton.setDisable(false);
                multiplyButton.setDisable(false);
                divideButton.setDisable(false);
                dotButton.setDisable(false);
                equalsButton.setDisable(false);
            }
        });

        dotButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add(".");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);
            }
        });

        plusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("+");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);
            }
        });

        minusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("-");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);
            }
        });

        multiplyButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("*");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);
            }
        });

        divideButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                expression.add("/");
                mainTextForm.setText("");
                expression.forEach(s -> mainTextForm.setText(mainTextForm.getText()+s));
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);
            }
        });

        equalsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                plusButton.setDisable(true);
                minusButton.setDisable(true);
                multiplyButton.setDisable(true);
                divideButton.setDisable(true);
                dotButton.setDisable(true);

                ArrayList<Double> numberList = new ArrayList<>();
                ArrayList<String> operatorList = new ArrayList<>();
                expression.add("&");

                boolean firstMinus = false;
                if(Objects.equals(expression.get(1), "-")){
                    expression.remove(1);
                    firstMinus = true;
                }

                String number = "";
                for(String symbol: expression){
                    switch (symbol) {
                        case "+":
                            if(firstMinus){
                                firstMinus = false;
                                numberList.add(Double.parseDouble(number)*-1);
                            }else {
                                numberList.add(Double.valueOf(number));
                            }
                            operatorList.add("+");
                            number = "";
                            break;
                        case "-":
                            if(firstMinus){
                                firstMinus = false;
                                numberList.add(Double.parseDouble(number)*-1);
                            }else {
                                numberList.add(Double.valueOf(number));
                            }
                            operatorList.add("-");
                            number = "";
                            break;
                        case "*":
                            if(firstMinus){
                                firstMinus = false;
                                numberList.add(Double.parseDouble(number)*-1);
                            }else {
                                numberList.add(Double.valueOf(number));
                            }
                            operatorList.add("*");
                            number = "";
                            break;
                        case "/":
                            if(firstMinus){
                                firstMinus = false;
                                numberList.add(Double.parseDouble(number)*-1);
                            }else {
                                numberList.add(Double.valueOf(number));
                            }
                            operatorList.add("/");
                            number = "";
                            break;
                        case "&":
                            numberList.add(Double.valueOf(number));
                            break;
                        default:
                            number += symbol;
                            break;
                    }
                }

                double result = numberList.getFirst();
                for(int i = 0; i < operatorList.size(); i++){
                    switch (operatorList.get(i)){
                        case "+":
                            result += numberList.get(i+1);
                            break;
                        case "-":
                            result -= numberList.get(i+1);
                            break;
                        case "*":
                            result *= numberList.get(i+1);
                            break;
                        case "/":
                            if(numberList.get(i+1) == 0){
                                expression.clear();
                                expression.add("");
                                mainTextForm.setText("Error: " + result + " / 0");
                                return;
                            }
                            result /= numberList.get(i+1);
                            break;
                    }
                }

                expression.clear();
                expression.add("");
                mainTextForm.setText(String.valueOf(result));
            }
        });

        HBox line1 = new HBox(delButton);
        HBox line2 = new HBox(number7, number8, number9, plusButton);
        HBox line3 = new HBox(number4, number5, number6, minusButton);
        HBox line4 = new HBox(number1, number2, number3, multiplyButton);
        HBox line5 = new HBox(number0, dotButton, equalsButton, divideButton);

        VBox mainBox = new VBox(mainTextForm, line1, line2, line3, line4, line5);
        mainBox.setLayoutX(150);
        mainBox.setLayoutY(50);
        Group buttonGroup = new Group(backWindow, nextWindow);
        Group mainGroup = new Group(buttonGroup, mainBox);
        Scene scene = new Scene(mainGroup, 450, 250);
        currentStage.setScene(scene);
        currentStage.show();
    }

    private static Button getNextButton(Stage stage, Stage currentStage) {
        Button nextWindow = new Button();
        nextWindow.setText("Задание 5");
        nextWindow.setLayoutX(350);
        nextWindow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                currentStage.close();
                TextFlag checkBoxes = new TextFlag();
                try {
                    checkBoxes.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return nextWindow;
    }

    private static Button getBackButton(Stage stage, Stage currentStage) {
        Button closeButton = new Button("Задание 3");
        closeButton.setLayoutX(10);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                currentStage.close();
                RestauranOrder checkBoxes = new RestauranOrder();
                try {
                    checkBoxes.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return closeButton;
    }
}
