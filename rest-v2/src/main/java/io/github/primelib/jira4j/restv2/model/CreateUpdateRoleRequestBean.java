package io.github.primelib.jira4j.restv2.model;

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
 * CreateUpdateRoleRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name"
})
@JsonTypeName("CreateUpdateRoleRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUpdateRoleRequestBean {

    /**
     * Constructs a validated implementation of {@link CreateUpdateRoleRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUpdateRoleRequestBean(Consumer<CreateUpdateRoleRequestBean> spec) {
        spec.accept(this);
    }

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


}
