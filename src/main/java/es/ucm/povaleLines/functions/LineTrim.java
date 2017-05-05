/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.annotation.ParamDescription;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;

/**
 *
 * @author manuel
 */
public class LineTrim extends Function {
    private String stringResult;
    @Override
    public String getName() {
        return "line-trim";
    }
    
    @CallableMethod
    public StringEntity trim(@ParamDescription("")StringEntity s) {
        stringResult = s.toString().trim();
        return new StringEntity(stringResult);
    }

    @Override
    public String getMessage() {
        return stringResult;
    }
    
}
