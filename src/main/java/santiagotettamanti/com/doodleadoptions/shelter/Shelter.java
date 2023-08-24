package santiagotettamanti.com.doodleadoptions.shelter;

import jakarta.persistence.*;

@Table
@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer shelterId;
    private String phoneNumber;

    public int getShelterId() {
        return shelterId;
    }
    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
