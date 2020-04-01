[1mdiff --git a/out/production/LukadaCalculator/sample/Controller.class b/out/production/LukadaCalculator/sample/Controller.class[m
[1mindex fcc9b6c..cbda054 100644[m
Binary files a/out/production/LukadaCalculator/sample/Controller.class and b/out/production/LukadaCalculator/sample/Controller.class differ
[1mdiff --git a/out/production/LukadaCalculator/sample/Main.class b/out/production/LukadaCalculator/sample/Main.class[m
[1mindex f257d80..9e1112b 100644[m
Binary files a/out/production/LukadaCalculator/sample/Main.class and b/out/production/LukadaCalculator/sample/Main.class differ
[1mdiff --git a/out/production/LukadaCalculator/sample/application.css b/out/production/LukadaCalculator/sample/application.css[m
[1mindex c3f76b5..d95f7cc 100644[m
[1m--- a/out/production/LukadaCalculator/sample/application.css[m
[1m+++ b/out/production/LukadaCalculator/sample/application.css[m
[36m@@ -1,6 +1,6 @@[m
[31m-.root {[m
[32m+[m[32m/*.root {[m
     -fx-background-color: #6f6e6e;[m
[31m-}[m
[32m+[m[32m}*/[m
 Button {[m
     -fx-background-color: #f1ecec;;[m
 }[m
[1mdiff --git a/out/production/LukadaCalculator/sample/sample.fxml b/out/production/LukadaCalculator/sample/sample.fxml[m
[1mindex c39488d..ae5f711 100644[m
[1m--- a/out/production/LukadaCalculator/sample/sample.fxml[m
[1m+++ b/out/production/LukadaCalculator/sample/sample.fxml[m
[36m@@ -13,10 +13,10 @@[m
     </padding>[m
     <BorderPane>[m
         <left>[m
[31m-            <Button fx:id="btnScientific" text="Scientific Mode"/>[m
[32m+[m[32m            <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnScientific" text="Scientific Mode"/>[m
         </left>[m
         <right>[m
[31m-            <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnTheme"[m
[32m+[m[32m            <Button onMouseClicked="#switchTheme" onMouseEntered="#onMouseEntered" fx:id="btnTheme"[m
                     text="Switch Theme"/>[m
         </right>[m
         <bottom>[m
[36m@@ -34,101 +34,101 @@[m
             <ColumnConstraints percentWidth="25"/>[m
             <ColumnConstraints percentWidth="25"/>[m
         </columnConstraints>[m
[31m-        <Button fx:id="btnC" text="C" GridPane.rowIndex="0" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnC" text="C" GridPane.rowIndex="0" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnBack" text="&lt;-" GridPane.rowIndex="0" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnBack" text="&lt;-" GridPane.rowIndex="0" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMod" text="\%" GridPane.rowIndex="0" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMod" text="\%" GridPane.rowIndex="0" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnDivide" text="/" GridPane.rowIndex="0" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnDivide" text="/" GridPane.rowIndex="0" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn7" text="7" GridPane.rowIndex="1" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn7" text="7" GridPane.rowIndex="1" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn8" text="8" GridPane.rowIndex="1" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn8" text="8" GridPane.rowIndex="1" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn9" text="9" GridPane.rowIndex="1" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn9" text="9" GridPane.rowIndex="1" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMultiply" text="*" GridPane.rowIndex="1" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMultiply" text="*" GridPane.rowIndex="1" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn4" text="4" GridPane.rowIndex="2" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn4" text="4" GridPane.rowIndex="2" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn5" text="5" GridPane.rowIndex="2" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn5" text="5" GridPane.rowIndex="2" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn6" text="6" GridPane.rowIndex="2" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn6" text="6" GridPane.rowIndex="2" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMinus" text="-" GridPane.rowIndex="2" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMinus" text="-" GridPane.rowIndex="2" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn1" text="1" GridPane.rowIndex="3" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn1" text="1" GridPane.rowIndex="3" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn2" text="2" GridPane.rowIndex="3" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn2" text="2" GridPane.rowIndex="3" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn3" text="3" GridPane.rowIndex="3" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn3" text="3" GridPane.rowIndex="3" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnPlus" text="+" GridPane.rowIndex="3" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnPlus" text="+" GridPane.rowIndex="3" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btnDot" text="." GridPane.rowIndex="4" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnDot" text="." GridPane.rowIndex="4" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn0" text="0" GridPane.rowIndex="4" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn0" text="0" GridPane.rowIndex="4" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnEqual" text="=" GridPane.rowIndex="4" GridPane.columnIndex="2" GridPane.columnSpan="2"[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnEqual" text="=" GridPane.rowIndex="4" GridPane.columnIndex="2" GridPane.columnSpan="2"[m
                 prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
[1mdiff --git a/src/sample/Controller.java b/src/sample/Controller.java[m
[1mindex a613c8c..f30a338 100644[m
[1m--- a/src/sample/Controller.java[m
[1m+++ b/src/sample/Controller.java[m
[36m@@ -2,14 +2,20 @@[m [mpackage sample;[m
 [m
 import javafx.fxml.FXML;[m
 import javafx.scene.Cursor;[m
[32m+[m[32mimport javafx.scene.Node;[m
[32m+[m[32mimport javafx.scene.Parent;[m
 import javafx.scene.control.Button;[m
[32m+[m[32mimport javafx.scene.input.MouseEvent;[m
 [m
 public class Controller {[m
 [m
[32m+[m[32m    private int themeNum = 0;[m
[32m+[m
     @FXML[m
     private Button btnScientific, btnTheme, btnC, btnBack, btnMod, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnMinus,[m
     btn1, btn2, btn3, btnPlus, btnDot, btn0, btnEqual;[m
 [m
[32m+[m
     @FXML[m
     private void onMouseEntered() {[m
         btnScientific.setCursor(Cursor.HAND);[m
[36m@@ -38,7 +44,6 @@[m [mpublic class Controller {[m
     @FXML[m
     private void onMouseClicked() {[m
         btnScientific.setCursor(Cursor.CLOSED_HAND);[m
[31m-        btnTheme.setCursor(Cursor.CLOSED_HAND);[m
         btnC.setCursor(Cursor.CLOSED_HAND);[m
         btnBack.setCursor(Cursor.CLOSED_HAND);[m
         btnMod.setCursor(Cursor.CLOSED_HAND);[m
[36m@@ -60,5 +65,92 @@[m [mpublic class Controller {[m
         btnEqual.setCursor(Cursor.CLOSED_HAND);[m
     }[m
 [m
[32m+[m[32m    @FXML[m
[32m+[m[32m    public void switchTheme(MouseEvent event) {[m
[32m+[m[32m        btnTheme.setCursor(Cursor.CLOSED_HAND);[m
[32m+[m
[32m+[m[32m        Parent root = ((Node) event.getSource()).getScene().getRoot();[m
[32m+[m
[32m+[m[32m        themeNum++;[m
[32m+[m[32m        if(themeNum == 0) {[m
[32m+[m[32m            root.setStyle("-fx-background-color: #6f6e6e;");[m
[32m+[m
[32m+[m[32m            btnScientific.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnTheme.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnC.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnBack.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnMod.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnDivide.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn7.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn8.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn9.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnMultiply.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn4.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn5.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn6.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnMinus.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn1.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn2.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn3.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnPlus.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnDot.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btn0.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m[32m            btnEqual.setStyle("-fx-background-color: #f1ecec;");[m
[32m+[m
[32m+[m[32m        }else if(themeNum == 1) {[m
[32m+[m[32m            root.setStyle("-fx-background-color: #f6f6f6;");[m
[32m+[m
[32m+[m[32m            btnScientific.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnTheme.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnC.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnBack.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnMod.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnDivide.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn7.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn8.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn9.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnMultiply.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn4.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn5.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn6.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnMinus.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn1.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn2.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn3.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnPlus.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnDot.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btn0.setStyle("-fx-background-color: #fff;");[m
[32m+[m[32m            btnEqual.setStyle("-fx-background-color: #fff;");[m
[32m+[m
[32m+[m[32m        }else if(themeNum == 2) {[m
[32m+[m[32m            root.setStyle("-fx-background-color: #5157ff;");[m
[32m+[m
[32m+[m[32m            btnScientific.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnTheme.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnC.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnBack.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnMod.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnDivide.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn7.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn8.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn9.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnMultiply.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn4.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn5.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn6.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnMinus.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn1.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn2.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn3.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnPlus.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnDot.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btn0.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff");[m
[32m+[m[32m            btnEqual.setStyle("-fx-background-color: #0009FF; -fx-text-fill: #fff;");[m
[32m+[m
[32m+[m
[32m+[m[32m            themeNum = -1;[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m
 [m
 }[m
[1mdiff --git a/src/sample/Main.java b/src/sample/Main.java[m
[1mindex ef0c9de..7270e82 100644[m
[1m--- a/src/sample/Main.java[m
[1m+++ b/src/sample/Main.java[m
[36m@@ -10,15 +10,19 @@[m [mpublic class Main extends Application {[m
 [m
     @Override[m
     public void start(Stage primaryStage) throws Exception{[m
[32m+[m[32m        //Main Scene[m
         Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));[m
         root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());[m
[31m-        primaryStage.setTitle("Hello World");[m
[32m+[m[32m        root.setStyle("-fx-background-color: #6f6e6e;");[m
[32m+[m[32m        primaryStage.setTitle("Simple Calculator");[m
         primaryStage.setResizable(false);[m
[31m-        primaryStage.setScene(new Scene(root, 300, 350));[m
[32m+[m[32m        primaryStage.setScene(new Scene(root, 300, 360));[m
         primaryStage.show();[m
[32m+[m
     }[m
 [m
 [m
[32m+[m
     public static void main(String[] args) {[m
         launch(args);[m
     }[m
[1mdiff --git a/src/sample/application.css b/src/sample/application.css[m
[1mindex c3f76b5..d95f7cc 100644[m
[1m--- a/src/sample/application.css[m
[1m+++ b/src/sample/application.css[m
[36m@@ -1,6 +1,6 @@[m
[31m-.root {[m
[32m+[m[32m/*.root {[m
     -fx-background-color: #6f6e6e;[m
[31m-}[m
[32m+[m[32m}*/[m
 Button {[m
     -fx-background-color: #f1ecec;;[m
 }[m
[1mdiff --git a/src/sample/sample.fxml b/src/sample/sample.fxml[m
[1mindex c39488d..ae5f711 100644[m
[1m--- a/src/sample/sample.fxml[m
[1m+++ b/src/sample/sample.fxml[m
[36m@@ -13,10 +13,10 @@[m
     </padding>[m
     <BorderPane>[m
         <left>[m
[31m-            <Button fx:id="btnScientific" text="Scientific Mode"/>[m
[32m+[m[32m            <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnScientific" text="Scientific Mode"/>[m
         </left>[m
         <right>[m
[31m-            <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnTheme"[m
[32m+[m[32m            <Button onMouseClicked="#switchTheme" onMouseEntered="#onMouseEntered" fx:id="btnTheme"[m
                     text="Switch Theme"/>[m
         </right>[m
         <bottom>[m
[36m@@ -34,101 +34,101 @@[m
             <ColumnConstraints percentWidth="25"/>[m
             <ColumnConstraints percentWidth="25"/>[m
         </columnConstraints>[m
[31m-        <Button fx:id="btnC" text="C" GridPane.rowIndex="0" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnC" text="C" GridPane.rowIndex="0" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnBack" text="&lt;-" GridPane.rowIndex="0" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnBack" text="&lt;-" GridPane.rowIndex="0" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMod" text="\%" GridPane.rowIndex="0" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMod" text="\%" GridPane.rowIndex="0" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnDivide" text="/" GridPane.rowIndex="0" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnDivide" text="/" GridPane.rowIndex="0" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn7" text="7" GridPane.rowIndex="1" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn7" text="7" GridPane.rowIndex="1" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn8" text="8" GridPane.rowIndex="1" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn8" text="8" GridPane.rowIndex="1" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn9" text="9" GridPane.rowIndex="1" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn9" text="9" GridPane.rowIndex="1" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMultiply" text="*" GridPane.rowIndex="1" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMultiply" text="*" GridPane.rowIndex="1" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn4" text="4" GridPane.rowIndex="2" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn4" text="4" GridPane.rowIndex="2" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn5" text="5" GridPane.rowIndex="2" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn5" text="5" GridPane.rowIndex="2" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn6" text="6" GridPane.rowIndex="2" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn6" text="6" GridPane.rowIndex="2" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnMinus" text="-" GridPane.rowIndex="2" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnMinus" text="-" GridPane.rowIndex="2" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btn1" text="1" GridPane.rowIndex="3" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn1" text="1" GridPane.rowIndex="3" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn2" text="2" GridPane.rowIndex="3" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn2" text="2" GridPane.rowIndex="3" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn3" text="3" GridPane.rowIndex="3" GridPane.columnIndex="2" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn3" text="3" GridPane.rowIndex="3" GridPane.columnIndex="2" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnPlus" text="+" GridPane.rowIndex="3" GridPane.columnIndex="3" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnPlus" text="+" GridPane.rowIndex="3" GridPane.columnIndex="3" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
 [m
[31m-        <Button fx:id="btnDot" text="." GridPane.rowIndex="4" GridPane.columnIndex="0" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnDot" text="." GridPane.rowIndex="4" GridPane.columnIndex="0" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btn0" text="0" GridPane.rowIndex="4" GridPane.columnIndex="1" prefWidth="Infinity">[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btn0" text="0" GridPane.rowIndex="4" GridPane.columnIndex="1" prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
             </font>[m
         </Button>[m
[31m-        <Button fx:id="btnEqual" text="=" GridPane.rowIndex="4" GridPane.columnIndex="2" GridPane.columnSpan="2"[m
[32m+[m[32m        <Button onMouseClicked="#onMouseClicked" onMouseEntered="#onMouseEntered" fx:id="btnEqual" text="=" GridPane.rowIndex="4" GridPane.columnIndex="2" GridPane.columnSpan="2"[m
                 prefWidth="Infinity">[m
             <font>[m
                 <Font name="Cambria Math regular" size="16"/>[m
