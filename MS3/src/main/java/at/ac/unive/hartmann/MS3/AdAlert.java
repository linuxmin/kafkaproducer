package at.ac.unive.hartmann.MS3;

import javax.persistence.*;

@Entity
@Table(name = "adalert")
public class AdAlert {
    @Id
    @GeneratedValue
    @Column(name = "alertid", nullable = false)
    private Integer alertId;
    @Column(name ="userid", nullable = false)
    private String userId;
    @Column(name = "aditemname", nullable = false)
    private String adItemName;

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdItemName() {
        return adItemName;
    }

    public void setAdItemName(String adItemName) {
        this.adItemName = adItemName;
    }
}
