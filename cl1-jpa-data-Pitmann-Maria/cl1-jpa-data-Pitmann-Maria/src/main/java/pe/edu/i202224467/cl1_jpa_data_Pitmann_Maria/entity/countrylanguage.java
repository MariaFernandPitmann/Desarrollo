package pe.edu.i202224467.cl1_jpa_data_Pitmann_Maria.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class countrylanguage {

    @Id
    private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;

}
