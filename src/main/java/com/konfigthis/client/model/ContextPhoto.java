/*
 * Flickr API Schema
 * A subset of Flickr's API defined in Swagger format.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ContextPhoto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContextPhoto {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FARM = "farm";
  @SerializedName(SERIALIZED_NAME_FARM)
  private String farm;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_FAVED = "is_faved";
  @SerializedName(SERIALIZED_NAME_IS_FAVED)
  private Boolean isFaved;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private Integer license;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private String media;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_SAFE = "safe";
  @SerializedName(SERIALIZED_NAME_SAFE)
  private Boolean safe;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_THUMB = "thumb";
  @SerializedName(SERIALIZED_NAME_THUMB)
  private String thumb;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ContextPhoto() {
  }

  public ContextPhoto title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ContextPhoto farm(String farm) {
    
    
    
    
    this.farm = farm;
    return this;
  }

   /**
   * Get farm
   * @return farm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFarm() {
    return farm;
  }


  public void setFarm(String farm) {
    
    
    
    this.farm = farm;
  }


  public ContextPhoto id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ContextPhoto isFaved(Boolean isFaved) {
    
    
    
    
    this.isFaved = isFaved;
    return this;
  }

   /**
   * Get isFaved
   * @return isFaved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsFaved() {
    return isFaved;
  }


  public void setIsFaved(Boolean isFaved) {
    
    
    
    this.isFaved = isFaved;
  }


  public ContextPhoto license(Integer license) {
    
    
    
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLicense() {
    return license;
  }


  public void setLicense(Integer license) {
    
    
    
    this.license = license;
  }


  public ContextPhoto media(String media) {
    
    
    
    
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMedia() {
    return media;
  }


  public void setMedia(String media) {
    
    
    
    this.media = media;
  }


  public ContextPhoto owner(String owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    
    
    
    this.owner = owner;
  }


  public ContextPhoto safe(Boolean safe) {
    
    
    
    
    this.safe = safe;
    return this;
  }

   /**
   * Get safe
   * @return safe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSafe() {
    return safe;
  }


  public void setSafe(Boolean safe) {
    
    
    
    this.safe = safe;
  }


  public ContextPhoto secret(String secret) {
    
    
    
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    
    
    
    this.secret = secret;
  }


  public ContextPhoto server(String server) {
    
    
    
    
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    
    
    
    this.server = server;
  }


  public ContextPhoto thumb(String thumb) {
    
    
    
    
    this.thumb = thumb;
    return this;
  }

   /**
   * Get thumb
   * @return thumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumb() {
    return thumb;
  }


  public void setThumb(String thumb) {
    
    
    
    this.thumb = thumb;
  }


  public ContextPhoto url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ContextPhoto instance itself
   */
  public ContextPhoto putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextPhoto contextPhoto = (ContextPhoto) o;
    return Objects.equals(this.title, contextPhoto.title) &&
        Objects.equals(this.farm, contextPhoto.farm) &&
        Objects.equals(this.id, contextPhoto.id) &&
        Objects.equals(this.isFaved, contextPhoto.isFaved) &&
        Objects.equals(this.license, contextPhoto.license) &&
        Objects.equals(this.media, contextPhoto.media) &&
        Objects.equals(this.owner, contextPhoto.owner) &&
        Objects.equals(this.safe, contextPhoto.safe) &&
        Objects.equals(this.secret, contextPhoto.secret) &&
        Objects.equals(this.server, contextPhoto.server) &&
        Objects.equals(this.thumb, contextPhoto.thumb) &&
        Objects.equals(this.url, contextPhoto.url)&&
        Objects.equals(this.additionalProperties, contextPhoto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, farm, id, isFaved, license, media, owner, safe, secret, server, thumb, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextPhoto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    farm: ").append(toIndentedString(farm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFaved: ").append(toIndentedString(isFaved)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    safe: ").append(toIndentedString(safe)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("farm");
    openapiFields.add("id");
    openapiFields.add("is_faved");
    openapiFields.add("license");
    openapiFields.add("media");
    openapiFields.add("owner");
    openapiFields.add("safe");
    openapiFields.add("secret");
    openapiFields.add("server");
    openapiFields.add("thumb");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContextPhoto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContextPhoto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContextPhoto is not found in the empty JSON string", ContextPhoto.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("farm") != null && !jsonObj.get("farm").isJsonNull()) && !jsonObj.get("farm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `farm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("farm").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull()) && !jsonObj.get("media").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("thumb") != null && !jsonObj.get("thumb").isJsonNull()) && !jsonObj.get("thumb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumb").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContextPhoto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContextPhoto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContextPhoto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContextPhoto.class));

       return (TypeAdapter<T>) new TypeAdapter<ContextPhoto>() {
           @Override
           public void write(JsonWriter out, ContextPhoto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ContextPhoto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContextPhoto instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContextPhoto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContextPhoto
  * @throws IOException if the JSON string is invalid with respect to ContextPhoto
  */
  public static ContextPhoto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContextPhoto.class);
  }

 /**
  * Convert an instance of ContextPhoto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

