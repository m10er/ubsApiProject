package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Question{
    @JsonProperty("QId") 
    public int qId;
    @JsonProperty("QuestionName") 
    public String questionName;
    @JsonProperty("Value") 
    public String value;
    @JsonProperty("ActualValueFromSolar") 
    public Object actualValueFromSolar;
    @JsonProperty("QuestionDescription") 
    public Object questionDescription;
    @JsonProperty("QuestionType") 
    public Object questionType;
    @JsonProperty("QuestionNumber")
    public Object questionNumber;
    @JsonProperty("VerityZone") 
    public Object verityZone;
    @JsonProperty("IsAutoComplete") 
    public boolean isAutoComplete;
    @JsonProperty("IsChildQuestion") 
    public boolean isChildQuestion;
    @JsonProperty("IsParentQuestion") 
    public boolean isParentQuestion;
    @JsonProperty("ParentQuestionId") 
    public int parentQuestionId;
    @JsonProperty("Options") 
    public Object options;
    @JsonProperty("AjaxLoad") 
    public boolean ajaxLoad;
    public Object selectedOptions;
    @JsonProperty("SelectedOptionsFromSavedSearch") 
    public Object selectedOptionsFromSavedSearch;
}
