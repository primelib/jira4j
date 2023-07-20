package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DefaultLevelValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "defaultLevelId",
    "issueSecuritySchemeId"
})
@JsonTypeName("DefaultLevelValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultLevelValue extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link DefaultLevelValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DefaultLevelValue(Consumer<DefaultLevelValue> spec) {
        spec.accept(this);
    }

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


}
