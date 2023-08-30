package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkProjectPermissions
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
    "issues",
    "permissions",
    "projects"
})
@JsonTypeName("BulkProjectPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkProjectPermissions {

    /**
     * List of issue IDs.
     */
    @JsonProperty("issues")
    protected Set<Long> issues;

    /**
     * List of project permissions.
     */
    @JsonProperty("permissions")
    protected Set<String> permissions;

    /**
     * List of project IDs.
     */
    @JsonProperty("projects")
    protected Set<Long> projects;

    /**
     * Constructs a validated instance of {@link BulkProjectPermissions}.
     *
     * @param spec the specification to process
     */
    public BulkProjectPermissions(Consumer<BulkProjectPermissions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkProjectPermissions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkProjectPermissions(Consumer)} instead.
     * @param issues List of issue IDs.
     * @param permissions List of project permissions.
     * @param projects List of project IDs.
     */
    @ApiStatus.Internal
    public BulkProjectPermissions(Set<Long> issues, Set<String> permissions, Set<Long> projects) {
        this.issues = issues;
        this.permissions = permissions;
        this.projects = projects;
    }

}
