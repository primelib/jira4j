package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * AssociateFieldConfigurationsWithIssueTypesRequest
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
    "mappings"
})
@JsonTypeName("AssociateFieldConfigurationsWithIssueTypesRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateFieldConfigurationsWithIssueTypesRequest {

    /**
     * Field configuration to issue type mappings.
     */
    @JsonProperty("mappings")
    protected Set<FieldConfigurationToIssueTypeMapping> mappings;

    /**
     * Constructs a validated instance of {@link AssociateFieldConfigurationsWithIssueTypesRequest}.
     *
     * @param spec the specification to process
     */
    public AssociateFieldConfigurationsWithIssueTypesRequest(Consumer<AssociateFieldConfigurationsWithIssueTypesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssociateFieldConfigurationsWithIssueTypesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssociateFieldConfigurationsWithIssueTypesRequest(Consumer)} instead.
     * @param mappings Field configuration to issue type mappings.
     */
    @ApiStatus.Internal
    public AssociateFieldConfigurationsWithIssueTypesRequest(Set<FieldConfigurationToIssueTypeMapping> mappings) {
        this.mappings = mappings;
    }

}
