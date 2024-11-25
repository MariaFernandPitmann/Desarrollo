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
public class city {

    @Id
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;


}
