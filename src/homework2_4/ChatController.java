package homework2_4;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ChatController {

    @FXML
    public ListView listView;

    @FXML
    public Button sendButton;

    @FXML
    public TextArea chatHistory;

    @FXML
    public TextField textField;

    @FXML
    public void initialize() {
        listView.setItems(FXCollections.observableArrayList(MainClass.USERS_DATA));
        sendButton.setOnAction(event -> sendMessage());
        textField.setOnAction(event -> sendMessage());
    }

    private void sendMessage() {
        chatHistory.appendText(textField.getText());
        chatHistory.appendText(System.lineSeparator());
        textField.clear();
    }



}
