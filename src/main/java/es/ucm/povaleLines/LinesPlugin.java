package es.ucm.povaleLines;

import es.ucm.povale.entity.Entity;
import es.ucm.povale.function.Function;
import es.ucm.povale.parameter.ParameterEditor;
import es.ucm.povale.plugin.PluginInfo;
import es.ucm.povale.predicate.Predicate;
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
        return "LinesPlugin";
    }

    @Override
    public List<Function> getFunctions() {
        return Arrays.asList();
    }

    @Override
    public List<Predicate> getPredicates() {
        return Arrays.asList();
    }

    @Override
    public List<Class<?>> getEntities() {
        return Arrays.asList();
    }

    @Override
    public List<String> getEditorTypes() {
        return Arrays.asList();
    }

    @Override
    public ParameterEditor<? extends Entity> getEditor(String string, Map<String, String> map) {
        return null;
    }
    
}
