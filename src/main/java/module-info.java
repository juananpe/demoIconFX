module eus.ehu.demoicon {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens eus.ehu.demoicon to javafx.fxml;
    exports eus.ehu.demoicon;
}