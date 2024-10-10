package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextFlag extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Stage currentStage = new Stage();
        currentStage.setResizable(false);
        currentStage.setTitle("Lab5_5");

        Button backWindow = getBackButton(stage, currentStage);

        String[] flag = new String[3];

        Button drawFlag = new Button("Нарисовать");
        drawFlag.setOnAction(event -> {
            for(String color: flag){
                if(color == null){
                    System.out.println("Выберите значения");
                    return;
                }
            }

            System.out.println(Arrays.toString(flag));
        });

        VBox mainBox = new VBox(getFirstVBox(flag), getSecondVBox(flag), getThirdVBox(flag), drawFlag);
        mainBox.setLayoutX(10);
        mainBox.setLayoutY(50);
        Group mainGroup = new Group(backWindow, mainBox);
        Scene scene = new Scene(mainGroup, 450, 250);
        currentStage.setScene(scene);
        currentStage.show();
    }

    private static HBox getFirstVBox(String[] flag) {
        Label firstColor = new Label("Первый цвет: ");

        RadioButton colorButton1 = new RadioButton("Красный");
        RadioButton colorButton2 = new RadioButton("Зеленый");
        RadioButton colorButton3 = new RadioButton("Желтый");
        ToggleGroup firstColorGroup = new ToggleGroup();
        colorButton1.setToggleGroup(firstColorGroup);
        colorButton2.setToggleGroup(firstColorGroup);
        colorButton3.setToggleGroup(firstColorGroup);
        colorButton1.setOnAction(actionEvent -> flag[0] = colorButton1.getText());
        colorButton2.setOnAction(actionEvent -> flag[0] = colorButton2.getText());
        colorButton3.setOnAction(actionEvent -> flag[0] = colorButton3.getText());

        return new HBox(firstColor, colorButton1, colorButton2, colorButton3);
    }

    private static HBox getSecondVBox(String[] flag) {
        Label firstColor = new Label("Второй цвет: ");

        RadioButton colorButton1 = new RadioButton("Черный");
        RadioButton colorButton2 = new RadioButton("Синий");
        RadioButton colorButton3 = new RadioButton("Зеленый");
        ToggleGroup firstColorGroup = new ToggleGroup();
        colorButton1.setToggleGroup(firstColorGroup);
        colorButton2.setToggleGroup(firstColorGroup);
        colorButton3.setToggleGroup(firstColorGroup);
        colorButton1.setOnAction(actionEvent -> flag[1] = colorButton1.getText());
        colorButton2.setOnAction(actionEvent -> flag[1] = colorButton2.getText());
        colorButton3.setOnAction(actionEvent -> flag[1] = colorButton3.getText());

        return new HBox(firstColor, colorButton1, colorButton2, colorButton3);
    }

    private static HBox getThirdVBox(String[] flag) {
        Label firstColor = new Label("Третий цвет: ");

        RadioButton colorButton1 = new RadioButton("Синий");
        RadioButton colorButton2 = new RadioButton("Красный");
        RadioButton colorButton3 = new RadioButton("Оранжевый");
        ToggleGroup firstColorGroup = new ToggleGroup();
        colorButton1.setToggleGroup(firstColorGroup);
        colorButton2.setToggleGroup(firstColorGroup);
        colorButton3.setToggleGroup(firstColorGroup);
        colorButton1.setOnAction(actionEvent -> flag[2] = colorButton1.getText());
        colorButton2.setOnAction(actionEvent -> flag[2] = colorButton2.getText());
        colorButton3.setOnAction(actionEvent -> flag[2] = colorButton3.getText());

        return new HBox(firstColor, colorButton1, colorButton2, colorButton3);
    }

    private static Button getBackButton(Stage stage, Stage currentStage) {
        Button closeButton = new Button("Задание 4");
        closeButton.setLayoutX(10);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                currentStage.close();
                Calculator checkBoxes = new Calculator();
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
