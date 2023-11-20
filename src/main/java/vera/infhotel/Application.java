package vera.infhotel;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));

        FlowPane root = new FlowPane();

        FlowPane sidebar = new FlowPane();
        sidebar.setPrefWidth(200);
        sidebar.setPrefHeight(600);
        sidebar.setStyle("-fx-background-color: #ff0000");

        root.getChildren().add(sidebar);

        double sidebarWidth = sidebar.getPrefWidth();
        Label label = new Label ("InfHotel");

        label.setPrefSize(sidebarWidth,50);
        label.setAlignment(Pos.CENTER);

        sidebar.getChildren().add(label);




        Scene scene = new Scene(root, 1024, 600);

        stage.setTitle("InfHotel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}