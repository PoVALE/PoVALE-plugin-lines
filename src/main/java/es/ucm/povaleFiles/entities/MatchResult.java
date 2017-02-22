/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ucm.povaleFiles.entities;

import es.ucm.povale.entity.Entity;
import java.util.List;
import java.util.regex.Matcher;

/**
 *
 * @author manuel
 */
public class MatchResult implements Entity {
    private boolean matches;
    private List<String> groups;

    public MatchResult(boolean matches, List<String> groups) {
        this.matches = matches;
        this.groups = groups;
    }

    public List<String> getGroups() {
        return groups;
    }

    public boolean matches() {
        return matches;
    }

}

