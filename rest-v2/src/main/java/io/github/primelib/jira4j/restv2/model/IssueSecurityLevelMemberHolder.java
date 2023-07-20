package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueSecurityLevelMemberHolder
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "parameter",
    "type",
    "value"
})
@JsonTypeName("IssueSecurityLevelMember_holder")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecurityLevelMemberHolder {

    /**
     * Constructs a validated implementation of {@link IssueSecurityLevelMemberHolder}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueSecurityLevelMemberHolder(Consumer<IssueSecurityLevelMemberHolder> spec) {
        spec.accept(this);
    }

    /**
     * Expand options that include additional permission holder details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.
     */
    @JsonProperty("parameter")
    protected String parameter;

    /**
     * The type of permission holder.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The identifier associated with the `type` value that defines the holder of the permission.
     */
    @JsonProperty("value")
    protected String value;


}
