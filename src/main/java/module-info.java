module csc.tipcalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens csc.tipcalculatorapp to javafx.fxml;
    exports csc.tipcalculatorapp;
}
