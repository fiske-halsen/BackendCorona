
package dto;


public class CoronaInfoDTO {
    
    private String country;
    private String continent;
    private String date;
    private int totalCases;
    private int newCases;
    private int totalDeaths;
    private int newDeaths;
    private double caseFatalityRatio;
    private double dailyIncidenceConfirmedCases;
    private int sevenDaySmoothedDailyChange;
    private int cumulativeTotal;

    public CoronaInfoDTO(CountryCoronaDTO countryCoronaDTO, CountryTestDTO countryTestDTO) {
        this.country = countryCoronaDTO.getCountry();
        this.continent = countryCoronaDTO.getContinent();
        this.date = countryCoronaDTO.getDate();
        this.totalCases = countryCoronaDTO.getTotalCases();
        this.newCases = countryCoronaDTO.getNewCases();
        this.totalDeaths = countryCoronaDTO.getTotalDeaths();
        this.newDeaths = countryCoronaDTO.getNewDeaths();
        this.caseFatalityRatio = countryCoronaDTO.getCaseFatalityRatio();
        this.dailyIncidenceConfirmedCases = countryCoronaDTO.getDailyIncidenceConfirmedCases();
        this.sevenDaySmoothedDailyChange = countryTestDTO.getSevenDaySmoothedDailyChange();
        this.cumulativeTotal = countryTestDTO.getCumulativeTotal();
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

    public int getSevenDaySmoothedDailyChange() {
        return sevenDaySmoothedDailyChange;
    }

    public void setSevenDaySmoothedDailyChange(int sevenDaySmoothedDailyChange) {
        this.sevenDaySmoothedDailyChange = sevenDaySmoothedDailyChange;
    }

    public int getCumulativeTotal() {
        return cumulativeTotal;
    }

    public void setCumulativeTotal(int cumulativeTotal) {
        this.cumulativeTotal = cumulativeTotal;
    }
    
    
    
    
    
    
    
    
    
    
}
