package io.github.primelib.jira4j.restv2.model;

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
 * VersionUsageInCustomField
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
    "customFieldId",
    "fieldName",
    "issueCountWithVersionInCustomField"
})
@JsonTypeName("VersionUsageInCustomField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionUsageInCustomField {

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

    /**
     * Constructs a validated instance of {@link VersionUsageInCustomField}.
     *
     * @param spec the specification to process
     */
    public VersionUsageInCustomField(Consumer<VersionUsageInCustomField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionUsageInCustomField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionUsageInCustomField(Consumer)} instead.
     * @param customFieldId The ID of the custom field.
     * @param fieldName The name of the custom field.
     * @param issueCountWithVersionInCustomField Count of the issues where the custom field contains the version.
     */
    @ApiStatus.Internal
    public VersionUsageInCustomField(Long customFieldId, String fieldName, Long issueCountWithVersionInCustomField) {
        this.customFieldId = customFieldId;
        this.fieldName = fieldName;
        this.issueCountWithVersionInCustomField = issueCountWithVersionInCustomField;
    }

}
