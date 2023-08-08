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
 * SecurityScheme
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

    /**
     * Constructs a validated instance of {@link SecurityScheme}.
     *
     * @param spec the specification to process
     */
    public SecurityScheme(Consumer<SecurityScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecurityScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecurityScheme(Consumer)} instead.
     * @param defaultSecurityLevelId The ID of the default security level.
     * @param description The description of the issue security scheme.
     * @param id The ID of the issue security scheme.
     * @param levels levels
     * @param name The name of the issue security scheme.
     * @param self The URL of the issue security scheme.
     */
    @ApiStatus.Internal
    public SecurityScheme(Long defaultSecurityLevelId, String description, Long id, List<SecurityLevel> levels, String name, String self) {
        this.defaultSecurityLevelId = defaultSecurityLevelId;
        this.description = description;
        this.id = id;
        this.levels = levels;
        this.name = name;
        this.self = self;
    }

}
