/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.predicates;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.annotation.ParamDescription;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.predicate.Predicate;

/**
 *
 * @author manuel
 */
public class LineStartsWith extends Predicate {

    @Override
    public String getName() {
        return "line-starts-with";
    }
    
    @CallableMethod
    public boolean lineStartsWith(@ParamDescription("Comienza con")StringEntity str, StringEntity prefix) {
        return str.toString().startsWith(prefix.toString());
    }

    @Override
    public String getMessage() {
        return "Comienza con la cadena";
    }
    
}
