package io.github.primelib.jira4j.restv2.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkProjectPermissions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issues",
    "permissions",
    "projects"
})
@JsonTypeName("BulkProjectPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkProjectPermissions {

    /**
     * Constructs a validated implementation of {@link BulkProjectPermissions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkProjectPermissions(Consumer<BulkProjectPermissions> spec) {
        spec.accept(this);
    }

    /**
     * List of issue IDs.
     */
    @JsonProperty("issues")
    protected Set<Long> issues;

    /**
     * List of project permissions.
     */
    @JsonProperty("permissions")
    protected Set<String> permissions = new LinkedHashSet<>();

    /**
     * List of project IDs.
     */
    @JsonProperty("projects")
    protected Set<Long> projects;


}
