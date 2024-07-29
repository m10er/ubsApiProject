package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SortField{
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value") 
    public String value;
}
