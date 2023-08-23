package santiagotettamanti.com.doodleadoptions.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    private final AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping ("/address")
    public Address getAllAddresses() {
        return AddressService
    }
    @PostMapping ("/address")
    public Address createAddress(@RequestBody Address address) {
        return AddressService
    }
}
