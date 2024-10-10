package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WordSwapper extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final boolean[] fieldKey = {false};
        stage.setResizable(false);

        Button swapButton = new Button("-->");
        swapButton.setLayoutX(200);
        swapButton.setLayoutY(100);

        Button nextWindow = new Button();
        nextWindow.setText("Задание 2");
        nextWindow.setLayoutX(350);

        TextField firstField = new TextField();
        firstField.setLayoutX(10);
        firstField.setLayoutY(100);

        TextField secondField = new TextField();
        secondField.setLayoutX(280);
        secondField.setLayoutY(100);

        swapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(fieldKey[0]){
                    firstField.setText(secondField.getText());
                    secondField.setText("");
                    swapButton.setText("-->");
                    fieldKey[0] = false;
                } else {
                    secondField.setText(firstField.getText());
                    firstField.setText("");
                    swapButton.setText("<--");
                    fieldKey[0] = true;
                }
            }
        });

        nextWindow.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                CheckBoxes cb = new CheckBoxes();
                try {
                    stage.close();
                    cb.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Group root = new Group(swapButton, firstField, secondField, nextWindow);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Lab5_1");
        stage.setWidth(450);
        stage.setHeight(250);
        stage.show();
    }
}
