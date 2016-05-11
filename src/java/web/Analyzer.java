/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author robin
 */
@Path("analyzer")
public class Analyzer {

    @Context
    private UriInfo context;

    private List<String> profanityList;
    /*
    @PostConstruct
    public void init() {
	FileInputStream fis = null;
        try {
            profanityList = new ArrayList<>();
            
            fis = new FileInputStream("/resources/profanity_dutch.txt");
            //Construct BufferedReader from InputStreamReader
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                profanityList.add(line);
            }   br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);    
        } catch (IOException ex) {
            Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
    
    /**
     * Creates a new instance of GenericResource
     */
    public Analyzer() {
    }

    /**
    * Retrieves representation of an instance of helloWorld.HelloWorld
    * @return an instance of java.lang.String
    */
    @GET
    @Produces("text/plain")
    public String getHtml() {
        return "testing rest";
    }

    @POST
    @Produces("text/plain")
    @Consumes("text/plain")
    public String analyze(String text) {
        // Prepare string:
        text = text.trim();
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Double score = 0.0;
        for (String word : words) {
            /*if (profanityList.contains(word)) {
                score += 1/text.length();
            }*/
            System.out.println(word + "!");
            if (word.equals("hoer")) {
                System.out.println("Equalled");
                score += 1.0/text.length();
                System.out.println(score);
            }
        }
        return "Analyze: " + text + score.toString();
    }
    /**
     * PUT method for updating or creating an instance of Analyzer
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
    
    
}
