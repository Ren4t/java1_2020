package homework2_4;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;

import javax.swing.text.html.ListView;
import java.awt.*;

public class ChatController {

    @FXML
    public ListView usersList;

    @FXML
    public Button sendButton;

    @FXML
    public TextArea chatHistory;

    @FXML
    public TextField textField;

    @FXML
    public void initialize() {
        usersList.setItems(FXCollections.observableArrayList(MainClass.USER_DATA));
        sendButton.set
    }



}
