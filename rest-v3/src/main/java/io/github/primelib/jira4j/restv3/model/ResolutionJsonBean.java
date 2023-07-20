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
 * ResolutionJsonBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "default",
    "description",
    "iconUrl",
    "id",
    "name",
    "self"
})
@JsonTypeName("ResolutionJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolutionJsonBean {

    /**
     * Constructs a validated implementation of {@link ResolutionJsonBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResolutionJsonBean(Consumer<ResolutionJsonBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("default")
    protected Boolean _default;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("iconUrl")
    protected String iconUrl;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("self")
    protected String self;


}
