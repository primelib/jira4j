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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIssueSecuritySchemeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "levels",
    "name"
})
@JsonTypeName("CreateIssueSecuritySchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIssueSecuritySchemeDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link CreateIssueSecuritySchemeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIssueSecuritySchemeDetails(Consumer<CreateIssueSecuritySchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue security scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The list of scheme levels which should be added to the security scheme.
     */
    @JsonProperty("levels")
    protected List<SecuritySchemeLevelBean> levels;

    /**
     * The name of the issue security scheme. Must be unique (case-insensitive).
     */
    @JsonProperty("name")
    protected String name;


}
