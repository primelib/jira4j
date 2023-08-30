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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecurityLevel
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

    /**
     * Constructs a validated instance of {@link SecurityLevel}.
     *
     * @param spec the specification to process
     */
    public SecurityLevel(Consumer<SecurityLevel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecurityLevel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecurityLevel(Consumer)} instead.
     * @param description The description of the issue level security item.
     * @param id The ID of the issue level security item.
     * @param isDefault Whether the issue level security item is the default.
     * @param issueSecuritySchemeId The ID of the issue level security scheme.
     * @param name The name of the issue level security item.
     * @param self The URL of the issue level security item.
     */
    @ApiStatus.Internal
    public SecurityLevel(String description, String id, Boolean isDefault, String issueSecuritySchemeId, String name, String self) {
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.issueSecuritySchemeId = issueSecuritySchemeId;
        this.name = name;
        this.self = self;
    }

}
