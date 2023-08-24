package santiagotettamanti.com.doodleadoptions.shelter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {
    private final ShelterRepository shelterRepository;
    @Autowired
    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    public List<Shelter> getAllShelters() {
        return shelterRepository.findAll();
    }

    public Shelter createShelter(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

}
