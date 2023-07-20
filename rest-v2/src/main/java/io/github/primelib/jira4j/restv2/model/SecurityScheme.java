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
 * SecurityScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultSecurityLevelId",
    "description",
    "id",
    "levels",
    "name",
    "self"
})
@JsonTypeName("SecurityScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecurityScheme {

    /**
     * Constructs a validated implementation of {@link SecurityScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecurityScheme(Consumer<SecurityScheme> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default security level.
     */
    @JsonProperty("defaultSecurityLevelId")
    protected Long defaultSecurityLevelId;

    /**
     * The description of the issue security scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue security scheme.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("levels")
    protected List<SecurityLevel> levels;

    /**
     * The name of the issue security scheme.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the issue security scheme.
     */
    @JsonProperty("self")
    protected String self;


}
