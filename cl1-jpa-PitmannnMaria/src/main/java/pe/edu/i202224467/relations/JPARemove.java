package pe.edu.i202224467.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224467.entity.country;

public class JPARemove {

    // referenciar al em
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
    EntityManager em = emf.createEntityManager();


    //referenciar el libro
   country country = em.find(country.class, 1);



}

