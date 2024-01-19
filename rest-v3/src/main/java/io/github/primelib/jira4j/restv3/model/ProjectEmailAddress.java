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
 * ProjectEmailAddress
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
    "emailAddress",
    "emailAddressStatus"
})
@JsonTypeName("ProjectEmailAddress")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectEmailAddress {

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

    /**
     * Constructs a validated instance of {@link ProjectEmailAddress}.
     *
     * @param spec the specification to process
     */
    public ProjectEmailAddress(Consumer<ProjectEmailAddress> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectEmailAddress}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectEmailAddress(Consumer)} instead.
     * @param emailAddress The email address.
     * @param emailAddressStatus When using a custom domain, the status of the email address.
     */
    @ApiStatus.Internal
    public ProjectEmailAddress(String emailAddress, List<String> emailAddressStatus) {
        this.emailAddress = emailAddress;
        this.emailAddressStatus = emailAddressStatus;
    }

}
