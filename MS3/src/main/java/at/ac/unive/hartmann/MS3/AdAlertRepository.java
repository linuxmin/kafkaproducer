package at.ac.unive.hartmann.MS3;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdAlertRepository extends CrudRepository<AdAlert, String> {
    public List<AdAlert> findAdAlertByAdItemName(String adItemName);

}