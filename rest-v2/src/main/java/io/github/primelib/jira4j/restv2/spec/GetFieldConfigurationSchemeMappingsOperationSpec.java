package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Configuration;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
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
 * GetFieldConfigurationSchemeMappingsSpec
 * <p>
 * Specification for the GetFieldConfigurationSchemeMappings operation.
 * <p>
 * Get field configuration issue type items
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFieldConfigurationSchemeMappingsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: {@code fieldConfigurationSchemeId=10000&amp;fieldConfigurationSchemeId=10001}.
     */
    @Nullable 
    private Set<Long> fieldConfigurationSchemeId;

    /**
     * Constructs a validated instance of {@link GetFieldConfigurationSchemeMappingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetFieldConfigurationSchemeMappingsOperationSpec(Consumer<GetFieldConfigurationSchemeMappingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetFieldConfigurationSchemeMappingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param fieldConfigurationSchemeId The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: {@code fieldConfigurationSchemeId=10000&amp;fieldConfigurationSchemeId=10001}.
     */
    @ApiStatus.Internal
    public GetFieldConfigurationSchemeMappingsOperationSpec(Long startAt, Integer maxResults, Set<Long> fieldConfigurationSchemeId) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
