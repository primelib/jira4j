package io.github.primelib.jira4j.restv3.model;

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OldToNewSecurityLevelMappingsBean
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
    "newLevelId",
    "oldLevelId"
})
@JsonTypeName("OldToNewSecurityLevelMappingsBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OldToNewSecurityLevelMappingsBean {

    /**
     * The new issue security level ID. Providing null will clear the assigned old level from issues.
     */
    @JsonProperty("newLevelId")
    protected String newLevelId;

    /**
     * The old issue security level ID. Providing null will remap all issues without any assigned levels.
     */
    @JsonProperty("oldLevelId")
    protected String oldLevelId;

    /**
     * Constructs a validated instance of {@link OldToNewSecurityLevelMappingsBean}.
     *
     * @param spec the specification to process
     */
    public OldToNewSecurityLevelMappingsBean(Consumer<OldToNewSecurityLevelMappingsBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OldToNewSecurityLevelMappingsBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OldToNewSecurityLevelMappingsBean(Consumer)} instead.
     * @param newLevelId The new issue security level ID. Providing null will clear the assigned old level from issues.
     * @param oldLevelId The old issue security level ID. Providing null will remap all issues without any assigned levels.
     */
    @ApiStatus.Internal
    public OldToNewSecurityLevelMappingsBean(String newLevelId, String oldLevelId) {
        this.newLevelId = newLevelId;
        this.oldLevelId = oldLevelId;
    }

}
