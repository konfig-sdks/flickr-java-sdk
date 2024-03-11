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
import com.konfigthis.client.model.Album;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PublicGetUserAlbumsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PublicGetUserAlbumsResponse {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Double page;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Double pages;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Double perpage;

  public static final String SERIALIZED_NAME_PHOTOSETS = "photosets";
  @SerializedName(SERIALIZED_NAME_PHOTOSETS)
  private List<Album> photosets = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public PublicGetUserAlbumsResponse() {
  }

  public PublicGetUserAlbumsResponse page(Double page) {
    
    
    
    
    this.page = page;
    return this;
  }

  public PublicGetUserAlbumsResponse page(Integer page) {
    
    
    
    
    this.page = page.doubleValue();
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPage() {
    return page;
  }


  public void setPage(Double page) {
    
    
    
    this.page = page;
  }


  public PublicGetUserAlbumsResponse pages(Double pages) {
    
    
    
    
    this.pages = pages;
    return this;
  }

  public PublicGetUserAlbumsResponse pages(Integer pages) {
    
    
    
    
    this.pages = pages.doubleValue();
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPages() {
    return pages;
  }


  public void setPages(Double pages) {
    
    
    
    this.pages = pages;
  }


  public PublicGetUserAlbumsResponse perpage(Double perpage) {
    
    
    
    
    this.perpage = perpage;
    return this;
  }

  public PublicGetUserAlbumsResponse perpage(Integer perpage) {
    
    
    
    
    this.perpage = perpage.doubleValue();
    return this;
  }

   /**
   * Get perpage
   * @return perpage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPerpage() {
    return perpage;
  }


  public void setPerpage(Double perpage) {
    
    
    
    this.perpage = perpage;
  }


  public PublicGetUserAlbumsResponse photosets(List<Album> photosets) {
    
    
    
    
    this.photosets = photosets;
    return this;
  }

  public PublicGetUserAlbumsResponse addPhotosetsItem(Album photosetsItem) {
    if (this.photosets == null) {
      this.photosets = new ArrayList<>();
    }
    this.photosets.add(photosetsItem);
    return this;
  }

   /**
   * Get photosets
   * @return photosets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Album> getPhotosets() {
    return photosets;
  }


  public void setPhotosets(List<Album> photosets) {
    
    
    
    this.photosets = photosets;
  }


  public PublicGetUserAlbumsResponse total(Double total) {
    
    
    
    
    this.total = total;
    return this;
  }

  public PublicGetUserAlbumsResponse total(Integer total) {
    
    
    
    
    this.total = total.doubleValue();
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    
    
    
    this.total = total;
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
   * @return the PublicGetUserAlbumsResponse instance itself
   */
  public PublicGetUserAlbumsResponse putAdditionalProperty(String key, Object value) {
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
    PublicGetUserAlbumsResponse publicGetUserAlbumsResponse = (PublicGetUserAlbumsResponse) o;
    return Objects.equals(this.page, publicGetUserAlbumsResponse.page) &&
        Objects.equals(this.pages, publicGetUserAlbumsResponse.pages) &&
        Objects.equals(this.perpage, publicGetUserAlbumsResponse.perpage) &&
        Objects.equals(this.photosets, publicGetUserAlbumsResponse.photosets) &&
        Objects.equals(this.total, publicGetUserAlbumsResponse.total)&&
        Objects.equals(this.additionalProperties, publicGetUserAlbumsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pages, perpage, photosets, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicGetUserAlbumsResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    photosets: ").append(toIndentedString(photosets)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("pages");
    openapiFields.add("perpage");
    openapiFields.add("photosets");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublicGetUserAlbumsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublicGetUserAlbumsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicGetUserAlbumsResponse is not found in the empty JSON string", PublicGetUserAlbumsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("photosets") != null && !jsonObj.get("photosets").isJsonNull()) {
        JsonArray jsonArrayphotosets = jsonObj.getAsJsonArray("photosets");
        if (jsonArrayphotosets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("photosets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `photosets` to be an array in the JSON string but got `%s`", jsonObj.get("photosets").toString()));
          }

          // validate the optional field `photosets` (array)
          for (int i = 0; i < jsonArrayphotosets.size(); i++) {
            Album.validateJsonObject(jsonArrayphotosets.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicGetUserAlbumsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicGetUserAlbumsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicGetUserAlbumsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicGetUserAlbumsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicGetUserAlbumsResponse>() {
           @Override
           public void write(JsonWriter out, PublicGetUserAlbumsResponse value) throws IOException {
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
           public PublicGetUserAlbumsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PublicGetUserAlbumsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PublicGetUserAlbumsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicGetUserAlbumsResponse
  * @throws IOException if the JSON string is invalid with respect to PublicGetUserAlbumsResponse
  */
  public static PublicGetUserAlbumsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicGetUserAlbumsResponse.class);
  }

 /**
  * Convert an instance of PublicGetUserAlbumsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

