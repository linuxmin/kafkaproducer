package at.ac.unive.hartmann.MS3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    @Autowired
    private AdAlertRepository adAlertRepository;

    @Autowired
    SimpleSourceBean simpleSourceBean;

    public List<Advertisement> getAdvertisementByName(String adItemName){
        return searchRepository.findAdvertisementByAdItemNameContainingIgnoreCase(adItemName);
    }

    public Advertisement saveAdvertisement(Advertisement advertisement){
        searchRepository.save(advertisement);
        simpleSourceBean.publishAdvertisementChange("SAVE", advertisement.getAdItemId(),advertisement.getAdItemName(),advertisement.getAdItemPrice());
        return searchRepository.findAdvertisementByAdItemId(advertisement.getAdItemId());
    }

    public Advertisement updateAdvertisement(Advertisement advertisement){
        Advertisement advertisementToUpdate = searchRepository.
                findAdvertisementByAdForeignId(advertisement.getAdForeignId());
        advertisement.setAdItemId(advertisementToUpdate.getAdItemId());
        searchRepository.save(advertisement);
        return advertisement;
    }

    public void deleteAdvertisement(Advertisement advertisement){
        Advertisement advertisementToDelete = searchRepository.
                findAdvertisementByAdForeignId(advertisement.getAdForeignId());
        searchRepository.delete(advertisementToDelete);
    }

    public AdAlert saveAdAlert(AdAlert adAlert){
        return adAlertRepository.save(adAlert);
    }

    public List<AdAlert> getAdAlertByAdItemName(String adItemName){
        return adAlertRepository.findAdAlertByAdItemName(adItemName);
    }

}