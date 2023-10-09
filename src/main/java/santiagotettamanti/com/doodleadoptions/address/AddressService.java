package santiagotettamanti.com.doodleadoptions.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santiagotettamanti.com.doodleadoptions.pet.Pet;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Integer id) {
        Optional<Address> addressFound = addressRepository.findById(id);
        if(addressFound.isPresent()) {
             return addressFound.get();
        } else {
            return null;
        }
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address deleteAddressById(Integer id) {
       Address addressFound = getAddressById(id);
       if(addressFound == null) {
           throw new RuntimeException("error");
       }
       addressRepository.deleteById(id);
       return addressFound;
    }
}
