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
 * UpdateUiModificationDetails
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
    "name"
})
@JsonTypeName("UpdateUiModificationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUiModificationDetails {

    /**
     * List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
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
     * The name of the UI modification. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link UpdateUiModificationDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateUiModificationDetails(Consumer<UpdateUiModificationDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateUiModificationDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateUiModificationDetails(Consumer)} instead.
     * @param contexts List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
     * @param data The data of the UI modification. The maximum size of the data is 50000 characters.
     * @param description The description of the UI modification. The maximum length is 255 characters.
     * @param name The name of the UI modification. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public UpdateUiModificationDetails(List<UiModificationContextDetails> contexts, String data, String description, String name) {
        this.contexts = contexts;
        this.data = data;
        this.description = description;
        this.name = name;
    }

}
