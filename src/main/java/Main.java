import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello shitty fucked-up World'");
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("Hello World!");
			}
		});
		
		StackPane root = new StackPane();
		VBox vbox = new VBox();
		
		vbox.getChildren().add(btn);
		Button banana = new Button(("Banana"));
		vbox.getChildren().add(banana);
		banana.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("banana !!!");
			}
		});
		
		Button potato = new Button(("Potato"));
		vbox.getChildren().add(potato);
		potato.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("potato !!!");
			}
		});
		
		Image image1 = new Image(Main.class.getResourceAsStream("apple.jpg"));
		ImageView imageView = new ImageView(image1);
		GridPane gridpane = new GridPane();
		gridpane.getChildren().add(imageView);
		gridpane.getChildren().add(vbox);
		GridPane.setConstraints(imageView, 0, 4);
		
		root.getChildren().add(gridpane);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
}