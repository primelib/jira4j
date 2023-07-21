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
 * UpdateIssueSecurityLevelDetails
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
    "name"
})
@JsonTypeName("UpdateIssueSecurityLevelDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueSecurityLevelDetails {

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

    /**
     * Constructs a validated instance of {@link UpdateIssueSecurityLevelDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateIssueSecurityLevelDetails(Consumer<UpdateIssueSecurityLevelDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueSecurityLevelDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIssueSecurityLevelDetails(Consumer)} instead.
     * @param description The description of the issue security scheme level.
     * @param name The name of the issue security scheme level. Must be unique.
     */
    @ApiStatus.Internal
    public UpdateIssueSecurityLevelDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
