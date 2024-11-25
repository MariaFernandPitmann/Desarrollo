package pe.edu.i202224467.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class country {

    @Id
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private String SurfaceArea;
    private Integer IndepYear;
    private String Population;
    private String LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private String Capital;
    private String code2;


    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<city> city;

    // Relación uno a muchos con Language
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<countrylanguage> countrylanguage;

    public country() {
    }

    public country(String code, String name, String continent, String region, String surfaceArea, Integer indepYear, String population, String lifeExpectancy, Double GNP, Double GNPOld, String localName, String governmentForm, String headOfState, String capital, String code2, List<city> city, List<countrylanguage> countrylanguage) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        this.code2 = code2;
        this.city = city;
        this.countrylanguage = countrylanguage;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer indepYear) {
        IndepYear = indepYear;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public String  getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(String lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public List<pe.edu.i202224467.entity.city> getCity() {
        return city;
    }

    public void setCity(List<pe.edu.i202224467.entity.city> city) {
        this.city = city;
    }

    public List<pe.edu.i202224467.entity.countrylanguage> getCountrylanguage() {
        return countrylanguage;
    }

    public void setCountrylanguage(List<pe.edu.i202224467.entity.countrylanguage> countrylanguage) {
        this.countrylanguage = countrylanguage;
    }
}
