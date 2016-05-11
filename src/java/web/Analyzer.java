/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import helper.ProfanityData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author robin
 */
@Path("/analyzer")
public class Analyzer {

    @Context
    private UriInfo context;

    private ProfanityData data = new ProfanityData();    
    
    /**
     * Creates a new instance of GenericResource
     */
    public Analyzer() {
    }

    /**
     * analyze the text, returns a score.
     * @param text
     * @return 
     */
    @POST
    @Produces("application/json")
    @Consumes("text/plain")
    public String analyze(String text) {
        // Prepare string:
        Double score = data.getScore(text);
        return "{\"value\":" + score.toString() + "}";
    }    
}
