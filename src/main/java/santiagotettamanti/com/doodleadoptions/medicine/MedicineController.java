package santiagotettamanti.com.doodleadoptions.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicineController {
    private final MedicineService medicineService;
    @Autowired
    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }
    @GetMapping ("/medicine")
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }
    @PostMapping ("/medicine")
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicineService.createMedicine(medicine);
    }
}
