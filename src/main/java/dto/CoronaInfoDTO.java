
package dto;


public class CoronaInfoDTO {
    
    public String Country;
    public String Continent;
    public String Date;
    public int TotalCases;
    public int NewCases;
    public int TotalDeaths;
    public int NewDeaths;
    public double CaseFatalityRatio;
    public double DailyIncidenceConfirmedCases;
    public int SevenDaySmoothedDailyChange;
    public int CumulativeTotal;

    public CoronaInfoDTO(CountryCoronaDTO countryCoronaDTO, CountryTestDTO countryTestDTO) {
        this.Country = countryCoronaDTO.Country;
        this.Continent = countryCoronaDTO.Continent;
        this.Date = countryCoronaDTO.Date;
        this.TotalCases = countryCoronaDTO.TotalCases;
        this.NewCases = countryCoronaDTO.NewCases;
        this.TotalDeaths = countryCoronaDTO.TotalDeaths;
        this.NewDeaths = countryCoronaDTO.NewDeaths;
        this.CaseFatalityRatio = countryCoronaDTO.CaseFatalityRatio;
        this.DailyIncidenceConfirmedCases = countryCoronaDTO.DailyIncidenceConfirmedCases;
        this.SevenDaySmoothedDailyChange = countryTestDTO.SevenDaySmoothedDailyChange;
        this.CumulativeTotal = countryTestDTO.CumulativeTotal;
    }

}
