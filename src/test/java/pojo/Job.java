package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;


@Data
public class Job{
    @JsonProperty("Questions")
    public ArrayList<Question> questions;
    @JsonProperty("Selected") 
    public boolean selected;
    public boolean isSocialReferralJobRestricted;
    public String localeId;
    @JsonProperty("IsActive") 
    public boolean isActive;
    @JsonProperty("SavedDate") 
    public Object savedDate;
    @JsonProperty("SavedDateTime") 
    public Object savedDateTime;
    @JsonProperty("Language") 
    public Object language;
    @JsonProperty("Applied") 
    public boolean applied;
    @JsonProperty("NoOfDaysToExpire") 
    public int noOfDaysToExpire;
    @JsonProperty("NoOfHoursToExpire") 
    public int noOfHoursToExpire;
    @JsonProperty("Link") 
    public String link;
    public int score;
    public int geodist;
}
