package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Jobs{
    @JsonProperty("Job")
    public ArrayList<Job> job;
}
