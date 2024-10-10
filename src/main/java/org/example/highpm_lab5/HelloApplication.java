package org.example.highpm_lab5;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WordSwapper ws = new WordSwapper();
        ws.start(stage);
    }
}