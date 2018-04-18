package at.ac.unive.hartmann.MS3;

import javax.persistence.*;

@Entity
@Table(name="advertisement")
public class Advertisement {
    @Id
    @GeneratedValue
    @Column(name="aditemid", nullable = false)
    private Integer adItemId;
    @Column(name="aditemname")
    private String adItemName;
    @Column(name="aditemprice")
    private Double adItemPrice;
    @Column(name = "adforeignid",unique = true, nullable = false)
    private String adForeignId;

    public void setAdItemId(Integer adItemId) {
        this.adItemId = adItemId;
    }

    public Integer getAdItemId() {
        return adItemId;
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

    public String getAdForeignId() {
        return adForeignId;
    }

    public void setAdForeignId(String adForeignId) {
        this.adForeignId = adForeignId;
    }
}