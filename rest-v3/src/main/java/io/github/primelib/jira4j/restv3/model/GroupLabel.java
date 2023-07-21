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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupLabel
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
    "text",
    "title",
    "type"
})
@JsonTypeName("GroupLabel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupLabel {

    /**
     * The group label name.
     */
    @JsonProperty("text")
    protected String text;

    /**
     * The title of the group label.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The type of the group label.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link GroupLabel}.
     *
     * @param spec the specification to process
     */
    public GroupLabel(Consumer<GroupLabel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GroupLabel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GroupLabel(Consumer)} instead.
     * @param text The group label name.
     * @param title The title of the group label.
     * @param type The type of the group label.
     */
    @ApiStatus.Internal
    public GroupLabel(String text, String title, TypeEnum type) {
        this.text = text;
        this.title = title;
        this.type = type;
    }

    /**
     * The type of the group label.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ADMIN("ADMIN"),
        SINGLE("SINGLE"),
        MULTIPLE("MULTIPLE");

        private final String value;
    }

}
