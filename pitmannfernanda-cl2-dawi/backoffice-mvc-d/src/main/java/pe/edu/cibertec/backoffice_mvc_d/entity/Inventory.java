package pe.edu.cibertec.backoffice_mvc_d.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer inventoryId;

    @ManyToOne
    @JoinColumn(name = "filmId")
    private Film film;


}
