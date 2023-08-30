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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UiModificationDetails
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
    "contexts",
    "data",
    "description",
    "id",
    "name",
    "self"
})
@JsonTypeName("UiModificationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UiModificationDetails {

    /**
     * List of contexts of the UI modification. The maximum number of contexts is 1000.
     */
    @JsonProperty("contexts")
    protected List<UiModificationContextDetails> contexts;

    /**
     * The data of the UI modification. The maximum size of the data is 50000 characters.
     */
    @JsonProperty("data")
    protected String data;

    /**
     * The description of the UI modification. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the UI modification.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the UI modification. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the UI modification.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link UiModificationDetails}.
     *
     * @param spec the specification to process
     */
    public UiModificationDetails(Consumer<UiModificationDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UiModificationDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UiModificationDetails(Consumer)} instead.
     * @param contexts List of contexts of the UI modification. The maximum number of contexts is 1000.
     * @param data The data of the UI modification. The maximum size of the data is 50000 characters.
     * @param description The description of the UI modification. The maximum length is 255 characters.
     * @param id The ID of the UI modification.
     * @param name The name of the UI modification. The maximum length is 255 characters.
     * @param self The URL of the UI modification.
     */
    @ApiStatus.Internal
    public UiModificationDetails(List<UiModificationContextDetails> contexts, String data, String description, String id, String name, String self) {
        this.contexts = contexts;
        this.data = data;
        this.description = description;
        this.id = id;
        this.name = name;
        this.self = self;
    }

}
