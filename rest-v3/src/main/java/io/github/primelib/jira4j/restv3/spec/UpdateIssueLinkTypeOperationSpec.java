package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueLink;
import io.github.primelib.jira4j.restv3.model.IssueLinkType;
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
 * UpdateIssueLinkTypeSpec
 * <p>
 * Specification for the UpdateIssueLinkType operation.
 * <p>
 * Update issue link type
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueLinkTypeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue link type.
     */
    @NotNull 
    private String issueLinkTypeId;

    /**
     */
    @NotNull 
    private IssueLinkType issueLinkType;

    /**
     * Constructs a validated instance of {@link UpdateIssueLinkTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueLinkTypeOperationSpec(Consumer<UpdateIssueLinkTypeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueLinkTypeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueLinkTypeId      The ID of the issue link type.
     * @param issueLinkType        
     */
    @ApiStatus.Internal
    public UpdateIssueLinkTypeOperationSpec(String issueLinkTypeId, IssueLinkType issueLinkType) {
        this.issueLinkTypeId = issueLinkTypeId;
        this.issueLinkType = issueLinkType;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueLinkTypeId, "issueLinkTypeId is a required parameter!");
        Objects.requireNonNull(issueLinkType, "issueLinkType is a required parameter!");
    }
}
