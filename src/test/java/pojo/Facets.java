package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Facets{
    @JsonProperty("Facet")
    public ArrayList<Facet> facet;
}
