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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueContextVariable
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
    "id",
    "key",
    "type"
})
@JsonTypeName("IssueContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueContextVariable {

    /**
     * The issue ID.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The issue key.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link IssueContextVariable}.
     *
     * @param spec the specification to process
     */
    public IssueContextVariable(Consumer<IssueContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueContextVariable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueContextVariable(Consumer)} instead.
     * @param id The issue ID.
     * @param key The issue key.
     * @param type Type of custom context variable.
     */
    @ApiStatus.Internal
    public IssueContextVariable(Long id, String key, String type) {
        this.id = id;
        this.key = key;
        this.type = type;
    }

}
