package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.lang.Integer;
import java.util.Random;

import static java.lang.Integer.*;

public class Controller {
    @FXML TextField posiadasz; @FXML TextField stawiasz; @FXML TextField krupier; @FXML TextField gracz;
    @FXML Button postaw; @FXML Button wys; @FXML Button dob; @FXML Label wyn;
        public int intMasz = 1000;
        public int intPostaw;
        public int intKrupier;
        public int intGracz;
        Random r = new Random();
        int[] tab = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11};

        public void initialize (){
            posiadasz.setText(String.valueOf(intMasz));
        }

        public void postawPLN() {
            intKrupier = 0;
            intGracz = 0;
            intPostaw = 0;

            if(wyn.getText().equals("Przegrałeś !!!") || wyn.getText().equals("Wygrałeś !!!")) {
            wyn.setText("Wynik rozgrywki");
            }

            if(stawiasz.getText().isEmpty()){
            stawiasz.setText("20");
            intPostaw = 20;
        }
        else {
            intPostaw = Integer.valueOf(stawiasz.getText());
            stawiasz.setText(String.valueOf(intPostaw));
        }
            intMasz = intMasz - intPostaw;
            posiadasz.setText(String.valueOf(intMasz));

                int intTemp1 = tab[r.nextInt(12)];
                int intTemp2 = tab[r.nextInt(12)];
                intGracz = intTemp1 + intTemp2;
                gracz.setText(String.valueOf(intGracz));

            int intTemp3 = tab[r.nextInt(12)];
            int intTemp4 = tab[r.nextInt(12)];
            intKrupier = intTemp3 + intTemp4;
            krupier.setText(String.valueOf(intTemp3));
                        }

    public void dobierz() {

        intGracz = intGracz + tab[r.nextInt(13)];
        gracz.setText(String.valueOf(intGracz));

        if (intGracz > 21 ) {
            wyn.setText("Przegrałeś !!!");

        }
        else {
            if (intKrupier > 21) {
                wyn.setText("Wygrałeś !!!");
            }
            else {

                if (intKrupier < 17) {

                    while (intKrupier < 17) {
                        int intTemp5 = tab[r.nextInt(13)];
                        intKrupier = intKrupier + intTemp5;
                    }
                    krupier.setText(String.valueOf(intKrupier));
                }

                if (intKrupier > 21) {
                    wyn.setText("Wygrałeś !!!");
                    intMasz = intMasz + intPostaw * 2;
                    posiadasz.setText(String.valueOf(intMasz));
                }
            }
        }

    }

    public void wystarczy() {

            if (intKrupier < 17) {

                while (intKrupier < 17) {
                int intTemp5 = tab[r.nextInt(12)];
                intKrupier = intKrupier + intTemp5;
            }
            krupier.setText(String.valueOf(intKrupier));
                if (intKrupier > 21) {
                    wyn.setText("Wygrałeś !!!");
                    intMasz = intMasz + intPostaw * 2;
                    posiadasz.setText(String.valueOf(intMasz));
                    krupier.setText(String.valueOf(intKrupier));
                }

        }


            else {

                if (intGracz > intKrupier) {
                    wyn.setText("Wygrałeś !!!");
                    intMasz = intMasz + intPostaw * 2;
                    posiadasz.setText(String.valueOf(intMasz));

                }

                if (intGracz <= intKrupier) {
                    wyn.setText("Przegrałeś !!!");

                }
            }
        }
    }





