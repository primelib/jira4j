package io.github.primelib.jira4j.restv2.model;

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
 * FieldConfigurationSchemeProjectAssociation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fieldConfigurationSchemeId",
    "projectId"
})
@JsonTypeName("FieldConfigurationSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationSchemeProjectAssociation {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationSchemeProjectAssociation(Consumer<FieldConfigurationSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.
     */
    @JsonProperty("fieldConfigurationSchemeId")
    protected String fieldConfigurationSchemeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;


}
