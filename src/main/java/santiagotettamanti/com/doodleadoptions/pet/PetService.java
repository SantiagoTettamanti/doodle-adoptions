package santiagotettamanti.com.doodleadoptions.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    private final PetRepository petRepository;
    @Autowired   //<--to inject [[DEPENDENCY INJECTION]]
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Pet getPetById(Integer id) {
        Optional<Pet> petFound = petRepository.findById(id);
        if (petFound.isPresent()) {
            return petFound.get();
        } else {
            return null;
        }
    }

    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }
}
