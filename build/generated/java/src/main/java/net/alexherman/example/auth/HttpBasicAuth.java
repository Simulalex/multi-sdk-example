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

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.List;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T14:47:08.716-04:00[America/New_York]")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
