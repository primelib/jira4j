package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationToIssueTypeMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fieldConfigurationId",
    "issueTypeId"
})
@JsonTypeName("FieldConfigurationToIssueTypeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationToIssueTypeMapping {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationToIssueTypeMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationToIssueTypeMapping(Consumer<FieldConfigurationToIssueTypeMapping> spec) {
        spec.accept(this);
    }

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


}
