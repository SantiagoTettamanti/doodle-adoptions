package santiagotettamanti.com.doodleadoptions.notification;

import jakarta.persistence.*;

@Table
@Entity
public class Notification {
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
