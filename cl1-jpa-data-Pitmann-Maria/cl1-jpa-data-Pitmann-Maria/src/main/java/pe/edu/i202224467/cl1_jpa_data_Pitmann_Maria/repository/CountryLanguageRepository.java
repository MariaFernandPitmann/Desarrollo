package pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.entity.countrylanguage;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryLanguageRepository extends CrudRepository<countrylanguage, String> {

    static List<countrylanguage> findByCountryCode(String countryCode) {
        return null;
    }


    Optional<countrylanguage> findFirstByCountryCode(String countryCode);

//    static void deleteAllById(Iterable<? extends String> ids) {

    }
//}
