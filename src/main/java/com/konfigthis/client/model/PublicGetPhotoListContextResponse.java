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
import com.konfigthis.client.model.ContextPhoto;
import com.konfigthis.client.model.GroupDescription;
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
 * PublicGetPhotoListContextResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PublicGetPhotoListContextResponse {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private GroupDescription count;

  public static final String SERIALIZED_NAME_NEXTPHOTO = "nextphoto";
  @SerializedName(SERIALIZED_NAME_NEXTPHOTO)
  private ContextPhoto nextphoto;

  public static final String SERIALIZED_NAME_PREVPHOTO = "prevphoto";
  @SerializedName(SERIALIZED_NAME_PREVPHOTO)
  private ContextPhoto prevphoto;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public PublicGetPhotoListContextResponse() {
  }

  public PublicGetPhotoListContextResponse count(GroupDescription count) {
    
    
    
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getCount() {
    return count;
  }


  public void setCount(GroupDescription count) {
    
    
    
    this.count = count;
  }


  public PublicGetPhotoListContextResponse nextphoto(ContextPhoto nextphoto) {
    
    
    
    
    this.nextphoto = nextphoto;
    return this;
  }

   /**
   * Get nextphoto
   * @return nextphoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContextPhoto getNextphoto() {
    return nextphoto;
  }


  public void setNextphoto(ContextPhoto nextphoto) {
    
    
    
    this.nextphoto = nextphoto;
  }


  public PublicGetPhotoListContextResponse prevphoto(ContextPhoto prevphoto) {
    
    
    
    
    this.prevphoto = prevphoto;
    return this;
  }

   /**
   * Get prevphoto
   * @return prevphoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContextPhoto getPrevphoto() {
    return prevphoto;
  }


  public void setPrevphoto(ContextPhoto prevphoto) {
    
    
    
    this.prevphoto = prevphoto;
  }


  public PublicGetPhotoListContextResponse stat(String stat) {
    
    
    
    
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStat() {
    return stat;
  }


  public void setStat(String stat) {
    
    
    
    this.stat = stat;
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
   * @return the PublicGetPhotoListContextResponse instance itself
   */
  public PublicGetPhotoListContextResponse putAdditionalProperty(String key, Object value) {
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
    PublicGetPhotoListContextResponse publicGetPhotoListContextResponse = (PublicGetPhotoListContextResponse) o;
    return Objects.equals(this.count, publicGetPhotoListContextResponse.count) &&
        Objects.equals(this.nextphoto, publicGetPhotoListContextResponse.nextphoto) &&
        Objects.equals(this.prevphoto, publicGetPhotoListContextResponse.prevphoto) &&
        Objects.equals(this.stat, publicGetPhotoListContextResponse.stat)&&
        Objects.equals(this.additionalProperties, publicGetPhotoListContextResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, nextphoto, prevphoto, stat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicGetPhotoListContextResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    nextphoto: ").append(toIndentedString(nextphoto)).append("\n");
    sb.append("    prevphoto: ").append(toIndentedString(prevphoto)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("nextphoto");
    openapiFields.add("prevphoto");
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublicGetPhotoListContextResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublicGetPhotoListContextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicGetPhotoListContextResponse is not found in the empty JSON string", PublicGetPhotoListContextResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `count`
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("count"));
      }
      // validate the optional field `nextphoto`
      if (jsonObj.get("nextphoto") != null && !jsonObj.get("nextphoto").isJsonNull()) {
        ContextPhoto.validateJsonObject(jsonObj.getAsJsonObject("nextphoto"));
      }
      // validate the optional field `prevphoto`
      if (jsonObj.get("prevphoto") != null && !jsonObj.get("prevphoto").isJsonNull()) {
        ContextPhoto.validateJsonObject(jsonObj.getAsJsonObject("prevphoto"));
      }
      if ((jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) && !jsonObj.get("stat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicGetPhotoListContextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicGetPhotoListContextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicGetPhotoListContextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicGetPhotoListContextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicGetPhotoListContextResponse>() {
           @Override
           public void write(JsonWriter out, PublicGetPhotoListContextResponse value) throws IOException {
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
           public PublicGetPhotoListContextResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PublicGetPhotoListContextResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PublicGetPhotoListContextResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicGetPhotoListContextResponse
  * @throws IOException if the JSON string is invalid with respect to PublicGetPhotoListContextResponse
  */
  public static PublicGetPhotoListContextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicGetPhotoListContextResponse.class);
  }

 /**
  * Convert an instance of PublicGetPhotoListContextResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
