package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Attachment;
import java.util.Set;
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
 * ExpandAttachmentForMachinesSpec
 * <p>
 * Specification for the ExpandAttachmentForMachines operation.
 * <p>
 * Get contents metadata for an expanded attachment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExpandAttachmentForMachinesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment.
     */
    @NotNull 
    private String id;

    /**
     * Constructs a validated instance of {@link ExpandAttachmentForMachinesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExpandAttachmentForMachinesOperationSpec(Consumer<ExpandAttachmentForMachinesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ExpandAttachmentForMachinesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the attachment.
     */
    @ApiStatus.Internal
    public ExpandAttachmentForMachinesOperationSpec(String id) {
        this.id = id;

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
    }
}
