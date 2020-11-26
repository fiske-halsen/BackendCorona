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

    public String country;
    public String continent;
    public String date;
    public int totalCases;
    public int newCases;
    public int totalDeaths;
    public int newDeaths;
    public double caseFatalityRatio;
    public double dailyIncidenceConfirmedCases;

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
}
