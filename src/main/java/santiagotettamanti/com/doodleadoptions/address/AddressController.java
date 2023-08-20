package santiagotettamanti.com.doodleadoptions.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AddressController {
    private final AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping ("/address")
    public Address createAddress(@RequestBody Address address) {
        return null;
    }

}
