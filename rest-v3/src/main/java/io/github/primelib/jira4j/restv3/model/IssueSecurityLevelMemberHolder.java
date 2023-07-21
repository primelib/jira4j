package io.github.primelib.jira4j.restv3.model;

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueSecurityLevelMemberHolder
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
    "expand",
    "parameter",
    "type",
    "value"
})
@JsonTypeName("IssueSecurityLevelMember_holder")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecurityLevelMemberHolder {

    /**
     * Expand options that include additional permission holder details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * As a group's name can change, use of {@code value} is recommended. The identifier associated withthe {@code type} value that defines the holder of the permission.
     */
    @JsonProperty("parameter")
    protected String parameter;

    /**
     * The type of permission holder.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The identifier associated with the {@code type} value that defines the holder of the permission.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link IssueSecurityLevelMemberHolder}.
     *
     * @param spec the specification to process
     */
    public IssueSecurityLevelMemberHolder(Consumer<IssueSecurityLevelMemberHolder> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueSecurityLevelMemberHolder}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueSecurityLevelMemberHolder(Consumer)} instead.
     * @param expand Expand options that include additional permission holder details in the response.
     * @param parameter As a group's name can change, use of {@code value} is recommended. The identifier associated withthe {@code type} value that defines the holder of the permission.
     * @param type The type of permission holder.
     * @param value The identifier associated with the {@code type} value that defines the holder of the permission.
     */
    @ApiStatus.Internal
    public IssueSecurityLevelMemberHolder(String expand, String parameter, String type, String value) {
        this.expand = expand;
        this.parameter = parameter;
        this.type = type;
        this.value = value;
    }

}
