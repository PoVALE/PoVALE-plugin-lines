/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleLines.functions;

import es.ucm.povale.annotation.CallableMethod;
import es.ucm.povale.entity.ListEntity;
import es.ucm.povale.entity.StringEntity;
import es.ucm.povale.function.Function;
import es.ucm.povaleFiles.entities.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author manuel
 */
public class Lines extends Function {

    @Override
    public String getName() {
        return "lines";
    }
    
    @CallableMethod
    public ListEntity getLines(File f) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(f.getContents()));
            List<StringEntity> results = 
                    br.lines()
                            .map(str -> new StringEntity(str))
                            .collect(Collectors.toList());
            ListEntity result = new ListEntity(results);
            br.close();
            return result;
        } catch (IOException e) {
            return new ListEntity(new LinkedList<>());
        }
    }
    
}
