package at.ac.unive.hartmann.MS3;

public class AdvertisementChangeModel {
    private String type;
    private String action;
    private Integer adItemId;
    private String adItemName;
    private Double adItemPrice;

    public  AdvertisementChangeModel(String type, String action, Integer adItemId, String adItemName, Double adItemPrice) {
        super();
        this.type   = type;
        this.action = action;
        this.adItemId = adItemId;
        this.adItemName = adItemName;
        this.adItemPrice = adItemPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getAdItemId() {
        return adItemId;
    }

    public void setAdItemId(Integer adItemId) {
        this.adItemId = adItemId;
    }


    public String getAdItemName() {
        return adItemName;
    }

    public void setAdItemName(String adItemName) {
        this.adItemName = adItemName;
    }

    public Double getAdItemPrice() {
        return adItemPrice;
    }

    public void setAdItemPrice(Double adItemPrice) {
        this.adItemPrice = adItemPrice;
    }
}
