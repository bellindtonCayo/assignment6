module modtest {
	requires javafx.controls;
	requires javafx.graphics;
	requires org.jsoup;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
