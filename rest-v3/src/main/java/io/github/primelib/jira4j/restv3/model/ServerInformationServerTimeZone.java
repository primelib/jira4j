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
 * ServerInformationServerTimeZone
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
    "displayName",
    "dstsavings",
    "id",
    "rawOffset"
})
@JsonTypeName("ServerInformation_serverTimeZone")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerInformationServerTimeZone {

    @JsonProperty("displayName")
    protected String displayName;

    @JsonProperty("dstsavings")
    protected Integer dstsavings;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("rawOffset")
    protected Integer rawOffset;

    /**
     * Constructs a validated instance of {@link ServerInformationServerTimeZone}.
     *
     * @param spec the specification to process
     */
    public ServerInformationServerTimeZone(Consumer<ServerInformationServerTimeZone> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServerInformationServerTimeZone}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServerInformationServerTimeZone(Consumer)} instead.
     * @param displayName displayName
     * @param dstsavings dstsavings
     * @param id id
     * @param rawOffset rawOffset
     */
    @ApiStatus.Internal
    public ServerInformationServerTimeZone(String displayName, Integer dstsavings, String id, Integer rawOffset) {
        this.displayName = displayName;
        this.dstsavings = dstsavings;
        this.id = id;
        this.rawOffset = rawOffset;
    }

}
