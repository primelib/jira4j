package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.FieldConfiguration;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllFieldConfigurationsSpec
 * <p>
 * Specification for the GetAllFieldConfigurations operation.
 * <p>
 * Get all field configurations
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllFieldConfigurationsOperationSpec {
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
     * The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * If *true* returns default field configurations only.
     */
    @Nullable 
    private Boolean isDefault = false;

    /**
     * The query string used to match against field configuration names and descriptions.
     */
    @Nullable 
    private String query;

    /**
     * Constructs a validated implementation of {@link GetAllFieldConfigurationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllFieldConfigurationsOperationSpec(Consumer<GetAllFieldConfigurationsOperationSpec> spec) {
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
