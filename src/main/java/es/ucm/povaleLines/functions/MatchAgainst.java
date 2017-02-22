/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;
import es.ucm.povaleFiles.entities.MatchResult;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author manuel
 */
public class LineMatchAgainst extends Function {

    @Override
    public String getName() {
        return "line-match-against";
    }
    
    @CallableMethod
    public MatchResult matchAgainst(StringEntity line, StringEntity regex, StringEntity flags) {
        int regexpFlags = 0;
        if (flags.toString().contains("i")) {
            regexpFlags |= Pattern.CASE_INSENSITIVE;
        }
        if (flags.toString().contains("g")) {
            regexpFlags |= Pattern.MULTILINE;
        }
        
        try {
            Pattern p = Pattern.compile(regex.toString(), regexpFlags);
            Matcher m = p.matcher(line.toString());
            
            List<String> groups = new LinkedList<>();
            
            if (m.matches()) {
                for (int i = 1; i < m.groupCount(); i++) {
                    groups.add(m.group(i));
                }
            }
            
            return new MatchResult(m.matches(), groups);
            
        } catch (PatternSyntaxException pe) {
            return new MatchResult(false, new LinkedList<>());
        }
    }
}
