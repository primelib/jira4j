package io.github.primelib.jira4j.restv3.model;

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
 * VersionUsageInCustomField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "customFieldId",
    "fieldName",
    "issueCountWithVersionInCustomField"
})
@JsonTypeName("VersionUsageInCustomField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionUsageInCustomField {

    /**
     * Constructs a validated implementation of {@link VersionUsageInCustomField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public VersionUsageInCustomField(Consumer<VersionUsageInCustomField> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the custom field.
     */
    @JsonProperty("customFieldId")
    protected Long customFieldId;

    /**
     * The name of the custom field.
     */
    @JsonProperty("fieldName")
    protected String fieldName;

    /**
     * Count of the issues where the custom field contains the version.
     */
    @JsonProperty("issueCountWithVersionInCustomField")
    protected Long issueCountWithVersionInCustomField;


}
