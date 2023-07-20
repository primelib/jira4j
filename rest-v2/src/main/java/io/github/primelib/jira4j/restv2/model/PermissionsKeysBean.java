package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PermissionsKeysBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "permissions"
})
@JsonTypeName("PermissionsKeysBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionsKeysBean {

    /**
     * Constructs a validated implementation of {@link PermissionsKeysBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PermissionsKeysBean(Consumer<PermissionsKeysBean> spec) {
        spec.accept(this);
    }

    /**
     * A list of permission keys.
     */
    @JsonProperty("permissions")
    protected List<String> permissions = new ArrayList<>();


}
