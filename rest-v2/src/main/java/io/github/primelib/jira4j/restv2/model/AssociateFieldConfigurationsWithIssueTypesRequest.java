package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * AssociateFieldConfigurationsWithIssueTypesRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "mappings"
})
@JsonTypeName("AssociateFieldConfigurationsWithIssueTypesRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateFieldConfigurationsWithIssueTypesRequest {

    /**
     * Constructs a validated implementation of {@link AssociateFieldConfigurationsWithIssueTypesRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociateFieldConfigurationsWithIssueTypesRequest(Consumer<AssociateFieldConfigurationsWithIssueTypesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Field configuration to issue type mappings.
     */
    @JsonProperty("mappings")
    protected Set<FieldConfigurationToIssueTypeMapping> mappings = new LinkedHashSet<>();


}
