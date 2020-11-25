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
public class CountryTestDTO {
    
    private int sevenDaySmoothedDailyChange;
    private int cumulativeTotal;

    public CountryTestDTO(int sevenDaySmoothedDailyChange, int cumulativeTotal) {
        this.sevenDaySmoothedDailyChange = sevenDaySmoothedDailyChange;
        this.cumulativeTotal = cumulativeTotal;
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
