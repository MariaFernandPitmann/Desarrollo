package pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.entity.country;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.entity.countrylanguage;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.entity.city;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.repository.CountryLanguageRepository;
import pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.repository.CountryRepository;


import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@SpringBootApplication
public class SpringDataJpaDApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;
	countrylanguage countrylanguage;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {
		// Obtener los lenguajes hablados en el país "ARG" (Argentina)
		List<countrylanguage> argLanguages = CountryLanguageRepository.findByCountryCode("ARG");

		// Usar ifPresentOrElse para manejar la lógica
		Optional.ofNullable(argLanguages)
				.filter(languages -> !languages.isEmpty())
				.ifPresentOrElse(
						// Si se encuentran lenguajes para ARG, imprimirlos
						languages -> {
							System.out.println("Lenguajes en Argentina (ARG):");
							languages.forEach(language -> System.out.println(language.getLanguage()));
						},
						// Si no se encuentran lenguajes en ARG, buscar para PER (Perú)
						() -> {
							List<countrylanguage> perLanguages = CountryLanguageRepository.findByCountryCode("PER");
							if (!perLanguages.isEmpty()) {
								System.out.println("Lenguajes en Perú (PER):");
								perLanguages.forEach(language -> System.out.println(language.getLanguage()));
							} else {
								System.out.println("No se encontraron lenguajes para Argentina ni Perú.");
							}
						}
				);
	}


//	public void run(String... args) throws Exception {
//		// Eliminar los países "COL" y "ARG" y sus datos asociados
//		CountryLanguageRepository.deleteAllById(List.of("COL", "ARG"));
//
 //		System.out.println("Países COL y ARG, junto con sus ciudades y lenguajes, han sido eliminados.");
//	}

	}



