package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateUiModificationDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contexts",
    "data",
    "description",
    "name"
})
@JsonTypeName("CreateUiModificationDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUiModificationDetails {

    /**
     * Constructs a validated implementation of {@link CreateUiModificationDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUiModificationDetails(Consumer<CreateUiModificationDetails> spec) {
        spec.accept(this);
    }

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
     * The name of the UI modification. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
