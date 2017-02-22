/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleFiles.predicates;

import es.ucm.povale.annotation.CallableMethod;
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
    public boolean lineStartsWith(StringEntity str, StringEntity prefix) {
        return str.toString().startsWith(prefix.toString());
    }
    
}
