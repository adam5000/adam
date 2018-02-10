package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.Random;



public class Controller {
    @FXML
    Button b;
    Random r = new Random();


    public void run(){
        b.relocate(r.nextDouble()*150,r.nextDouble()*150);
    }
    @FXML
    public void xxx() {
        System.out.println("Trafiony");
    }
}
