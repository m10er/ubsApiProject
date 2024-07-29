package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Facet{
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description") 
    public String description;
    @JsonProperty("Options") 
    public ArrayList<Option> options;
}
