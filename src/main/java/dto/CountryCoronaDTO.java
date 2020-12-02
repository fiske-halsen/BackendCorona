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

    public String Country;
    public String Continent;
    public String Date;
    public int TotalCases;
    public int NewCases;
    public int TotalDeaths;
    public int NewDeaths;
    public float CaseFatalityRatio;
    public float DailyIncidenceConfirmedCases;

    public CountryCoronaDTO(String country, String continent, String date, int totalCases, int newCases, int totalDeaths, int newDeaths, float caseFatalityRatio, float dailyIncidenceConfirmedCases) {
        this.Country = country;
        this.Continent = continent;
        this.Date = date;
        this.TotalCases = totalCases;
        this.NewCases = newCases;
        this.TotalDeaths = totalDeaths;
        this.NewDeaths = newDeaths;
        this.CaseFatalityRatio = caseFatalityRatio;
        this.DailyIncidenceConfirmedCases = dailyIncidenceConfirmedCases;
    }
}
