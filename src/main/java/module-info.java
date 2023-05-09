module eus.ehu.demoicon {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires fontawesomefx;

    opens eus.ehu.demoicon to javafx.fxml;
    exports eus.ehu.demoicon;
    exports eus.ehu.demoicon.component;
    opens eus.ehu.demoicon.component to javafx.fxml;
}
