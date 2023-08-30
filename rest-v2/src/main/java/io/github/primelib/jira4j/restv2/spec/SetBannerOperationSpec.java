package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.AnnouncementBannerConfiguration;
import io.github.primelib.jira4j.restv2.model.AnnouncementBannerConfigurationUpdate;
import io.github.primelib.jira4j.restv2.model.Configuration;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetBannerSpec
 * <p>
 * Specification for the SetBanner operation.
 * <p>
 * Update announcement banner configuration
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetBannerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate;

    /**
     * Constructs a validated instance of {@link SetBannerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetBannerOperationSpec(Consumer<SetBannerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetBannerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param announcementBannerConfigurationUpdate 
     */
    @ApiStatus.Internal
    public SetBannerOperationSpec(AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate) {
        this.announcementBannerConfigurationUpdate = announcementBannerConfigurationUpdate;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(announcementBannerConfigurationUpdate, "announcementBannerConfigurationUpdate is a required parameter!");
    }
}
