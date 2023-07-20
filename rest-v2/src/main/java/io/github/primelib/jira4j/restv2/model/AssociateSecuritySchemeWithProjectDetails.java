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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssociateSecuritySchemeWithProjectDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "oldToNewSecurityLevelMappings",
    "projectId",
    "schemeId"
})
@JsonTypeName("AssociateSecuritySchemeWithProjectDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateSecuritySchemeWithProjectDetails {

    /**
     * Constructs a validated implementation of {@link AssociateSecuritySchemeWithProjectDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociateSecuritySchemeWithProjectDetails(Consumer<AssociateSecuritySchemeWithProjectDetails> spec) {
        spec.accept(this);
    }

    /**
     * The list of scheme levels which should be remapped to new levels of the issue security scheme.
     */
    @JsonProperty("oldToNewSecurityLevelMappings")
    protected List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
     */
    @JsonProperty("schemeId")
    protected String schemeId;


}
