package com.groundbook.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * The app's own settings, read once at start-up from application.yml.
 *
 * @param seedDir the folder that holds grounds.csv and event_types.csv
 * @param holdHours how long a requested slot holds the ground before it must be confirmed
 */
@ConfigurationProperties("groundbook")
public record GroundBookSettings(
        @DefaultValue("seed") String seedDir,
        @DefaultValue("24") int holdHours) {
}
