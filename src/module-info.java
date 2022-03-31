module modtest {
	requires javafx.controls;
	requires javafx.graphics;
	requires org.jsoup;
	requires javafx.base;
	requires org.junit.jupiter.api;
	requires junit;
	requires java.xml;
	
	opens application to javafx.graphics, javafx.fxml;
}
