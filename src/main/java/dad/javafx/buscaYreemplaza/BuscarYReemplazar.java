package dad.javafx.buscaYreemplaza;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {
	private TextField buscarTexto;
	private TextField reemplazarTexto;
	private Button buscarBoton,reemplazarBoton,reemplazarTodoBoton,cerrarAppBoton,ayudaBoton;
	private CheckBox mayusYmin,expresionRegular, buscarAtras, resaltar;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarTexto= new TextField();
		reemplazarTexto= new TextField();
		
		buscarBoton= new Button("Buscar");
		reemplazarBoton= new Button("Reemplazar");
		reemplazarTodoBoton = new Button ("Reemplazar todo");
		cerrarAppBoton = new Button ("Cerrar");
		ayudaBoton= new Button ("Ayuda");
		
		mayusYmin = new CheckBox("Mayúsculas y minúsculas");
		expresionRegular= new CheckBox("Expresión regular");
		buscarAtras= new CheckBox("Buscar hacia atras");
		resaltar= new CheckBox("Resaltar resultados");
		
		buscarBoton.setMaxWidth(Double.MAX_VALUE);
		reemplazarBoton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoBoton.setMaxWidth(Double.MAX_VALUE);
		cerrarAppBoton.setMaxWidth(Double.MAX_VALUE);
		ayudaBoton.setMaxWidth(Double.MAX_VALUE);
		
		VBox primerosCheckBoxs= new VBox(5,mayusYmin,expresionRegular);
		VBox segundosCheckBoxs= new VBox(5,buscarAtras,resaltar);
		VBox botonesDerecha= new VBox(5,buscarBoton,reemplazarBoton,reemplazarTodoBoton,cerrarAppBoton,ayudaBoton);
	
		
		HBox cajaCheckBox= new HBox(5,primerosCheckBoxs,segundosCheckBoxs);
		
		GridPane panelGrid = new GridPane();
		panelGrid.setHgap(5);
		panelGrid.setVgap(5);
		panelGrid.setPadding(new Insets(5));
		panelGrid.addRow(0, new Label("Buscar:"),buscarTexto);
		panelGrid.addRow(1, new Label("Reemplazar con:"),reemplazarTexto);
		panelGrid.add(cajaCheckBox, 1, 2);
		panelGrid.add(botonesDerecha,2,0);
		
		ColumnConstraints[] cols = {

				new ColumnConstraints(), 
				new ColumnConstraints(),
				new ColumnConstraints() 
		};

		cols[1].setHgrow(Priority.ALWAYS);

		panelGrid.getColumnConstraints().addAll(cols);
		
		GridPane.setRowSpan(botonesDerecha, 3);
			
		BorderPane root= new BorderPane();
		root.setCenter(panelGrid);
		root.setRight(botonesDerecha);
		root.setPadding(new Insets(5));
			
			
		
		
		Scene scene = new Scene (root,470,250);
		
		primaryStage.setTitle("Ejemplo de GridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
