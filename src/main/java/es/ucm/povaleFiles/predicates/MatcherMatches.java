/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleFiles.predicates;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.predicate.Predicate;
import es.ucm.povaleFiles.entities.MatchResult;

/**
 *
 * @author manuel
 */
public class MatcherMatches extends Predicate {

    @Override
    public String getName() {
        return "matches";
    }
    
    @CallableMethod
    public boolean matches(MatchResult mr) {
        return mr.matches();
    }
    
}
