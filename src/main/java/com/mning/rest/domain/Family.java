package com.mning.rest.domain;

/**
 * Created by mning on 8/14/2015.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long familyId;

    private String familyName;

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
