/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author phill
 */
public class CountryCoronaDTO {

    private String country;
    private String continent;
    private String date;
    private int totalCases;
    private int newCases;
    private int totalDeaths;
    private int newDeaths;
    private double caseFatalityRatio;
    private double dailyIncidenceConfirmedCases;

    public CountryCoronaDTO(String country, String continent, String date, int totalCases, int newCases, int totalDeaths, int newDeaths, double caseFatalityRatio, double dailyIncidenceConfirmedCases) {
        this.country = country;
        this.continent = continent;
        this.date = date;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.caseFatalityRatio = caseFatalityRatio;
        this.dailyIncidenceConfirmedCases = dailyIncidenceConfirmedCases;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getNewCases() {
        return newCases;
    }

    public void setNewCases(int newCases) {
        this.newCases = newCases;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    public double getCaseFatalityRatio() {
        return caseFatalityRatio;
    }

    public void setCaseFatalityRatio(double caseFatalityRatio) {
        this.caseFatalityRatio = caseFatalityRatio;
    }

    public double getDailyIncidenceConfirmedCases() {
        return dailyIncidenceConfirmedCases;
    }

    public void setDailyIncidenceConfirmedCases(double dailyIncidenceConfirmedCases) {
        this.dailyIncidenceConfirmedCases = dailyIncidenceConfirmedCases;
    }
    
    
    
    

}
