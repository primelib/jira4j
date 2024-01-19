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
 * DefaultLevelValue
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
    "defaultLevelId",
    "issueSecuritySchemeId"
})
@JsonTypeName("DefaultLevelValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultLevelValue {

    /**
     * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
     */
    @JsonProperty("defaultLevelId")
    protected String defaultLevelId;

    /**
     * The ID of the issue security scheme to set default level for.
     */
    @JsonProperty("issueSecuritySchemeId")
    protected String issueSecuritySchemeId;

    /**
     * Constructs a validated instance of {@link DefaultLevelValue}.
     *
     * @param spec the specification to process
     */
    public DefaultLevelValue(Consumer<DefaultLevelValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DefaultLevelValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DefaultLevelValue(Consumer)} instead.
     * @param defaultLevelId The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
     * @param issueSecuritySchemeId The ID of the issue security scheme to set default level for.
     */
    @ApiStatus.Internal
    public DefaultLevelValue(String defaultLevelId, String issueSecuritySchemeId) {
        this.defaultLevelId = defaultLevelId;
        this.issueSecuritySchemeId = issueSecuritySchemeId;
    }

}
