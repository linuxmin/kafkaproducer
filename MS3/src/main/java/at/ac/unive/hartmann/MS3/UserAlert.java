package at.ac.unive.hartmann.MS3;

import javax.persistence.*;

@Entity
@Table(name = "useralert")
public class UserAlert {
    @Id
    @GeneratedValue
    @Column(name = "useralertid", nullable = false)
    private Integer userAlertId;
    @Column(name="userid", nullable = false)
    private String userId;
    @Column(name="foreignid", nullable = false)
    private String foreignId;
    @Column(name="aditemid", nullable = false)
    private Integer adItemId;

    public Integer getUserAlertId() {
        return userAlertId;
    }

    public void setUserAlertId(Integer userAlertId) {
        this.userAlertId = userAlertId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getForeignId() {
        return foreignId;
    }

    public void setForeignId(String foreignId) {
        this.foreignId = foreignId;
    }

    public Integer getAdItemId() {
        return adItemId;
    }

    public void setAdItemId(Integer adItemId) {
        this.adItemId = adItemId;
    }
}
