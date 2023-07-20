package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import io.github.primelib.jira4j.restv3.model.FieldConfigurationScheme;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: `fieldConfigurationSchemeId=10000&amp;fieldConfigurationSchemeId=10001`.
     */
    @Nullable 
    private Set<Long> fieldConfigurationSchemeId;

    /**
     * Constructs a validated implementation of {@link GetFieldConfigurationSchemeMappingsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
