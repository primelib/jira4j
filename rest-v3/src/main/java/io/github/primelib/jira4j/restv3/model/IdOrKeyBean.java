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
 * IdOrKeyBean
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
@JsonTypeName("IdOrKeyBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IdOrKeyBean {

    /**
     * The ID of the referenced item.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The key of the referenced item.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Constructs a validated instance of {@link IdOrKeyBean}.
     *
     * @param spec the specification to process
     */
    public IdOrKeyBean(Consumer<IdOrKeyBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IdOrKeyBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IdOrKeyBean(Consumer)} instead.
     * @param id The ID of the referenced item.
     * @param key The key of the referenced item.
     */
    @ApiStatus.Internal
    public IdOrKeyBean(Long id, String key) {
        this.id = id;
        this.key = key;
    }

}
