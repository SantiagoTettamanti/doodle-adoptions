package santiagotettamanti.com.doodleadoptions.pet;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Table
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer petId;
    private String petName;
    private String animalType;
    private String shelterName;
    private int shelterId;
    private String sex;

    public int getPetId() {
        return petId;
    }
    public void setPetId(int petId) {
        this.petId = petId;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getAnimalType() {
        return animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public String getShelterName() {
        return shelterName;
    }
    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }
    public int getShelterId() {
        return shelterId;
    }
    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
