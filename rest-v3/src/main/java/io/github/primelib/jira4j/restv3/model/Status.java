package io.github.primelib.jira4j.restv3.model;

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
 * Status
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "icon",
    "resolved"
})
@JsonTypeName("Status")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Status extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Status}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Status(Consumer<Status> spec) {
        spec.accept(this);
    }

    @JsonProperty("icon")
    protected StatusIcon icon;

    /**
     * Whether the item is resolved. If set to "true", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
     */
    @JsonProperty("resolved")
    protected Boolean resolved;


}
