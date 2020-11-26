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
    
    public int sevenDaySmoothedDailyChange;
    public int cumulativeTotal;

    public CountryTestDTO(int sevenDaySmoothedDailyChange, int cumulativeTotal) {
        this.sevenDaySmoothedDailyChange = sevenDaySmoothedDailyChange;
        this.cumulativeTotal = cumulativeTotal;
    }   
}
