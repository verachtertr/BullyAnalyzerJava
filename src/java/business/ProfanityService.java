/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.Profanity;

/**
 *
 * @author robin
 */
@Stateless
public class ProfanityService {
    
    @PersistenceContext
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
        
    public void addTerm(Profanity p) {
        em.persist(p);
    }
    
    public Double getScore(String text) {
        // Prepare string:
        text = text.trim();
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Double score = 0.0;
        for (String word : words) {
            System.out.println(word);
            word = word.trim();
            List<Profanity> matches = em.createNamedQuery("Profanities.find").setParameter("searchTerm", word).getResultList();
            if (matches.size() > 0) {
                System.out.println("Matched");
                score += 1.0/words.length;
            }
        }
        
        return score;
    }
    
    public Boolean isEmpty() {
        return em.createNamedQuery("Profanities.getAll").getResultList().isEmpty();
    }
    
    
}
