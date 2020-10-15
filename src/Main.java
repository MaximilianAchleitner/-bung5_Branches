import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage){
        Text textcels = new Text("Grad Celsius");
        textcels.setStyle("-fx-font-size:15;-fx-font-weight: bold");
        TextArea cels = new TextArea();
        cels.setStyle("-fx-font-size:15;");
        cels.setMaxWidth(200);
        cels.setMaxHeight(15);

        Text textfahr = new Text("Grad Fahrenheit");
        textfahr.setStyle("-fx-font-size:15;-fx-font-weight: bold");
        TextArea fahr = new TextArea();
        fahr.setStyle("-fx-font-size:15;");
        fahr.setMaxWidth(200);
        fahr.setMaxHeight(15);

        VBox box_main = new VBox();
        ObservableList box_main_list = box_main.getChildren();

        box_main_list.addAll(textcels, cels, textfahr, fahr);

        EventHandler<MouseEvent> btn_handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

            }
        };

        EventHandler<MouseEvent> btn_handler2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

            }
        };

        Button btn1 = new Button("Convert °C -> °F");
        Button btn2 = new Button("Convert °F -> °C");

        box_main_list.addAll(btn1, btn2);

        Scene scene = new Scene(box_main, 220, 220);
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();


    }

}
