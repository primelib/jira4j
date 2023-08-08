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
 * ResolutionJsonBean
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

    /**
     * Constructs a validated instance of {@link ResolutionJsonBean}.
     *
     * @param spec the specification to process
     */
    public ResolutionJsonBean(Consumer<ResolutionJsonBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResolutionJsonBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResolutionJsonBean(Consumer)} instead.
     * @param _default _default
     * @param description description
     * @param iconUrl iconUrl
     * @param id id
     * @param name name
     * @param self self
     */
    @ApiStatus.Internal
    public ResolutionJsonBean(Boolean _default, String description, String iconUrl, String id, String name, String self) {
        this._default = _default;
        this.description = description;
        this.iconUrl = iconUrl;
        this.id = id;
        this.name = name;
        this.self = self;
    }

}
