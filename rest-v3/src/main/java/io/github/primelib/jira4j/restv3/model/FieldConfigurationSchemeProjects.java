package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldConfigurationSchemeProjects
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fieldConfigurationScheme",
    "projectIds"
})
@JsonTypeName("FieldConfigurationSchemeProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationSchemeProjects {

    /**
     * Constructs a validated implementation of {@link FieldConfigurationSchemeProjects}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldConfigurationSchemeProjects(Consumer<FieldConfigurationSchemeProjects> spec) {
        spec.accept(this);
    }

    @JsonProperty("fieldConfigurationScheme")
    protected FieldConfigurationScheme fieldConfigurationScheme;

    /**
     * The IDs of projects using the field configuration scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds = new ArrayList<>();


}
