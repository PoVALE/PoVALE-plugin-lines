package es.ucm.povaleLines;

import es.ucm.povale.parameter.ParameterEditor;
import es.ucm.povaleLines.entities.FSFile;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import java.io.File;
import java.util.Map;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class FileEditor extends ParameterEditor<FSFile> {

    private HBox pane;
    private FileChooser fileChooser;
    private Button selectButton;
    private TextField path;
    private File selectedFile;
    private Stage stage;
    private Map<String,String> parameters;

    public FileEditor(Map<String,String> parameters) {
        this.parameters = parameters;
        this.pane = new HBox();
        this.fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Java Files", "*.java"));

        this.selectButton = new Button("Abrir");
        this.path = new TextField();
        this.path.setPrefColumnCount(17);

        selectButton.setOnAction((final ActionEvent e) -> {
            selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
                path.setText(selectedFile.getAbsolutePath());
            }
        });

        path.setOnAction((final ActionEvent e) -> {
            if (!new File(path.getText()).exists()) {
                path.setText("");
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning ");
                alert.setHeaderText("File does not exist");
                alert.showAndWait();
            } else {
                selectedFile = new File(path.getText());
            }

        });
        pane.getChildren().addAll(path, selectButton);
    }

    @Override
    public Pane getPane() {
        return this.pane;
    }

    @Override
    public FSFile getEntity() {
        return new FSFile(selectedFile.toPath());
    }

    @Override
    public boolean isValid() {
        return (path != null);
    }

    
    
    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }


}
