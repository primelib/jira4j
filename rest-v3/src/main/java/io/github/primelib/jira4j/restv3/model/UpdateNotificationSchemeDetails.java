package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateNotificationSchemeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "description",
    "name"
})
@JsonTypeName("UpdateNotificationSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateNotificationSchemeDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link UpdateNotificationSchemeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateNotificationSchemeDetails(Consumer<UpdateNotificationSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the notification scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the notification scheme. Must be unique.
     */
    @JsonProperty("name")
    protected String name;


}
