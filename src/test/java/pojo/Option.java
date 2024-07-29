package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Option{
    @JsonProperty("OptionName")
    public String optionName;
    @JsonProperty("OptionValue") 
    public String optionValue;
    @JsonProperty("Count") 
    public int count;
    @JsonProperty("Selected") 
    public boolean selected;
}
