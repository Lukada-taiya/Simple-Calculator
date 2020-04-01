package sample;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller {

    private int themeNum = 0;

    @FXML
    private Button btnScientific, btnTheme, btnC, btnBack, btnMod, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnMinus,
    btn1, btn2, btn3, btnPlus, btnDot, btn0, btnEqual;


    @FXML
    private void onMouseEntered() {
        btnScientific.setCursor(Cursor.HAND);
        btnTheme.setCursor(Cursor.HAND);
        btnC.setCursor(Cursor.HAND);
        btnBack.setCursor(Cursor.HAND);
        btnMod.setCursor(Cursor.HAND);
        btnDivide.setCursor(Cursor.HAND);
        btn7.setCursor(Cursor.HAND);
        btn8.setCursor(Cursor.HAND);
        btn9.setCursor(Cursor.HAND);
        btnMultiply.setCursor(Cursor.HAND);
        btn4.setCursor(Cursor.HAND);
        btn5.setCursor(Cursor.HAND);
        btn6.setCursor(Cursor.HAND);
        btnMinus.setCursor(Cursor.HAND);
        btn1.setCursor(Cursor.HAND);
        btn2.setCursor(Cursor.HAND);
        btn3.setCursor(Cursor.HAND);
        btnPlus.setCursor(Cursor.HAND);
        btnDot.setCursor(Cursor.HAND);
        btn0.setCursor(Cursor.HAND);
        btnEqual.setCursor(Cursor.HAND);
    }

    @FXML
    private void onMouseClicked() {
        btnScientific.setCursor(Cursor.CLOSED_HAND);
        btnC.setCursor(Cursor.CLOSED_HAND);
        btnBack.setCursor(Cursor.CLOSED_HAND);
        btnMod.setCursor(Cursor.CLOSED_HAND);
        btnDivide.setCursor(Cursor.CLOSED_HAND);
        btn7.setCursor(Cursor.CLOSED_HAND);
        btn8.setCursor(Cursor.CLOSED_HAND);
        btn9.setCursor(Cursor.CLOSED_HAND);
        btnMultiply.setCursor(Cursor.CLOSED_HAND);
        btn4.setCursor(Cursor.CLOSED_HAND);
        btn5.setCursor(Cursor.CLOSED_HAND);
        btn6.setCursor(Cursor.CLOSED_HAND);
        btnMinus.setCursor(Cursor.CLOSED_HAND);
        btn1.setCursor(Cursor.CLOSED_HAND);
        btn2.setCursor(Cursor.CLOSED_HAND);
        btn3.setCursor(Cursor.CLOSED_HAND);
        btnPlus.setCursor(Cursor.CLOSED_HAND);
        btnDot.setCursor(Cursor.CLOSED_HAND);
        btn0.setCursor(Cursor.CLOSED_HAND);
        btnEqual.setCursor(Cursor.CLOSED_HAND);
    }

    @FXML
    public void switchTheme(MouseEvent event) {
        btnTheme.setCursor(Cursor.CLOSED_HAND);

        Parent root = ((Node) event.getSource()).getScene().getRoot();

        themeNum++;
        if(themeNum == 0) {
            root.setStyle("-fx-background-color: #6f6e6e;");

            btnScientific.setStyle("-fx-background-color: #f1ecec;");
            btnTheme.setStyle("-fx-background-color: #f1ecec;");
            btnC.setStyle("-fx-background-color: #f1ecec;");
            btnBack.setStyle("-fx-background-color: #f1ecec;");
            btnMod.setStyle("-fx-background-color: #f1ecec;");
            btnDivide.setStyle("-fx-background-color: #f1ecec;");
            btn7.setStyle("-fx-background-color: #f1ecec;");
            btn8.setStyle("-fx-background-color: #f1ecec;");
            btn9.setStyle("-fx-background-color: #f1ecec;");
            btnMultiply.setStyle("-fx-background-color: #f1ecec;");
            btn4.setStyle("-fx-background-color: #f1ecec;");
            btn5.setStyle("-fx-background-color: #f1ecec;");
            btn6.setStyle("-fx-background-color: #f1ecec;");
            btnMinus.setStyle("-fx-background-color: #f1ecec;");
            btn1.setStyle("-fx-background-color: #f1ecec;");
            btn2.setStyle("-fx-background-color: #f1ecec;");
            btn3.setStyle("-fx-background-color: #f1ecec;");
            btnPlus.setStyle("-fx-background-color: #f1ecec;");
            btnDot.setStyle("-fx-background-color: #f1ecec;");
            btn0.setStyle("-fx-background-color: #f1ecec;");
            btnEqual.setStyle("-fx-background-color: #f1ecec;");

        }else if(themeNum == 1) {
            root.setStyle("-fx-background-color: #f6f6f6;");

            btnScientific.setStyle("-fx-background-color: #fff;");
            btnTheme.setStyle("-fx-background-color: #fff;");
            btnC.setStyle("-fx-background-color: #fff;");
            btnBack.setStyle("-fx-background-color: #fff;");
            btnMod.setStyle("-fx-background-color: #fff;");
            btnDivide.setStyle("-fx-background-color: #fff;");
            btn7.setStyle("-fx-background-color: #fff;");
            btn8.setStyle("-fx-background-color: #fff;");
            btn9.setStyle("-fx-background-color: #fff;");
            btnMultiply.setStyle("-fx-background-color: #fff;");
            btn4.setStyle("-fx-background-color: #fff;");
            btn5.setStyle("-fx-background-color: #fff;");
            btn6.setStyle("-fx-background-color: #fff;");
            btnMinus.setStyle("-fx-background-color: #fff;");
            btn1.setStyle("-fx-background-color: #fff;");
            btn2.setStyle("-fx-background-color: #fff;");
            btn3.setStyle("-fx-background-color: #fff;");
            btnPlus.setStyle("-fx-background-color: #fff;");
            btnDot.setStyle("-fx-background-color: #fff;");
            btn0.setStyle("-fx-background-color: #fff;");
            btnEqual.setStyle("-fx-background-color: #fff;");

        }else if(themeNum == 2) {
            root.setStyle("-fx-background-color: #5157ff;");

            btnScientific.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnTheme.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnC.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnBack.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnMod.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnDivide.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn7.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn8.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn9.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnMultiply.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn4.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn5.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn6.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnMinus.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn1.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn2.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn3.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnPlus.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnDot.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btn0.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");
            btnEqual.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");


            themeNum = -1;
        }
    }


}
