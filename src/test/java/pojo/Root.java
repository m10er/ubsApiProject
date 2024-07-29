package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Root{
    @JsonProperty("Jobs")
    public Jobs jobs;
    @JsonProperty("Facets") 
    public Facets facets;
    @JsonProperty("JobsType") 
    public Object jobsType;
    @JsonProperty("JobsCount") 
    public int jobsCount;
    @JsonProperty("FiltersCount") 
    public int filtersCount;
    @JsonProperty("SortFields") 
    public ArrayList<SortField> sortFields;
    @JsonProperty("SearchCriteria") 
    public Object searchCriteria;
    @JsonProperty("Latitude") 
    public int latitude;
    @JsonProperty("Longitude") 
    public int longitude;
}
