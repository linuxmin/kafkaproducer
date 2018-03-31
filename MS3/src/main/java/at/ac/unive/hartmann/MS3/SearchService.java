package at.ac.unive.hartmann.MS3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    public List<Advertisement> getAdvertisementByName(String adItemName){
        return searchRepository.findAdvertisementByAdItemNameContainingIgnoreCase(adItemName);
    }

    public Advertisement saveAdvertisement(Advertisement advertisement){
        searchRepository.save(advertisement);
        return searchRepository.findAdvertisementByAdItemId(advertisement.getAdItemId());
    }

    public Advertisement updateAdvertisement(Advertisement advertisement){
        Advertisement advertisementToUpdate = searchRepository.
                findAdvertisementByAdForeignId(advertisement.getAdForeignId());
        advertisement.setAdItemId(advertisementToUpdate.getAdItemId());
        searchRepository.save(advertisement);
        return advertisement;
    }

}