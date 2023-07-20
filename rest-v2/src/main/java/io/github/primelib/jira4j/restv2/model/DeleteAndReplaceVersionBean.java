package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteAndReplaceVersionBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "customFieldReplacementList",
    "moveAffectedIssuesTo",
    "moveFixIssuesTo"
})
@JsonTypeName("DeleteAndReplaceVersionBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAndReplaceVersionBean {

    /**
     * Constructs a validated implementation of {@link DeleteAndReplaceVersionBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAndReplaceVersionBean(Consumer<DeleteAndReplaceVersionBean> spec) {
        spec.accept(this);
    }

    /**
     * An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.
     */
    @JsonProperty("customFieldReplacementList")
    protected List<CustomFieldReplacement> customFieldReplacementList;

    /**
     * The ID of the version to update `affectedVersion` to when the field contains the deleted version.
     */
    @JsonProperty("moveAffectedIssuesTo")
    protected Long moveAffectedIssuesTo;

    /**
     * The ID of the version to update `fixVersion` to when the field contains the deleted version.
     */
    @JsonProperty("moveFixIssuesTo")
    protected Long moveFixIssuesTo;


}
