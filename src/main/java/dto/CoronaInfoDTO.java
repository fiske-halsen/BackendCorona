
package dto;


public class CoronaInfoDTO {
    
    public String country;
    public String continent;
    public String date;
    public int totalCases;
    public int newCases;
    public int totalDeaths;
    public int newDeaths;
    public double caseFatalityRatio;
    public double dailyIncidenceConfirmedCases;
    public int sevenDaySmoothedDailyChange;
    public int cumulativeTotal;

    public CoronaInfoDTO(CountryCoronaDTO countryCoronaDTO, CountryTestDTO countryTestDTO) {
        this.country = countryCoronaDTO.country;
        this.continent = countryCoronaDTO.continent;
        this.date = countryCoronaDTO.date;
        this.totalCases = countryCoronaDTO.totalCases;
        this.newCases = countryCoronaDTO.newCases;
        this.totalDeaths = countryCoronaDTO.totalDeaths;
        this.newDeaths = countryCoronaDTO.newDeaths;
        this.caseFatalityRatio = countryCoronaDTO.caseFatalityRatio;
        this.dailyIncidenceConfirmedCases = countryCoronaDTO.dailyIncidenceConfirmedCases;
        this.sevenDaySmoothedDailyChange = countryTestDTO.sevenDaySmoothedDailyChange;
        this.cumulativeTotal = countryTestDTO.cumulativeTotal;
    }

}
