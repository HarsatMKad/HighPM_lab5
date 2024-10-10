package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.*;
import java.util.function.UnaryOperator;

public class RestauranOrder extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Stage currentStage = new Stage();
        currentStage.setResizable(false);
        currentStage.setTitle("Lab5_3");

        Button nextWindow = getNextButton(stage, currentStage);
        Button backWindow = getBackButton(stage, currentStage);

        UnaryOperator<TextFormatter.Change> filter = c -> {
            if (c.getControlNewText().matches("\\d*")) {
                return c;
            }
            return null;
        };

        TextField dish1 = new TextField("1");
        dish1.setLayoutX(150);
        dish1.setLayoutY(50);
        dish1.setVisible(false);
        TextFormatter<String> formatter1 = new TextFormatter<>(filter);
        dish1.setTextFormatter(formatter1);

        TextField dish2 = new TextField("1");
        dish2.setLayoutX(150);
        dish2.setLayoutY(100);
        dish2.setVisible(false);
        TextFormatter<String> formatter2 = new TextFormatter<>(filter);
        dish2.setTextFormatter(formatter2);

        TextField dish3 = new TextField("1");
        dish3.setLayoutX(150);
        dish3.setLayoutY(150);
        dish3.setVisible(false);
        TextFormatter<String> formatter3 = new TextFormatter<>(filter);
        dish3.setTextFormatter(formatter3);

        TextField dish4 = new TextField("1");
        dish4.setLayoutX(150);
        dish4.setLayoutY(200);
        dish4.setVisible(false);
        TextFormatter<String> formatter4 = new TextFormatter<>(filter);
        dish4.setTextFormatter(formatter4);

        int dish1Price = 30;
        int dish2Price = 12;
        int dish3Price = 55;
        int dish4Price = 31;

        CheckBox dish1cb = new CheckBox("Блюдо1 - цена: " + dish1Price);
        dish1cb.setLayoutX(10);
        dish1cb.setLayoutY(50);
        dish1cb.setOnAction(actionEvent1 -> dish1.setVisible(dish1cb.isSelected()));
        CheckBox dish2cb = new CheckBox("Блюдо2 - цена: " + dish2Price);
        dish2cb.setLayoutX(10);
        dish2cb.setLayoutY(100);
        dish2cb.setOnAction(actionEvent2 -> dish2.setVisible(dish2cb.isSelected()));
        CheckBox dish3cb = new CheckBox("Блюдо3 - цена: " + dish3Price);
        dish3cb.setLayoutX(10);
        dish3cb.setLayoutY(150);
        dish3cb.setOnAction(actionEvent3 -> dish3.setVisible(dish3cb.isSelected()));
        CheckBox dish4cb = new CheckBox("Блюдо4 - цена: " + dish4Price);
        dish4cb.setLayoutX(10);
        dish4cb.setLayoutY(200);
        dish4cb.setOnAction(actionEvent4 -> dish4.setVisible(dish4cb.isSelected()));

        Button orderButton = new Button("Сделать заказ");
        orderButton.setLayoutX(350);
        orderButton.setLayoutY(200);
        orderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage modalStage = new Stage();

                LinkedList<String> order = getOrder();
                StringBuilder resultOrder = new StringBuilder("Ваш заказ: \n");

                for(String pos: order){
                    resultOrder.append(pos).append("\n");
                }

                Label orderResult = new Label(resultOrder.toString());
                orderResult.setLayoutX(10);
                orderResult.setLayoutY(10);

                Button closeButton = new Button("ok");
                closeButton.setLayoutX(100);
                closeButton.setLayoutY(150);
                closeButton.setOnAction(actionEvent1 -> modalStage.close());

                Group root = new Group(orderResult, closeButton);
                modalStage.setScene(new Scene(root,350, 200));
                modalStage.setTitle("Order");
                modalStage.initModality(Modality.WINDOW_MODAL);
                modalStage.initOwner(currentStage);
                modalStage.show();
            }

            private LinkedList<String> getOrder() {
                LinkedList<String> order = new LinkedList<>();
                int chekPrise = 0;
                if(dish1cb.isSelected()){
                    order.add("Блюдо1 - Количество: " + dish1.getText() + " - Итоговая стоимость: " + (Integer.parseInt(dish1.getText()) * dish1Price));
                    chekPrise += (Integer.parseInt(dish1.getText()) * dish1Price);
                }
                if(dish2cb.isSelected()){
                    order.add("Блюдо2 - Количество: " + dish2.getText() + " - Итоговая стоимость: " + (Integer.parseInt(dish2.getText()) * dish2Price));
                    chekPrise += (Integer.parseInt(dish2.getText()) * dish2Price);
                }
                if(dish3cb.isSelected()){
                    order.add("Блюдо3 - Количество: " + dish3.getText() + " - Итоговая стоимость: " + (Integer.parseInt(dish3.getText()) * dish3Price));
                    chekPrise += (Integer.parseInt(dish3.getText()) * dish3Price);
                }
                if(dish4cb.isSelected()){
                    order.add("Блюдо4 - Количество: " + dish4.getText() + " - Итоговая стоимость: " + (Integer.parseInt(dish4.getText()) * dish4Price));
                    chekPrise += (Integer.parseInt(dish4.getText()) * dish4Price);
                }

                order.add("\n\nСуммарная стоимость заказа: " + chekPrise);
                return order;
            }
        });

        Group buttonGroup = new Group(orderButton, backWindow, nextWindow);
        Group mainGroup = new Group(buttonGroup, dish1, dish2, dish3, dish4, dish1cb, dish2cb, dish3cb, dish4cb);
        Scene scene = new Scene(mainGroup, 450, 250);
        currentStage.setScene(scene);
        currentStage.show();
    }

    private static Button getNextButton(Stage stage, Stage currentStage) {
        Button nextWindow = new Button();
        nextWindow.setText("Задание 4");
        nextWindow.setLayoutX(350);
        nextWindow.setOnAction(new EventHandler<ActionEvent>() {
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
        return nextWindow;
    }

    private static Button getBackButton(Stage stage, Stage currentStage) {
        Button closeButton = new Button("Задание 2");
        closeButton.setLayoutX(10);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                currentStage.close();
                CheckBoxes checkBoxes = new CheckBoxes();
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
