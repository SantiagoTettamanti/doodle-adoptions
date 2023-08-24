package santiagotettamanti.com.doodleadoptions.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping ("/address")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
    @PostMapping ("/address")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }
}
