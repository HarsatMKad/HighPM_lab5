package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CheckBoxes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Stage currentStage = new Stage();
        currentStage.setResizable(false);
        currentStage.setTitle("Lab5_2");

        Button closeButton = new Button("Задание 1");
        closeButton.setLayoutX(10);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                WordSwapper wordSwapper = new WordSwapper();
                try {
                    currentStage.close();
                    wordSwapper.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Button nextWindow = getNextButton(stage, currentStage);

        Scene scene = getScene(closeButton, nextWindow);
        currentStage.setScene(scene);
        currentStage.show();
    }

    private static Button getNextButton(Stage stage, Stage currentStage) {
        Button nextWindow = new Button();
        nextWindow.setText("Задание 3");
        nextWindow.setLayoutX(350);
        nextWindow.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                RestauranOrder restauranOrder = new RestauranOrder();
                try {
                    currentStage.close();
                    restauranOrder.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return nextWindow;
    }

    private static Scene getScene(Button closeButton, Button nextWindow) {
        Label label1 = new Label("Текст 1");
        label1.setLayoutX(20);
        label1.setLayoutY(50);
        Label label2 = new Label("Текст 2");
        label2.setLayoutX(20);
        label2.setLayoutY(100);
        Label label3 = new Label("Текст 3");
        label3.setLayoutX(20);
        label3.setLayoutY(150);
        Label label4 = new Label("Текст 4");
        label4.setLayoutX(20);
        label4.setLayoutY(200);
        CheckBox cb1 = new CheckBox();
        cb1.fire();
        cb1.setLayoutX(100);
        cb1.setLayoutY(50);
        cb1.setOnAction(actionEvent1 -> label1.setVisible(cb1.isSelected()));
        CheckBox cb2 = new CheckBox();
        cb2.setLayoutX(100);
        cb2.setLayoutY(100);
        cb2.fire();
        cb2.setOnAction(actionEvent2 -> label2.setVisible(cb2.isSelected()));
        CheckBox cb3 = new CheckBox();
        cb3.setLayoutX(100);
        cb3.setLayoutY(150);
        cb3.fire();
        cb3.setOnAction(actionEvent3 -> label3.setVisible(cb3.isSelected()));
        CheckBox cb4 = new CheckBox();
        cb4.setLayoutX(100);
        cb4.setLayoutY(200);
        cb4.fire();
        cb4.setOnAction(actionEvent4 -> label4.setVisible(cb4.isSelected()));

        Group root = new Group(closeButton, label1, label2, label3, label4, cb1, cb2, cb3, cb4, nextWindow);
        return new Scene(root, 450, 250);
    }
}
