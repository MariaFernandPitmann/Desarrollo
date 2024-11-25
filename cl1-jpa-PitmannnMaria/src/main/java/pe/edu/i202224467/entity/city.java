package pe.edu.i202224467.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class city {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;


    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country country;

    public city() {
    }

    public city(Integer ID, String name, String countryCode, String district, Integer population, country country) {
        this.ID = ID;
        this.Name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
        this.country = country;
    }



    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public pe.edu.i202224467.entity.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.i202224467.entity.country country) {
        this.country = country;
    }
}
