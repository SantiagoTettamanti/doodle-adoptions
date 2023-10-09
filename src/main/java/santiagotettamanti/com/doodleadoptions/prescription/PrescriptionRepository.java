package santiagotettamanti.com.doodleadoptions.prescription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import santiagotettamanti.com.doodleadoptions.shelter.Shelter;

@Repository
public interface PrescriptionRepository extends JpaRepository<Shelter, Integer> {
}
