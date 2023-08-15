package com.laioffer.twitch.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Game(
        String id,
        String name,
        @JsonProperty("box_art_url") String boxArtUrl,
        @JsonProperty("igdb_id") String igdbId,
        @JsonProperty("my_definition") String myDefinition
) {
}
