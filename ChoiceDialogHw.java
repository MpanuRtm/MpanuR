import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
public class ChoiceDialogHw extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		ArrayList<String> choices = new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");
		ChoiceDialog<String> dialog = new ChoiceDialog<String>("Administrator", "Faculty", "Staff", "Student", "Guest");
		Optional<String> input = dialog.showAndWait();
		String value = input.get();
		
		switch (value) {
		case "Administrator":

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Choice Application");
			alert.setHeaderText("Role");
			alert.setContentText("Welcome Administrator! ");

			alert.showAndWait();
			break;
			
		case "Faculty":
			Alert alertF = new Alert(AlertType.INFORMATION);
			alertF.setTitle("Choice Application");
			alertF.setHeaderText("Role");
			alertF.setContentText("Welcome Faculty!");

			alertF.showAndWait();
			break;
			
		case "Staff":
			Alert alertS = new Alert(AlertType.INFORMATION);
			alertS.setTitle("Choice Application");
			alertS.setHeaderText("Role");
			alertS.setContentText("Welcome Staff! ");

			alertS.showAndWait();
			break;
			
		case "Student":
			Alert alertSt = new Alert(AlertType.INFORMATION);
			alertSt.setTitle("Choice Application");
			alertSt.setHeaderText("Role");
			alertSt.setContentText("Welcome Student! ");

			alertSt.showAndWait();
			break;
			
		case "Guest":
			Alert alertG = new Alert(AlertType.INFORMATION);
			alertG.setTitle("Choice Application");
			alertG.setHeaderText("Role");
			alertG.setContentText("Welcome Guest! ");

			alertG.showAndWait();
			break;
			
		}
	}

}
