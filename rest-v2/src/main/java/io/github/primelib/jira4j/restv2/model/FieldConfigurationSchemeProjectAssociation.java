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
 * FieldConfigurationSchemeProjectAssociation
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
    "fieldConfigurationSchemeId",
    "projectId"
})
@JsonTypeName("FieldConfigurationSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationSchemeProjectAssociation {

    /**
     * The ID of the field configuration scheme. If the field configuration scheme ID is {@code null}, the operation assigns the default field configuration scheme.
     */
    @JsonProperty("fieldConfigurationSchemeId")
    protected String fieldConfigurationSchemeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link FieldConfigurationSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationSchemeProjectAssociation(Consumer<FieldConfigurationSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationSchemeProjectAssociation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationSchemeProjectAssociation(Consumer)} instead.
     * @param fieldConfigurationSchemeId The ID of the field configuration scheme. If the field configuration scheme ID is {@code null}, the operation assigns the default field configuration scheme.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public FieldConfigurationSchemeProjectAssociation(String fieldConfigurationSchemeId, String projectId) {
        this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
        this.projectId = projectId;
    }

}
