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
    
    public int SevenDaySmoothedDailyChange;
    public int CumulativeTotal;

    public CountryTestDTO(int sevenDaySmoothedDailyChange, int cumulativeTotal) {
        this.SevenDaySmoothedDailyChange = sevenDaySmoothedDailyChange;
        this.CumulativeTotal = cumulativeTotal;
    }   
}
