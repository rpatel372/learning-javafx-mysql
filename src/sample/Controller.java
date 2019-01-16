package sample;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    public TextField textfield;
    public Label textLabel;

    public void button(ActionEvent actionEvent) throws SQLException {
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        String sql= "INSERT INTO USER VALUES('" + textfield.getText() + "')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        //textLabel.setText(textfield.getText());
    }
}
