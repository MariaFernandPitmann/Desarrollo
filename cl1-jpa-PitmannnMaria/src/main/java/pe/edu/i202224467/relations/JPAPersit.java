package pe.edu.i202224467.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224467.entity.country;

public class JPAPersit {

    // referenciar al em
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
    EntityManager em = emf.createEntityManager();

    //crear un pais

//    country country = new country(1, "Albania", "Europa", "Norte", "40", 2, "3", "maxima",
 //           "30", "20", "Londagan", "Formula2", "2", "Lobimania",
//            "2", "CityName", "LanguageName");

}
