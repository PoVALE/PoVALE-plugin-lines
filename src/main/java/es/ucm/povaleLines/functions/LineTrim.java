/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;

/**
 *
 * @author manuel
 */
public class LineTrim extends Function {

    @Override
    public String getName() {
        return "line-trim";
    }
    
    @CallableMethod
    public StringEntity trim(StringEntity s) {
        return new StringEntity(s.toString().trim());
    }
    
}
