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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssociateSecuritySchemeWithProjectDetails
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
    "oldToNewSecurityLevelMappings",
    "projectId",
    "schemeId"
})
@JsonTypeName("AssociateSecuritySchemeWithProjectDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateSecuritySchemeWithProjectDetails {

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

    /**
     * Constructs a validated instance of {@link AssociateSecuritySchemeWithProjectDetails}.
     *
     * @param spec the specification to process
     */
    public AssociateSecuritySchemeWithProjectDetails(Consumer<AssociateSecuritySchemeWithProjectDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssociateSecuritySchemeWithProjectDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssociateSecuritySchemeWithProjectDetails(Consumer)} instead.
     * @param oldToNewSecurityLevelMappings The list of scheme levels which should be remapped to new levels of the issue security scheme.
     * @param projectId The ID of the project.
     * @param schemeId The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
     */
    @ApiStatus.Internal
    public AssociateSecuritySchemeWithProjectDetails(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings, String projectId, String schemeId) {
        this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
        this.projectId = projectId;
        this.schemeId = schemeId;
    }

}
