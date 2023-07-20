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
 * SecurityLevel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "isDefault",
    "issueSecuritySchemeId",
    "name",
    "self"
})
@JsonTypeName("SecurityLevel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecurityLevel {

    /**
     * Constructs a validated implementation of {@link SecurityLevel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecurityLevel(Consumer<SecurityLevel> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue level security item.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue level security item.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the issue level security item is the default.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * The ID of the issue level security scheme.
     */
    @JsonProperty("issueSecuritySchemeId")
    protected String issueSecuritySchemeId;

    /**
     * The name of the issue level security item.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the issue level security item.
     */
    @JsonProperty("self")
    protected String self;


}
