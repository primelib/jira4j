package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Version;
import io.github.primelib.jira4j.restv3.model.VersionRelatedWork;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateRelatedWorkSpec
 * <p>
 * Specification for the CreateRelatedWork operation.
 * <p>
 * Create related work
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRelatedWorkOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private VersionRelatedWork versionRelatedWork;

    /**
     * Constructs a validated instance of {@link CreateRelatedWorkOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateRelatedWorkOperationSpec(Consumer<CreateRelatedWorkOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateRelatedWorkOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   
     * @param versionRelatedWork   
     */
    @ApiStatus.Internal
    public CreateRelatedWorkOperationSpec(String id, VersionRelatedWork versionRelatedWork) {
        this.id = id;
        this.versionRelatedWork = versionRelatedWork;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(versionRelatedWork, "versionRelatedWork is a required parameter!");
    }
}
