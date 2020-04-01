package sample;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;

public class Controller {

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
        btnTheme.setCursor(Cursor.CLOSED_HAND);
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


}
