/*
 * Ron Swanson Quotes
 * A HTTP API for retrieving Ron Swanson quotes
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: james@jamesswright.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.alexherman.example.auth;

import net.alexherman.example.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
