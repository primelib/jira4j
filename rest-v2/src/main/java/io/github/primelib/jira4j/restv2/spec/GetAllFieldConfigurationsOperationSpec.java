package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Configuration;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
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
 * GetAllFieldConfigurationsSpec
 * <p>
 * Specification for the GetAllFieldConfigurations operation.
 * <p>
 * Get all field configurations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * If *true* returns default field configurations only.
     */
    @Nullable 
    private Boolean isDefault;

    /**
     * The query string used to match against field configuration names and descriptions.
     */
    @Nullable 
    private String query;

    /**
     * Constructs a validated instance of {@link GetAllFieldConfigurationsOperationSpec}.
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
     * Constructs a validated instance of {@link GetAllFieldConfigurationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}.
     * @param isDefault            If *true* returns default field configurations only.
     * @param query                The query string used to match against field configuration names and descriptions.
     */
    @ApiStatus.Internal
    public GetAllFieldConfigurationsOperationSpec(Long startAt, Integer maxResults, Set<Long> id, Boolean isDefault, String query) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.isDefault = isDefault;
        this.query = query;

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
