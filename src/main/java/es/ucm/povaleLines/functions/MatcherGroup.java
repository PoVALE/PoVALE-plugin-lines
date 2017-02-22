/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.entity.IntegerEntity;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;
import es.ucm.povaleFiles.entities.MatchResult;

/**
 *
 * @author manuel
 */
public class MatcherGroup extends Function {

    @Override
    public String getName() {
        return "match-group";
    }
    
    @CallableMethod
    public StringEntity match(MatchResult mr, IntegerEntity i) {
        if (i.getValue() >= 1 && i.getValue() <= mr.getGroups().size()) {
            return new StringEntity(mr.getGroups().get(i.getValue() - 1));
        } else {
            return new StringEntity("");
        }
    }
    
}
