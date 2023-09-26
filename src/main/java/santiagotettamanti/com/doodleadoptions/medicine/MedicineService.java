package santiagotettamanti.com.doodleadoptions.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {
    private final MedicineRepository medicineRepository;
    @Autowired
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
    public Medicine getMedicineById(Integer id) {
        Optional<Medicine> medicineFound = medicineRepository.findById(id);
        if(medicineFound.isPresent()) {
            return medicineFound.get();
        } else {
            return null;
        }
    }

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
}
