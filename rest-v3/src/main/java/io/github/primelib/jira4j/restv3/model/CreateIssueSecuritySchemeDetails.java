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
 * CreateIssueSecuritySchemeDetails
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
    "levels",
    "name"
})
@JsonTypeName("CreateIssueSecuritySchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIssueSecuritySchemeDetails {

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

    /**
     * Constructs a validated instance of {@link CreateIssueSecuritySchemeDetails}.
     *
     * @param spec the specification to process
     */
    public CreateIssueSecuritySchemeDetails(Consumer<CreateIssueSecuritySchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIssueSecuritySchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIssueSecuritySchemeDetails(Consumer)} instead.
     * @param description The description of the issue security scheme.
     * @param levels The list of scheme levels which should be added to the security scheme.
     * @param name The name of the issue security scheme. Must be unique (case-insensitive).
     */
    @ApiStatus.Internal
    public CreateIssueSecuritySchemeDetails(String description, List<SecuritySchemeLevelBean> levels, String name) {
        this.description = description;
        this.levels = levels;
        this.name = name;
    }

}
