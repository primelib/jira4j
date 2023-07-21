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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteAndReplaceVersionBean
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
    "customFieldReplacementList",
    "moveAffectedIssuesTo",
    "moveFixIssuesTo"
})
@JsonTypeName("DeleteAndReplaceVersionBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAndReplaceVersionBean {

    /**
     * An array of custom field IDs ({@code customFieldId}) and version IDs ({@code moveTo}) to update when the fields contain the deleted version.
     */
    @JsonProperty("customFieldReplacementList")
    protected List<CustomFieldReplacement> customFieldReplacementList;

    /**
     * The ID of the version to update {@code affectedVersion} to when the field contains the deleted version.
     */
    @JsonProperty("moveAffectedIssuesTo")
    protected Long moveAffectedIssuesTo;

    /**
     * The ID of the version to update {@code fixVersion} to when the field contains the deleted version.
     */
    @JsonProperty("moveFixIssuesTo")
    protected Long moveFixIssuesTo;

    /**
     * Constructs a validated instance of {@link DeleteAndReplaceVersionBean}.
     *
     * @param spec the specification to process
     */
    public DeleteAndReplaceVersionBean(Consumer<DeleteAndReplaceVersionBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DeleteAndReplaceVersionBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DeleteAndReplaceVersionBean(Consumer)} instead.
     * @param customFieldReplacementList An array of custom field IDs ({@code customFieldId}) and version IDs ({@code moveTo}) to update when the fields contain the deleted version.
     * @param moveAffectedIssuesTo The ID of the version to update {@code affectedVersion} to when the field contains the deleted version.
     * @param moveFixIssuesTo The ID of the version to update {@code fixVersion} to when the field contains the deleted version.
     */
    @ApiStatus.Internal
    public DeleteAndReplaceVersionBean(List<CustomFieldReplacement> customFieldReplacementList, Long moveAffectedIssuesTo, Long moveFixIssuesTo) {
        this.customFieldReplacementList = customFieldReplacementList;
        this.moveAffectedIssuesTo = moveAffectedIssuesTo;
        this.moveFixIssuesTo = moveFixIssuesTo;
    }

}
