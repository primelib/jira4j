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
 * FieldConfigurationSchemeProjects
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
    "fieldConfigurationScheme",
    "projectIds"
})
@JsonTypeName("FieldConfigurationSchemeProjects")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldConfigurationSchemeProjects {

    @JsonProperty("fieldConfigurationScheme")
    protected FieldConfigurationScheme fieldConfigurationScheme;

    /**
     * The IDs of projects using the field configuration scheme.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds;

    /**
     * Constructs a validated instance of {@link FieldConfigurationSchemeProjects}.
     *
     * @param spec the specification to process
     */
    public FieldConfigurationSchemeProjects(Consumer<FieldConfigurationSchemeProjects> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldConfigurationSchemeProjects}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldConfigurationSchemeProjects(Consumer)} instead.
     * @param fieldConfigurationScheme var.name
     * @param projectIds The IDs of projects using the field configuration scheme.
     */
    @ApiStatus.Internal
    public FieldConfigurationSchemeProjects(FieldConfigurationScheme fieldConfigurationScheme, List<String> projectIds) {
        this.fieldConfigurationScheme = fieldConfigurationScheme;
        this.projectIds = projectIds;
    }

}
