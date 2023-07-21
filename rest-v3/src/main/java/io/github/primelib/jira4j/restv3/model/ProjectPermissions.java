package io.github.primelib.jira4j.restv3.model;

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
 * ProjectPermissions
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
    "canEdit"
})
@JsonTypeName("ProjectPermissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectPermissions {

    /**
     * Whether the logged user can edit the project.
     */
    @JsonProperty("canEdit")
    protected Boolean canEdit;

    /**
     * Constructs a validated instance of {@link ProjectPermissions}.
     *
     * @param spec the specification to process
     */
    public ProjectPermissions(Consumer<ProjectPermissions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectPermissions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectPermissions(Consumer)} instead.
     * @param canEdit Whether the logged user can edit the project.
     */
    @ApiStatus.Internal
    public ProjectPermissions(Boolean canEdit) {
        this.canEdit = canEdit;
    }

}
