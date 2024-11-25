package pe.edu.i202224467.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class countrylanguage {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;


    @ManyToOne
    @JoinColumn(name = "country_code")
    private country country;

    public countrylanguage() {
    }

    public countrylanguage(String countryCode, String language, String isOfficial, Double percentage, country country) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public pe.edu.i202224467.entity.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.i202224467.entity.country country) {
        this.country = country;
    }
}
