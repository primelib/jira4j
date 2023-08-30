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
 * ProjectIdentifierBean
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
    "id",
    "key"
})
@JsonTypeName("ProjectIdentifierBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIdentifierBean {

    /**
     * The ID of the project.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The key of the project.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Constructs a validated instance of {@link ProjectIdentifierBean}.
     *
     * @param spec the specification to process
     */
    public ProjectIdentifierBean(Consumer<ProjectIdentifierBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectIdentifierBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectIdentifierBean(Consumer)} instead.
     * @param id The ID of the project.
     * @param key The key of the project.
     */
    @ApiStatus.Internal
    public ProjectIdentifierBean(Long id, String key) {
        this.id = id;
        this.key = key;
    }

}
