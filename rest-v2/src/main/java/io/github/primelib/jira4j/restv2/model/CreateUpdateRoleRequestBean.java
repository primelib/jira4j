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
 * CreateUpdateRoleRequestBean
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
@JsonTypeName("CreateUpdateRoleRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUpdateRoleRequestBean {

    /**
     * A description of the project role. Required when fully updating a project role. Optional when creating or partially updating a project role.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the project role. Must be unique. Cannot begin or end with whitespace. The maximum length is 255 characters. Required when creating a project role. Optional when partially updating a project role.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link CreateUpdateRoleRequestBean}.
     *
     * @param spec the specification to process
     */
    public CreateUpdateRoleRequestBean(Consumer<CreateUpdateRoleRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateUpdateRoleRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateUpdateRoleRequestBean(Consumer)} instead.
     * @param description A description of the project role. Required when fully updating a project role. Optional when creating or partially updating a project role.
     * @param name The name of the project role. Must be unique. Cannot begin or end with whitespace. The maximum length is 255 characters. Required when creating a project role. Optional when partially updating a project role.
     */
    @ApiStatus.Internal
    public CreateUpdateRoleRequestBean(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
