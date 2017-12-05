
package us.kbase.jgigatewayeap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: StageInput</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "files"
})
public class StageInput {

    @JsonProperty("files")
    private List<FileRequest> files;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("files")
    public List<FileRequest> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<FileRequest> files) {
        this.files = files;
    }

    public StageInput withFiles(List<FileRequest> files) {
        this.files = files;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((("StageInput"+" [files=")+ files)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
