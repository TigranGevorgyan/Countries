package com.company;

/**
 * Created by Taron on 04/09/17.
 */
public class Country {

    public int id;
    public String countryCode;
    public String englishName;
    public String franchName;

    public Country(int id, String countryCode, String englishName, String franchName) {
        this.id = id;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.franchName = franchName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getFranchName() {
        return franchName;
    }

    public void setFranchName(String franchName) {
        this.franchName = franchName;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, countryCode: %s, englishName: %s, franchName: %s.",id,countryCode,englishName,franchName);
    }
}
