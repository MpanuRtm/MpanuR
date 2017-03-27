import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class LoopClassExercise extends Application {

	public static void main(String[] args) {
		launch(args);
		

	}

	@Override
	public void start(Stage arg0) throws Exception {
		TextInputDialog dialog2 = new TextInputDialog();
		dialog2.setTitle("assist athletes Application");
		dialog2.setHeaderText("Number of athletes");
		dialog2.setContentText("Please enter number of players:");
		
		Optional<String> input = dialog2.showAndWait();
		String numPlayers = input.get();
		double NumOfAthletes = Integer.parseInt(numPlayers);
		double teamSize;
		
		if (NumOfAthletes <= 55 && NumOfAthletes >=11) {
			teamSize = NumOfAthletes/11;
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("team size Application");
			alert.setHeaderText("team Size");
			alert.setContentText("The the number of players " + NumOfAthletes + " The team size is " + teamSize);

			alert.showAndWait();
			
		}
		
		else {
			teamSize = NumOfAthletes;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("team size Application");
			alert.setHeaderText("team Size");
			alert.setContentText("The the number of players " + NumOfAthletes + " The team size is " + teamSize);

			alert.showAndWait();
		}
		
		
		
		
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Group size Application");
		dialog.setHeaderText("Group Size");
		dialog.setContentText("Please enter number of people:");
		
		Optional<String> value = dialog.showAndWait();
		String numberOfPeople = value.get();
		double groupOfPeople = Integer.parseInt(numberOfPeople);
		double groupSize;
		
		if (groupOfPeople > 10) {
			groupSize =  groupOfPeople/2;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Group size Application");
			alert.setHeaderText("Group Size");
			alert.setContentText("The the number of people " + groupOfPeople + " The group size is " + groupSize);

			alert.showAndWait();
			
		}
		else if (groupOfPeople >=3 && groupOfPeople <= 10) {
			groupSize =  groupOfPeople/3;
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Group size Application");
			alert.setHeaderText("Group Size");
			alert.setContentText("The the number of people " + groupOfPeople + " The group size is " + groupSize);

			alert.showAndWait();
            
        }
		else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Group size Application");
			alert.setHeaderText("Group Size");
			alert.setContentText("The number of people has to be at least 3");

			alert.showAndWait();
		}
		
		
		
	}

}

