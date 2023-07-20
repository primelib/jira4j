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
 * IssueLinkTypes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueLinkTypes"
})
@JsonTypeName("IssueLinkTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkTypes {

    /**
     * Constructs a validated implementation of {@link IssueLinkTypes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueLinkTypes(Consumer<IssueLinkTypes> spec) {
        spec.accept(this);
    }

    /**
     * The issue link type bean.
     */
    @JsonProperty("issueLinkTypes")
    protected List<IssueLinkType> issueLinkTypes;


}
