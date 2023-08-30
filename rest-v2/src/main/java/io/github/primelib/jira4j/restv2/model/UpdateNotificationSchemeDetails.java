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
 * UpdateNotificationSchemeDetails
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
@JsonTypeName("UpdateNotificationSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateNotificationSchemeDetails {

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

    /**
     * Constructs a validated instance of {@link UpdateNotificationSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateNotificationSchemeDetails(Consumer<UpdateNotificationSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateNotificationSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateNotificationSchemeDetails(Consumer)} instead.
     * @param description The description of the notification scheme.
     * @param name The name of the notification scheme. Must be unique.
     */
    @ApiStatus.Internal
    public UpdateNotificationSchemeDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
