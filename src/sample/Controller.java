package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


import java.util.Optional;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Controller {

    private int themeNum = 0;
    private boolean isScientific = false, isBtnCClicked = false;
    private Stage primaryStage;
    private Button btnSqrt, btnLog, btnSin, btnCos, btnTan;

    private static final int WINDOW_WIDTH_RESIZE = 380;
    private static final int WINDOW_WIDTH = 300;

    @FXML
    private TextArea inText;
    @FXML
    private Button btnScientific, btnTheme, btnC, btnBack, btnMod, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnMinus,
            btn1, btn2, btn3, btnPlus, btnDot, btn0, btnPower, btnEqual;
    @FXML
    private GridPane gridPane;

    public void initialize() {
        detectInput();
    }


//  Sets the cursor when the cursor enters or clicks on any of the buttons
    @FXML
    private void onMouseEvent(MouseEvent event) {
         if(event.getEventType().toString().equals("MOUSE_ENTERED")) {
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
         }else if(event.getEventType().toString().equals("MOUSE_CLICKED")) {
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
    }

//  Controls behaviour when any of the buttons are clicked
    @FXML
    private void onAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String inputString = btn.getId();

//      Making default text 0 a blank string to make calculation easier
        if(inText.getText().equals("0")) {
            inText.setText("");
        }

        switch(inputString) {
            case "btnC":
                isBtnCClicked = true;

//              Resetting font size when input is cleared, setting initial input text to 0
                inText.setFont(Font.font("Arial", FontWeight.BOLD, 22));
                inText.setText("0");
                break;
            case "btnBack":
                inputString = inText.getText();
                StringBuilder str1 = new StringBuilder();
                for (int i = 0; i< inputString.length()-1; i++) {
                    str1.append(inputString.charAt(i));
                }
//              Setting initial input text to 0
                if(str1.toString().equals("")) {
                    inText.setText("0");
                }else {
                    inText.setText(str1.toString());
                }

                setInputFont();
                break;
            case "btnMod":
                //inputString = inText.getText();
                break;
            case "btnDivide":
                break;
            case "btn7":
                inputString = inText.getText();
                inputString += "7";
                inText.setText(inputString);
                break;
            case "btn8":
                inputString = inText.getText();
                inputString += "8";
                inText.setText(inputString);
                break;
            case "btn9":
                inputString = inText.getText();
                inputString += "9";
                inText.setText(inputString);
                break;
            case "btnMultiply":
                break;
            case "btn4":
                inputString = inText.getText();
                inputString += "4";
                inText.setText(inputString);
                break;
            case "btn5":
                inputString = inText.getText();
                inputString += "5";
                inText.setText(inputString);
                break;
            case "btn6":
                inputString = inText.getText();
                inputString += "6";
                inText.setText(inputString);
                break;
            case "btnMinus":
                break;
            case "btn1":
                inputString = inText.getText();
                inputString += "1";
                inText.setText(inputString);
                break;
            case "btn2":
                inputString = inText.getText();
                inputString += "2";
                inText.setText(inputString);
                break;
            case "btn3":
                inputString = inText.getText();
                inputString += "3";
                inText.setText(inputString);
                break;
            case "btnPlus":
                break;
            case "btnDot":
                inputString = inText.getText();
                inputString += ".";
                inText.setText(inputString);
                break;
            case "btn0":
                inputString = inText.getText();
                inputString += "0";
                inText.setText(inputString);
                break;
            case "btnPower":
                inText.setText(inputString);
                break;
            case "btnEqual":
                break;
            case "btnSqrt":
                break;
            case "btnLog":
                break;
            case "btnSin":
                break;
            case "btnCos":
                break;
            case "btnTan":
                break;
            default:
                break;
        }

    }

//  Provides code for when the btnTheme is clicked
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

//  Provides code for when there is an entry in the input button
    private void detectInput() {

        inText.setTextFormatter(new TextFormatter<String>(change -> {
            int newInputLength = change.getControlNewText().length();

            if (newInputLength >= 19) {
                ScrollPane scrollPane = (ScrollPane) inText.lookup("#inText .scroll-bar:vertical").getParent();
                scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            }
            if(isScientific) {
                if(newInputLength >= 51 && newInputLength <= 70) {
                    inText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
                    return change;
                }else if (isBtnCClicked) {
                    isBtnCClicked = false;
                    return change;
                } else {
                     if(newInputLength > 70) {
                         return null;
                     }else {
                         return change;
                     }
                }
            }else {
                if (newInputLength >= 38 && newInputLength <= 52) {
                    inText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
                    return change;
                }else if (isBtnCClicked) {
                        isBtnCClicked = false;
                        return change;
                    } else {
                        if(newInputLength > 52) {
                            return null;
                        }else {
                            return change;
                        }
                    }
                }
        }));
    }

//  Controls behaviour of application when the btnScientific is clicked
    @FXML
    public void scientificFunction(MouseEvent event) {



        if(isScientific) {

            btnScientific.setCursor(Cursor.CLOSED_HAND);

            if(inText.getText().length() > 52) {

                Alert alertTrim = new Alert(Alert.AlertType.CONFIRMATION);
                alertTrim.setTitle("Confirm Trim");
                alertTrim.setHeaderText("Are you sure you want to change mode?");
                alertTrim.setContentText("The Non-Scientific Mode has less capacity than the Scientific Mode. Therefore switching back to the Non-Scientific Mode now" +
                        " will trim the values you have entered so far.");

                Optional<ButtonType> response = alertTrim.showAndWait();

                if (response.get() == ButtonType.OK){

                    isScientific = false;

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
        //          Trims off extra input text when btnScientific is clicked
                    inText.setText(inText.getText().substring(0, 52));

                    setInputFont();

                } else {
                    alertTrim.close();
                }

            }else {
                isScientific = false;

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

                setInputFont();
            }



        }else {
            isScientific = true;

            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setWidth(WINDOW_WIDTH_RESIZE);

            btnSqrt = new Button("sqrt ");
            btnSqrt.prefWidth(Infinity);
            btnSqrt.setFont(Font.font("Arial", 16));

            btnLog = new Button(" log ");
            btnLog.prefWidth(Infinity);
            btnLog.setFont(Font.font("Arial", 16));

            btnSin = new Button(" sin  ");
            btnSin.prefWidth(Infinity);
            btnSin.setFont(Font.font("Arial", 16));

            btnCos = new Button(" cos ");
            btnCos.prefWidth(Infinity);
            btnCos.setFont(Font.font("Arial", 16));

            btnTan = new Button(" tan ");
            btnTan.prefWidth(Infinity);
            btnTan.setFont(Font.font("Arial", 16));

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
            setInputFont();

        }

    }

//  Sets the appropriate font of the input field where neccessary
    private void setInputFont() {
        if(isScientific) {
            if (inText.getText().length() < 51) {
                inText.setFont(Font.font("Arial", FontWeight.BOLD, 22));
            } else {
                inText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
            }
        }else  {
            if (inText.getText().length() < 38) {
                inText.setFont(Font.font("Arial", FontWeight.BOLD,22));
            }else {
                inText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
            }
        }
    }



}