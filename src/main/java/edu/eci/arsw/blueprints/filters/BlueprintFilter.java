/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.filters;

import edu.eci.arsw.blueprints.model.Blueprint;

/**
 *
 * @author 2103021
 */
public interface BlueprintFilter {
    public Blueprint filter(Blueprint bp);
}
