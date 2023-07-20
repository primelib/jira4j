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
 * ProjectEmailAddress
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "emailAddress",
    "emailAddressStatus"
})
@JsonTypeName("ProjectEmailAddress")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectEmailAddress {

    /**
     * Constructs a validated implementation of {@link ProjectEmailAddress}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectEmailAddress(Consumer<ProjectEmailAddress> spec) {
        spec.accept(this);
    }

    /**
     * The email address.
     */
    @JsonProperty("emailAddress")
    protected String emailAddress;

    /**
     * When using a custom domain, the status of the email address.
     */
    @JsonProperty("emailAddressStatus")
    protected List<String> emailAddressStatus;


}
