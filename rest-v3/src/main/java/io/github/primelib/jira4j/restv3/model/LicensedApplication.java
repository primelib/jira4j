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
 * LicensedApplication
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
    "plan"
})
@JsonTypeName("LicensedApplication")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicensedApplication {

    /**
     * The ID of the application.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The licensing plan.
     */
    @JsonProperty("plan")
    protected PlanEnum plan;

    /**
     * Constructs a validated instance of {@link LicensedApplication}.
     *
     * @param spec the specification to process
     */
    public LicensedApplication(Consumer<LicensedApplication> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LicensedApplication}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LicensedApplication(Consumer)} instead.
     * @param id The ID of the application.
     * @param plan The licensing plan.
     */
    @ApiStatus.Internal
    public LicensedApplication(String id, PlanEnum plan) {
        this.id = id;
        this.plan = plan;
    }

    /**
     * The licensing plan.
     */
    @AllArgsConstructor
    public enum PlanEnum {
        UNLICENSED("UNLICENSED"),
        FREE("FREE"),
        PAID("PAID");

        private final String value;
    }

}
