package sample;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class Controller {

    private int themeNum = 0;
    private boolean isScientific = false;
    private Stage primaryStage;
    private Button btnSqrt, btnLog, btnSin, btnCos, btnTan;

    private static final int WINDOW_WIDTH_RESIZE = 380;
    private static final int WINDOW_WIDTH = 300;

    @FXML
    private Button btnScientific, btnTheme, btnC, btnBack, btnMod, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnMinus,
            btn1, btn2, btn3, btnPlus, btnDot, btn0, btnPower, btnEqual;
    @FXML
    private GridPane gridPane;


    @FXML
    private void onMouseEntered(MouseEvent event) {
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
        btnPower.setCursor(Cursor.HAND);
        btnEqual.setCursor(Cursor.HAND);

        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        if(primaryStage.getWidth() == WINDOW_WIDTH_RESIZE) {
            btnSqrt.setCursor(Cursor.HAND);
            btnLog.setCursor(Cursor.HAND);
            btnSin.setCursor(Cursor.HAND);
            btnCos.setCursor(Cursor.HAND);
            btnTan.setCursor(Cursor.HAND);
        }
    }

    @FXML
    private void onMouseClicked(MouseEvent event) {
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
        btnPower.setCursor(Cursor.CLOSED_HAND);
        btnEqual.setCursor(Cursor.CLOSED_HAND);

        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        if(primaryStage.getWidth() == WINDOW_WIDTH_RESIZE) {
            btnSqrt.setCursor(Cursor.CLOSED_HAND);
            btnLog.setCursor(Cursor.CLOSED_HAND);
            btnSin.setCursor(Cursor.CLOSED_HAND);
            btnCos.setCursor(Cursor.CLOSED_HAND);
            btnTan.setCursor(Cursor.CLOSED_HAND);
        }
    }

    @FXML
    public void switchTheme(MouseEvent event) {
        btnTheme.setCursor(Cursor.CLOSED_HAND);

        Parent root = ((Node) event.getSource()).getScene().getRoot();
        primaryStage = (Stage)root.getScene().getWindow();
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
            btnPower.setStyle("-fx-background-color: #f1ecec;");
            btnEqual.setStyle("-fx-background-color: #f1ecec;");

            if(primaryStage.getWidth() == WINDOW_WIDTH_RESIZE) {
                btnSqrt.setStyle("-fx-background-color: #f1ecec;");
                btnLog.setStyle("-fx-background-color: #f1ecec;");
                btnSin.setStyle("-fx-background-color: #f1ecec;");
                btnCos.setStyle("-fx-background-color: #f1ecec;");
                btnTan.setStyle("-fx-background-color: #f1ecec;");
            }

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
            btnPower.setStyle("-fx-background-color: #fff;");
            btnEqual.setStyle("-fx-background-color: #fff;");

            if(primaryStage.getWidth() == WINDOW_WIDTH_RESIZE) {
                btnSqrt.setStyle("-fx-background-color: #fff;");
                btnLog.setStyle("-fx-background-color: #fff;");
                btnSin.setStyle("-fx-background-color: #fff;");
                btnCos.setStyle("-fx-background-color: #fff;");
                btnTan.setStyle("-fx-background-color: #fff;");
            }

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
            btnPower.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
            btnEqual.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");

            if(primaryStage.getWidth() == WINDOW_WIDTH_RESIZE) {
                btnSqrt.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnLog.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnSin.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnCos.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnTan.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
            }

            themeNum = -1;
        }
    }

    @FXML
    public void scientificFunction(MouseEvent event) {


        if(isScientific) {
            btnScientific.setCursor(Cursor.CLOSED_HAND);

            primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setWidth(WINDOW_WIDTH);

            gridPane.getChildren().remove(24);
            gridPane.getChildren().remove(23);
            gridPane.getChildren().remove(22);
            gridPane.getChildren().remove(21);
            gridPane.getChildren().remove(20);

            gridPane.getColumnConstraints().remove(0);
            gridPane.getColumnConstraints().replaceAll(columnConstraints -> {
                columnConstraints.setPercentWidth(25);
                return columnConstraints;
            });

            isScientific = false;
        }else {
            btnScientific.setCursor(Cursor.CLOSED_HAND);

            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setWidth(WINDOW_WIDTH_RESIZE);

            btnSqrt = new Button("sqrt ");
            btnSqrt.prefWidth(Infinity);
            btnSqrt.setFont(Font.font("Cambria Math regular", 16));

            btnLog = new Button(" log ");
            btnLog.prefWidth(Infinity);
            btnLog.setFont(Font.font("Cambria Math regular", 16));

            btnSin = new Button(" sin  ");
            btnSin.prefWidth(Infinity);
            btnSin.setFont(Font.font("Cambria Math regular", 16));

            btnCos = new Button(" cos ");
            btnCos.prefWidth(Infinity);
            btnCos.setFont(Font.font("Cambria Math regular", 16));

            btnTan = new Button(" tan ");
            btnTan.prefWidth(Infinity);
            btnTan.setFont(Font.font("Cambria Math regular", 16));

            gridPane.getColumnConstraints().replaceAll(columnConstraints -> {
                columnConstraints.setPercentWidth(20);
                return columnConstraints;
            });

            ColumnConstraints col = new ColumnConstraints();
            col.setPercentWidth(20);
            gridPane.getColumnConstraints().add(col);

            gridPane.add(btnSqrt, 4, 0);
            gridPane.add(btnLog, 4, 1);
            gridPane.add(btnSin, 4, 2);
            gridPane.add(btnCos, 4, 3);
            gridPane.add(btnTan, 4, 4);

            if(themeNum == 1) {
                btnSqrt.setStyle("-fx-background-color: #fff;");
                btnLog.setStyle("-fx-background-color: #fff;");
                btnSin.setStyle("-fx-background-color: #fff;");
                btnCos.setStyle("-fx-background-color: #fff;");
                btnTan.setStyle("-fx-background-color: #fff;");
            }else if(themeNum == -1) {
                btnSqrt.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnLog.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnSin.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnCos.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
                btnTan.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");
            }

            isScientific = true;
        }

    }


}