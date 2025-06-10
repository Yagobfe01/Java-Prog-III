import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField input = new TextField();
        Button botao = new Button("Exibir Mensagem");
        Label label = new Label();

        botao.setOnAction(e -> label.setText(input.getText()));

        VBox layout = new VBox(10, input, botao, label);
        layout.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Simulador de Mensagens");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
