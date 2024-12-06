package pe.edu.cibertec.backoffice_mvc_d.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer languageId;
    public String  name;
    public Date lastUpdate;

    //Referencia de uno a muchos
    //Al consultar la lista de film , consultamos toda la lista de films de e
    //ese lenguaje
    @OneToMany(mappedBy = "language")
    private List<Film> films;
}
