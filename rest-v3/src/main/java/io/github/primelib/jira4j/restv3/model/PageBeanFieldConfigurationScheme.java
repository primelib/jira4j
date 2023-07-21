package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageBeanFieldConfigurationScheme
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "isLast",
    "maxResults",
    "nextPage",
    "self",
    "startAt",
    "total",
    "values"
})
@JsonTypeName("PageBeanFieldConfigurationScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageBeanFieldConfigurationScheme {

    /**
     * Whether this is the last page.
     */
    @JsonProperty("isLast")
    protected Boolean isLast;

    /**
     * The maximum number of items that could be returned.
     */
    @JsonProperty("maxResults")
    protected Integer maxResults;

    /**
     * If there is another page of results, the URL of the next page.
     */
    @JsonProperty("nextPage")
    protected URI nextPage;

    /**
     * The URL of the page.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The index of the first item returned.
     */
    @JsonProperty("startAt")
    protected Long startAt;

    /**
     * The number of items returned.
     */
    @JsonProperty("total")
    protected Long total;

    /**
     * The list of items.
     */
    @JsonProperty("values")
    protected List<FieldConfigurationScheme> values;

    /**
     * Constructs a validated instance of {@link PageBeanFieldConfigurationScheme}.
     *
     * @param spec the specification to process
     */
    public PageBeanFieldConfigurationScheme(Consumer<PageBeanFieldConfigurationScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageBeanFieldConfigurationScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageBeanFieldConfigurationScheme(Consumer)} instead.
     * @param isLast Whether this is the last page.
     * @param maxResults The maximum number of items that could be returned.
     * @param nextPage If there is another page of results, the URL of the next page.
     * @param self The URL of the page.
     * @param startAt The index of the first item returned.
     * @param total The number of items returned.
     * @param values The list of items.
     */
    @ApiStatus.Internal
    public PageBeanFieldConfigurationScheme(Boolean isLast, Integer maxResults, URI nextPage, URI self, Long startAt, Long total, List<FieldConfigurationScheme> values) {
        this.isLast = isLast;
        this.maxResults = maxResults;
        this.nextPage = nextPage;
        this.self = self;
        this.startAt = startAt;
        this.total = total;
        this.values = values;
    }

}
