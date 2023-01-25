package com.example.springmvcdemo;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteProgrammingLanguage;
    private LinkedHashMap<String, String> favoriteProgrammingLanguageOptions;
    private String[] operatingSystems;
    private LinkedHashMap<String, String> operatingSystemsOptions;

    public Student() {

        // Populate Country options
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States");

        // Populate Favorite Programming Language options
        favoriteProgrammingLanguageOptions = new LinkedHashMap<>();

        favoriteProgrammingLanguageOptions.put("Java", "Java");
        favoriteProgrammingLanguageOptions.put("C#", "C#");
        favoriteProgrammingLanguageOptions.put("PHP", "PHP");
        favoriteProgrammingLanguageOptions.put("Ruby", "Ruby");
        favoriteProgrammingLanguageOptions.put("Python", "Python");

        // Populate Operating Systems options
        operatingSystemsOptions = new LinkedHashMap<>();

        operatingSystemsOptions.put("Linux", "Linux");
        operatingSystemsOptions.put("Mac OS", "Mac OS");
        operatingSystemsOptions.put("MS Windows", "MS Windows");
    }

    public LinkedHashMap<String, String> getOperatingSystemsOptions() {
        return operatingSystemsOptions;
    }

    public void setOperatingSystemsOptions(LinkedHashMap<String, String> operatingSystemsOptions) {
        this.operatingSystemsOptions = operatingSystemsOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getFavoriteProgrammingLanguageOptions() {
        return favoriteProgrammingLanguageOptions;
    }

    public void setFavoriteProgrammingLanguageOptions(LinkedHashMap<String, String> favoriteProgrammingLanguageOptions) {
        this.favoriteProgrammingLanguageOptions = favoriteProgrammingLanguageOptions;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
