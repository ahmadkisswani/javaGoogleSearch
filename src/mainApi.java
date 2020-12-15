
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.Result;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"results",
"image_results",
"total",
"answers",
"ts"
})
public class mainApi {

@JsonProperty("results")
private List<Result> results = null;
@JsonProperty("image_results")
private List<Object> imageResults = null;
@JsonProperty("total")
private Integer total;
@JsonProperty("answers")
private List<String> answers = null;
@JsonProperty("ts")
private Double ts;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("results")
public List<Result> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<Result> results) {
this.results = results;
}

@JsonProperty("image_results")
public List<Object> getImageResults() {
return imageResults;
}

@JsonProperty("image_results")
public void setImageResults(List<Object> imageResults) {
this.imageResults = imageResults;
}

@JsonProperty("total")
public Integer getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Integer total) {
this.total = total;
}

@JsonProperty("answers")
public List<String> getAnswers() {
return answers;
}

@JsonProperty("answers")
public void setAnswers(List<String> answers) {
this.answers = answers;
}

@JsonProperty("ts")
public Double getTs() {
return ts;
}

@JsonProperty("ts")
public void setTs(Double ts) {
this.ts = ts;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}