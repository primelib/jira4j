package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationToIssueTypeMapping
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
    "fieldConfigurationId",
    "issueTypeId"
})
@JsonTypeName("FieldConfigurationToIssueTypeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationToIssueTypeMapping {

    /**
     * The ID of the field configuration.
     */
    @JsonProperty("fieldConfigurationId")
    protected String fieldConfigurationId;

    /**
     * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration. An issue type can be included only once in a request.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * Constructs a validated instance of {@link FieldConfigurationToIssueTypeMapping}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationToIssueTypeMapping(Consumer<FieldConfigurationToIssueTypeMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationToIssueTypeMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationToIssueTypeMapping(Consumer)} instead.
     * @param fieldConfigurationId The ID of the field configuration.
     * @param issueTypeId The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration. An issue type can be included only once in a request.
     */
    @ApiStatus.Internal
    public FieldConfigurationToIssueTypeMapping(String fieldConfigurationId, String issueTypeId) {
        this.fieldConfigurationId = fieldConfigurationId;
        this.issueTypeId = issueTypeId;
    }

}
