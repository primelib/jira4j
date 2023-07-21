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
 * PermissionSchemes
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
    "permissionSchemes"
})
@JsonTypeName("PermissionSchemes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionSchemes {

    /**
     * Permission schemes list.
     */
    @JsonProperty("permissionSchemes")
    protected List<PermissionScheme> permissionSchemes;

    /**
     * Constructs a validated instance of {@link PermissionSchemes}.
     *
     * @param spec the specification to process
     */
    public PermissionSchemes(Consumer<PermissionSchemes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionSchemes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionSchemes(Consumer)} instead.
     * @param permissionSchemes Permission schemes list.
     */
    @ApiStatus.Internal
    public PermissionSchemes(List<PermissionScheme> permissionSchemes) {
        this.permissionSchemes = permissionSchemes;
    }

}
