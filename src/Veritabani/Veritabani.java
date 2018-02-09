/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veritabani;
import Entities.Kisi;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author unver
 */
public class Veritabani {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public void baglantiAc(){
        emf=javax.persistence.Persistence.createEntityManagerFactory("JPA_ProjectPU");
        em=emf.createEntityManager();
    }
    
    
    public void persist(Object object){
        
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
    }
}
