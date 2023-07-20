package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleListWrapperApplicationRole
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "callback",
    "items",
    "max-results",
    "pagingCallback",
    "size"
})
@JsonTypeName("SimpleListWrapperApplicationRole")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleListWrapperApplicationRole {

    /**
     * Constructs a validated implementation of {@link SimpleListWrapperApplicationRole}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SimpleListWrapperApplicationRole(Consumer<SimpleListWrapperApplicationRole> spec) {
        spec.accept(this);
    }

    @JsonProperty("callback")
    protected Object callback;

    @JsonProperty("items")
    protected List<ApplicationRole> items;

    @JsonProperty("max-results")
    protected Integer maxResults;

    @JsonProperty("pagingCallback")
    protected Object pagingCallback;

    @JsonProperty("size")
    protected Integer size;


}
