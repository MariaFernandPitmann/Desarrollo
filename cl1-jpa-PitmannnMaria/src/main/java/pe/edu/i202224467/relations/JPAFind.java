package pe.edu.i202224467.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224467.entity.country;

public class JPAFind {

    public static void main(String[] args) {

        // referenciar al em
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Find Libro
        country country = em.find(country.class, "PER");
        System.out.println(country.toString());

    }


}
