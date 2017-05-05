/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleFiles.predicates;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.annotation.ParamDescription;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.predicate.Predicate;

/**
 *
 * @author manuel
 */
public class LineEndsWith extends Predicate {
    @Override
    public String getName() {
        return "line-ends-with";
    }
    
    @CallableMethod
    public boolean lineStartsWith(@ParamDescription("Acaba con")StringEntity str, StringEntity suffix) {
        return str.toString().endsWith(suffix.toString());
    }

    @Override
    public String getMessage() {
        return "Termina con la cadena";
    }
    
}
