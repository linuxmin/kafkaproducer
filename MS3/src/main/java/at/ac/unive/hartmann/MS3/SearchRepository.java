package at.ac.unive.hartmann.MS3;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends CrudRepository<Advertisement, String> {
    public Advertisement findAdvertisementByAdItemId(Integer adItemId);
    public List<Advertisement> findAdvertisementByAdItemNameContainingIgnoreCase(String adItemName);
    public Advertisement findAdvertisementByAdForeignId(String adForeignId);

}