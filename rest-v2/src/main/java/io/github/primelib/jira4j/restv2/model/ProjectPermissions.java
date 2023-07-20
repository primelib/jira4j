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
 * ProjectPermissions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "canEdit"
})
@JsonTypeName("ProjectPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectPermissions {

    /**
     * Constructs a validated implementation of {@link ProjectPermissions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectPermissions(Consumer<ProjectPermissions> spec) {
        spec.accept(this);
    }

    /**
     * Whether the logged user can edit the project.
     */
    @JsonProperty("canEdit")
    protected Boolean canEdit;


}
