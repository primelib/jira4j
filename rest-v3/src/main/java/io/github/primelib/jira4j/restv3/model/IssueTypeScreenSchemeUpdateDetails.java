package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeScreenSchemeUpdateDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name"
})
@JsonTypeName("IssueTypeScreenSchemeUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeUpdateDetails {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeUpdateDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeUpdateDetails(Consumer<IssueTypeScreenSchemeUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue type screen scheme. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
