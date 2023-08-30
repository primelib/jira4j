package io.github.primelib.jira4j.restv2.model;

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
 * UpdateIssueSecuritySchemeRequestBean
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
@JsonTypeName("UpdateIssueSecuritySchemeRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueSecuritySchemeRequestBean {

    /**
     * The description of the security scheme scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the security scheme scheme. Must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link UpdateIssueSecuritySchemeRequestBean}.
     *
     * @param spec the specification to process
     */
    public UpdateIssueSecuritySchemeRequestBean(Consumer<UpdateIssueSecuritySchemeRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueSecuritySchemeRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIssueSecuritySchemeRequestBean(Consumer)} instead.
     * @param description The description of the security scheme scheme.
     * @param name The name of the security scheme scheme. Must be unique.
     */
    @ApiStatus.Internal
    public UpdateIssueSecuritySchemeRequestBean(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
