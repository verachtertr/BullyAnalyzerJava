/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import business.ProfanityService;
import helper.ProfanityData;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import persistence.Profanity;

/**
 * REST Web Service
 *
 * @author robin
 */
@Path("/analyzer")
public class Analyzer {

    @Context
    private UriInfo context;
    
    @EJB
    private ProfanityService serv;
    
    private ProfanityData pd = new ProfanityData();

    /**
     * Creates a new instance of GenericResource
     */
    public Analyzer() {
    }
    
    @PostConstruct 
    public void init() {
        if (serv.isEmpty()) {
            // Empty Database -> import default profaniets_dutch.txt
            List<String> profanities = pd.getList();
            for (String p : profanities) {
                Profanity pr = new Profanity(p);
                serv.addTerm((pr));
            }
        }
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
        Double score = serv.getScore(text);
        return "{\"value\":" + score.toString() + "}";
    }    
}
