/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines;

import es.ucm.povaleLines.entities.MatchResult;
import es.ucm.povale.parameter.ParameterEditor;
import java.io.File;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author PoVALE Team
 */
public class MatchResultEditor extends ParameterEditor<MatchResult>{

    
    private Stage stage;
    private HBox pane;
    private Map<String,String> parameters;
    private boolean matches;
    private List<String> groups;
    
    public MatchResultEditor(Map<String,String> parameters) {
        this.parameters = parameters;
        this.pane = new HBox();
    }
      
    @Override
    public Pane getPane() {
        return this.pane;
    }

    @Override
    public MatchResult getEntity() {
        return new MatchResult(matches, groups);
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
}
