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
 * PhotoUsage
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PhotoUsage {
  public static final String SERIALIZED_NAME_CANBLOG = "canblog";
  @SerializedName(SERIALIZED_NAME_CANBLOG)
  private Boolean canblog;

  public static final String SERIALIZED_NAME_CANDOWNLOAD = "candownload";
  @SerializedName(SERIALIZED_NAME_CANDOWNLOAD)
  private Boolean candownload;

  public static final String SERIALIZED_NAME_CANPRINT = "canprint";
  @SerializedName(SERIALIZED_NAME_CANPRINT)
  private Boolean canprint;

  public static final String SERIALIZED_NAME_CANSHARE = "canshare";
  @SerializedName(SERIALIZED_NAME_CANSHARE)
  private Boolean canshare;

  public PhotoUsage() {
  }

  public PhotoUsage canblog(Boolean canblog) {
    
    
    
    
    this.canblog = canblog;
    return this;
  }

   /**
   * Get canblog
   * @return canblog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanblog() {
    return canblog;
  }


  public void setCanblog(Boolean canblog) {
    
    
    
    this.canblog = canblog;
  }


  public PhotoUsage candownload(Boolean candownload) {
    
    
    
    
    this.candownload = candownload;
    return this;
  }

   /**
   * Get candownload
   * @return candownload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCandownload() {
    return candownload;
  }


  public void setCandownload(Boolean candownload) {
    
    
    
    this.candownload = candownload;
  }


  public PhotoUsage canprint(Boolean canprint) {
    
    
    
    
    this.canprint = canprint;
    return this;
  }

   /**
   * Get canprint
   * @return canprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanprint() {
    return canprint;
  }


  public void setCanprint(Boolean canprint) {
    
    
    
    this.canprint = canprint;
  }


  public PhotoUsage canshare(Boolean canshare) {
    
    
    
    
    this.canshare = canshare;
    return this;
  }

   /**
   * Get canshare
   * @return canshare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanshare() {
    return canshare;
  }


  public void setCanshare(Boolean canshare) {
    
    
    
    this.canshare = canshare;
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
   * @return the PhotoUsage instance itself
   */
  public PhotoUsage putAdditionalProperty(String key, Object value) {
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
    PhotoUsage photoUsage = (PhotoUsage) o;
    return Objects.equals(this.canblog, photoUsage.canblog) &&
        Objects.equals(this.candownload, photoUsage.candownload) &&
        Objects.equals(this.canprint, photoUsage.canprint) &&
        Objects.equals(this.canshare, photoUsage.canshare)&&
        Objects.equals(this.additionalProperties, photoUsage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canblog, candownload, canprint, canshare, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoUsage {\n");
    sb.append("    canblog: ").append(toIndentedString(canblog)).append("\n");
    sb.append("    candownload: ").append(toIndentedString(candownload)).append("\n");
    sb.append("    canprint: ").append(toIndentedString(canprint)).append("\n");
    sb.append("    canshare: ").append(toIndentedString(canshare)).append("\n");
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
    openapiFields.add("canblog");
    openapiFields.add("candownload");
    openapiFields.add("canprint");
    openapiFields.add("canshare");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PhotoUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PhotoUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhotoUsage is not found in the empty JSON string", PhotoUsage.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhotoUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhotoUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhotoUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhotoUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<PhotoUsage>() {
           @Override
           public void write(JsonWriter out, PhotoUsage value) throws IOException {
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
           public PhotoUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PhotoUsage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PhotoUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PhotoUsage
  * @throws IOException if the JSON string is invalid with respect to PhotoUsage
  */
  public static PhotoUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhotoUsage.class);
  }

 /**
  * Convert an instance of PhotoUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

