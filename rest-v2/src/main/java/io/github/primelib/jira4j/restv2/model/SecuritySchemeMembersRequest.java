package io.github.primelib.jira4j.restv2.model;

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeMembersRequest
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
    "members"
})
@JsonTypeName("SecuritySchemeMembersRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeMembersRequest {

    /**
     * The list of level members which should be added to the issue security scheme level.
     */
    @JsonProperty("members")
    protected List<SecuritySchemeLevelMemberBean> members;

    /**
     * Constructs a validated instance of {@link SecuritySchemeMembersRequest}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeMembersRequest(Consumer<SecuritySchemeMembersRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeMembersRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeMembersRequest(Consumer)} instead.
     * @param members The list of level members which should be added to the issue security scheme level.
     */
    @ApiStatus.Internal
    public SecuritySchemeMembersRequest(List<SecuritySchemeLevelMemberBean> members) {
        this.members = members;
    }

}
