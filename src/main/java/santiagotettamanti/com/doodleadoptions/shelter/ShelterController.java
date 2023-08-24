package santiagotettamanti.com.doodleadoptions.shelter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import santiagotettamanti.com.doodleadoptions.address.AddressController;
import santiagotettamanti.com.doodleadoptions.address.AddressService;

import java.util.List;

@RestController
public class ShelterController {
    private final ShelterService shelterService;

    @Autowired
    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    @GetMapping ("/shelter")
    public List<Shelter> getAllShelters() {
        return shelterService.getAllShelters();
    }

    @PostMapping ("/shelter")
    public Shelter createShelter(@RequestBody Shelter shelter) {
        return shelterService.createShelter(shelter);
    }
}
