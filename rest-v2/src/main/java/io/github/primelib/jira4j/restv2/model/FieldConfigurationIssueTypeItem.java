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
 * FieldConfigurationIssueTypeItem
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
    "fieldConfigurationSchemeId",
    "issueTypeId"
})
@JsonTypeName("FieldConfigurationIssueTypeItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationIssueTypeItem {

    /**
     * The ID of the field configuration.
     */
    @JsonProperty("fieldConfigurationId")
    protected String fieldConfigurationId;

    /**
     * The ID of the field configuration scheme.
     */
    @JsonProperty("fieldConfigurationSchemeId")
    protected String fieldConfigurationSchemeId;

    /**
     * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * Constructs a validated instance of {@link FieldConfigurationIssueTypeItem}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationIssueTypeItem(Consumer<FieldConfigurationIssueTypeItem> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationIssueTypeItem}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationIssueTypeItem(Consumer)} instead.
     * @param fieldConfigurationId The ID of the field configuration.
     * @param fieldConfigurationSchemeId The ID of the field configuration scheme.
     * @param issueTypeId The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.
     */
    @ApiStatus.Internal
    public FieldConfigurationIssueTypeItem(String fieldConfigurationId, String fieldConfigurationSchemeId, String issueTypeId) {
        this.fieldConfigurationId = fieldConfigurationId;
        this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
        this.issueTypeId = issueTypeId;
    }

}
