package homework2_4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass extends Application {

    public static final List<String> USER_DATA = Arrays.asList("Vasya","Petiya","Fediya");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("chatBox.fxml"));
        primaryStage.setTitle("ChatBOX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
