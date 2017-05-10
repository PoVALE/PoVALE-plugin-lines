/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.annotation.ParamDescription;
import es.ucm.povale.entity.IntegerEntity;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;
import es.ucm.povaleLines.entities.MatchResult;

/**
 *
 * @author manuel
 */
public class MatcherGroup extends Function {
    private String message;
    @Override
    public String getName() {
        return "match-group";
    }
    
    @CallableMethod
    public StringEntity match(@ParamDescription("")MatchResult mr, IntegerEntity i) {
        if (i.getValue() >= 1 && i.getValue() <= mr.getGroups().size()) {
            message = mr.getGroups().get(i.getValue() - 1);
            return new StringEntity(message);
        } else {
            message="";
            return new StringEntity(message);
        }
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}
