package santiagotettamanti.com.doodleadoptions.shelter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Shelter getShelterById(Integer id) {
        Optional<Shelter> shelterFound = shelterRepository.findById(id);
        if (shelterFound.isPresent()) {
            return shelterFound.get();
        } else {
            return null;
        }
    }

    public Shelter createShelter(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

}
