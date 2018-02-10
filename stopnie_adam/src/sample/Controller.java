package sample;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class Controller {

    @FXML RadioButton weC; @FXML RadioButton weF; @FXML RadioButton weK;
    @FXML RadioButton wyC; @FXML RadioButton wyF; @FXML RadioButton wyK;
    @FXML TextField we; @FXML Label wy;
    public String s1 = ""; public String s2 = "";
    public double d1 = 0; public double d2 = 0;

    public void start(){

        if(we.getText().isEmpty()){
            we.setText("0");
        }
        else{
            if(weC.isSelected()&& wyC.isSelected()){
                wy.setText(we.getText()+"\u00B0"+ " C"); }

            if(weC.isSelected()&& wyF.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = (d1 * 1.8) + 32;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" F"); }

            if(weC.isSelected()&& wyK.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = d1 + 273.15;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" K"); }

            if(weF.isSelected()&& wyC.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = (d1 - 32.0) /1.8;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" C"); }

            if(weF.isSelected()&& wyF.isSelected()){
                wy.setText(we.getText()+"\u00B0"+ " F"); }

            if(weF.isSelected()&& wyK.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = (d1 + 459.67)*5/9;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" K"); }

            if(weK.isSelected()&& wyC.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = d1 - 273.15;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" C"); }

            if(weK.isSelected()&& wyF.isSelected()){
                d1 = Double.valueOf(we.getText());
                d2 = (d1 * 9/5) - 459.67;
                wy.setText(String.format("%.2f",d2)+"\u00B0"+" F"); }

            if(weK.isSelected()&& wyK.isSelected()){
                wy.setText(we.getText()+"\u00B0"+ " K"); }
            }
        }
    }




