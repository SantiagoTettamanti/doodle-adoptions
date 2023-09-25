package santiagotettamanti.com.doodleadoptions.prescription;

import jakarta.persistence.*;

@Table
@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
