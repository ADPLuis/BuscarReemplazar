package dad.javafx.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazarApp extends Application {
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	private Label buscarLabel;
	private Label reemplazarconLabel;
	
	private TextField buscarTextField;
	private TextField reemplazarTextField;
	
	private CheckBox mayusminuscb;
	private CheckBox buscaratrascb;
	private CheckBox expresionregularcb;
	private CheckBox resaltarcb;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMinWidth(50);
		reemplazarButton.setMinWidth(50);
		reemplazarTodoButton.setMinWidth(50);
		ayudaButton.setMinWidth(50);
		cerrarButton.setMinWidth(50);
		
		
		buscarLabel = new Label("Buscar:");
		reemplazarconLabel = new Label("Reemplazar con:");
		
		buscarTextField = new TextField();
		reemplazarTextField = new TextField();
		
		mayusminuscb = new CheckBox("Mayúsculas y minúsculas");
		buscaratrascb = new CheckBox("Buscar hacia atrás");
		expresionregularcb = new CheckBox("Expresión regular");
		resaltarcb = new CheckBox("Resaltar resultados");
		
		VBox prim = new VBox(buscarLabel,reemplazarconLabel);
		prim.setSpacing(10);
		VBox cbizq = new VBox(mayusminuscb,expresionregularcb);
		VBox cbder = new VBox(buscaratrascb,resaltarcb);
		HBox checkboxes = new HBox(cbizq,cbder);
		VBox seg = new VBox(buscarTextField,reemplazarTextField,checkboxes);
		
		
		VBox ter = new VBox(buscarButton,reemplazarButton,reemplazarTodoButton,cerrarButton,ayudaButton);
		ter.setAlignment(Pos.BASELINE_CENTER);
		ter.setSpacing(10);
		
		
		HBox root = new HBox(prim,seg,ter);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 240);

		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
