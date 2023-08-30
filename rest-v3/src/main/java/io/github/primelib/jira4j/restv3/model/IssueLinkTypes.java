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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueLinkTypes
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
    "issueLinkTypes"
})
@JsonTypeName("IssueLinkTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkTypes {

    /**
     * The issue link type bean.
     */
    @JsonProperty("issueLinkTypes")
    protected List<IssueLinkType> issueLinkTypes;

    /**
     * Constructs a validated instance of {@link IssueLinkTypes}.
     *
     * @param spec the specification to process
     */
    public IssueLinkTypes(Consumer<IssueLinkTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueLinkTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueLinkTypes(Consumer)} instead.
     * @param issueLinkTypes The issue link type bean.
     */
    @ApiStatus.Internal
    public IssueLinkTypes(List<IssueLinkType> issueLinkTypes) {
        this.issueLinkTypes = issueLinkTypes;
    }

}
