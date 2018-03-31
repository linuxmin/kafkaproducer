package at.ac.unive.hartmann.MS3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController      //Spring Controller class, exposing http endpoints (e.g. for GET,POST...)
@RequestMapping(value = "ms3/")   //root uri for controller
public class SearchServiceController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value="/search/{adItemName}", method = RequestMethod.GET)
    public List<Advertisement> getAdvertisement (@PathVariable("adItemName") String adItemName){
        return searchService.getAdvertisementByName(adItemName);
    }

    @RequestMapping(value="/advertisements/create/", method = RequestMethod.POST)
    public Advertisement createAdvertisement (@RequestBody Advertisement advertisement) {
        return searchService.saveAdvertisement(advertisement);
    }

    @RequestMapping(value="/advertisements/update/", method = RequestMethod.POST)
    public Advertisement updateAdvertisement (@RequestBody Advertisement advertisement) {
        return searchService.updateAdvertisement(advertisement);
    }
}