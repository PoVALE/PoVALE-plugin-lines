package es.ucm.povaleLines;

import es.ucm.povale.entity.Entity;
import es.ucm.povale.function.Function;
import es.ucm.povale.parameter.ParameterEditor;
import es.ucm.povale.plugin.PluginInfo;
import es.ucm.povale.predicate.Predicate;
import es.ucm.povaleLines.entities.Directory;
import es.ucm.povaleLines.entities.FSDirectory;
import es.ucm.povaleLines.entities.FSFile;
import es.ucm.povaleLines.entities.File;
import es.ucm.povaleLines.entities.MatchResult;
import es.ucm.povaleLines.predicates.LineContains;
import es.ucm.povaleLines.predicates.LineEndsWith;
import es.ucm.povaleLines.predicates.LineStartsWith;
import es.ucm.povaleLines.predicates.MatcherMatches;
import es.ucm.povaleLines.functions.LineMatchAgainst;
import es.ucm.povaleLines.functions.LineTrim;
import es.ucm.povaleLines.functions.Lines;
import es.ucm.povaleLines.functions.MatcherGroup;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manuel
 */
public class LinesPlugin extends PluginInfo {

    @Override
    public String getIdPlugin() {
        return "es.ucm.povaleLines.LinesPlugin";
    }

    @Override
    public List<Function> getFunctions() {
        return Arrays.asList(
                new LineMatchAgainst(), 
                new LineTrim(), 
                new Lines(),
                new MatcherGroup()
        );
    }

    @Override
    public List<Predicate> getPredicates() {
        return Arrays.asList(
                new LineContains(), 
                new LineEndsWith(), 
                new LineStartsWith(),
                new MatcherMatches()
        );
    }

    @Override
    public List<Class<?>> getEntities() {
        return Arrays.asList(
                File.class,
                Directory.class,
                MatchResult.class
        );
    }

    @Override
    public List<String> getEditorTypes() {
        return Arrays.asList("FileEntity","DirectoryEntity");
    }

    @Override
    public ParameterEditor<? extends Entity> getEditor(String name, Map<String, String> parameters) {
        if(null != name)switch (name) {
            case "FileEntity":
                return new FileEditor(parameters);
            case "DirectoryEntity":
                return new DirectoryEditor(parameters);
            case "MatchResultEntity":
                return new MatchResultEditor(parameters);
            default:
                break;
        }
        return null;
    }
    
}
