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
 * UpdateIssueSecurityLevelDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "name"
})
@JsonTypeName("UpdateIssueSecurityLevelDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueSecurityLevelDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link UpdateIssueSecurityLevelDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueSecurityLevelDetails(Consumer<UpdateIssueSecurityLevelDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue security scheme level.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the issue security scheme level. Must be unique.
     */
    @JsonProperty("name")
    protected String name;


}
