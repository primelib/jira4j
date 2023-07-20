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
 * IdBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("IdBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IdBean {

    /**
     * Constructs a validated implementation of {@link IdBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IdBean(Consumer<IdBean> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the permission scheme to associate with the project. Use the [Get all permission schemes](#api-rest-api-2-permissionscheme-get) resource to get a list of permission scheme IDs.
     */
    @JsonProperty("id")
    protected Long id;


}
