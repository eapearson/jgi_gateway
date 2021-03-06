
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
import us.kbase.common.service.UObject;


/**
 * <p>Original spec-file type: SearchInput</p>
 * <pre>
 * search searches the JGI service for matches against the
 * query, which may be a string or an object mapping string->string
 * query - 
 * Other parameters
 * @optional filter 
 * @optional limit
 * @optional page
 * @optional include_private
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "query",
    "filter",
    "sort",
    "limit",
    "page",
    "include_private"
})
public class SearchInput {

    @JsonProperty("query")
    private Map<String, String> query;
    @JsonProperty("filter")
    private Map<String, UObject> filter;
    @JsonProperty("sort")
    private List<SortSpec> sort;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("page")
    private Long page;
    @JsonProperty("include_private")
    private Long includePrivate;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("query")
    public Map<String, String> getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Map<String, String> query) {
        this.query = query;
    }

    public SearchInput withQuery(Map<String, String> query) {
        this.query = query;
        return this;
    }

    @JsonProperty("filter")
    public Map<String, UObject> getFilter() {
        return filter;
    }

    @JsonProperty("filter")
    public void setFilter(Map<String, UObject> filter) {
        this.filter = filter;
    }

    public SearchInput withFilter(Map<String, UObject> filter) {
        this.filter = filter;
        return this;
    }

    @JsonProperty("sort")
    public List<SortSpec> getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(List<SortSpec> sort) {
        this.sort = sort;
    }

    public SearchInput withSort(List<SortSpec> sort) {
        this.sort = sort;
        return this;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public SearchInput withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("page")
    public Long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Long page) {
        this.page = page;
    }

    public SearchInput withPage(Long page) {
        this.page = page;
        return this;
    }

    @JsonProperty("include_private")
    public Long getIncludePrivate() {
        return includePrivate;
    }

    @JsonProperty("include_private")
    public void setIncludePrivate(Long includePrivate) {
        this.includePrivate = includePrivate;
    }

    public SearchInput withIncludePrivate(Long includePrivate) {
        this.includePrivate = includePrivate;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((("SearchInput"+" [query=")+ query)+", filter=")+ filter)+", sort=")+ sort)+", limit=")+ limit)+", page=")+ page)+", includePrivate=")+ includePrivate)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
