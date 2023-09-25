package santiagotettamanti.com.doodleadoptions.medicine;

import jakarta.persistence.*;

@Table
@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
