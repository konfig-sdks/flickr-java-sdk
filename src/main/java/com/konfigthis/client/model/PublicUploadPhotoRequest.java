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
import java.io.File;
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
 * PublicUploadPhotoRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PublicUploadPhotoRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  /**
   * Gets or Sets contentType
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
 public enum ContentTypeEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private ContentTypeEnum contentType;

  /**
   * Gets or Sets hidden
   */
  @JsonAdapter(HiddenEnum.Adapter.class)
 public enum HiddenEnum {
    _1("1"),
    
    _2("2");

    private String value;

    HiddenEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HiddenEnum fromValue(String value) {
      for (HiddenEnum b : HiddenEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HiddenEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HiddenEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HiddenEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HiddenEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private HiddenEnum hidden;

  /**
   * Gets or Sets isFamily
   */
  @JsonAdapter(IsFamilyEnum.Adapter.class)
 public enum IsFamilyEnum {
    _0("0"),
    
    _1("1");

    private String value;

    IsFamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsFamilyEnum fromValue(String value) {
      for (IsFamilyEnum b : IsFamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsFamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsFamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsFamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsFamilyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_FAMILY = "is_family";
  @SerializedName(SERIALIZED_NAME_IS_FAMILY)
  private IsFamilyEnum isFamily;

  /**
   * Gets or Sets isFriend
   */
  @JsonAdapter(IsFriendEnum.Adapter.class)
 public enum IsFriendEnum {
    _0("0"),
    
    _1("1");

    private String value;

    IsFriendEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsFriendEnum fromValue(String value) {
      for (IsFriendEnum b : IsFriendEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsFriendEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsFriendEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsFriendEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsFriendEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_FRIEND = "is_friend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private IsFriendEnum isFriend;

  /**
   * Gets or Sets isPublic
   */
  @JsonAdapter(IsPublicEnum.Adapter.class)
 public enum IsPublicEnum {
    _0("0"),
    
    _1("1");

    private String value;

    IsPublicEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsPublicEnum fromValue(String value) {
      for (IsPublicEnum b : IsPublicEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsPublicEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsPublicEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsPublicEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsPublicEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IS_PUBLIC = "is_public";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private IsPublicEnum isPublic;

  public static final String SERIALIZED_NAME_PHOTO = "photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private File photo;

  /**
   * Gets or Sets safetyLevel
   */
  @JsonAdapter(SafetyLevelEnum.Adapter.class)
 public enum SafetyLevelEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3");

    private String value;

    SafetyLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SafetyLevelEnum fromValue(String value) {
      for (SafetyLevelEnum b : SafetyLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SafetyLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SafetyLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SafetyLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SafetyLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SAFETY_LEVEL = "safety_level";
  @SerializedName(SERIALIZED_NAME_SAFETY_LEVEL)
  private SafetyLevelEnum safetyLevel;

  public PublicUploadPhotoRequest() {
  }

  public PublicUploadPhotoRequest tags(String tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    
    
    
    this.tags = tags;
  }


  public PublicUploadPhotoRequest title(String title) {
    
    
    
    
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


  public PublicUploadPhotoRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PublicUploadPhotoRequest apiKey(String apiKey) {
    
    
    
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    
    
    
    this.apiKey = apiKey;
  }


  public PublicUploadPhotoRequest contentType(ContentTypeEnum contentType) {
    
    
    
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentTypeEnum getContentType() {
    return contentType;
  }


  public void setContentType(ContentTypeEnum contentType) {
    
    
    
    this.contentType = contentType;
  }


  public PublicUploadPhotoRequest hidden(HiddenEnum hidden) {
    
    
    
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HiddenEnum getHidden() {
    return hidden;
  }


  public void setHidden(HiddenEnum hidden) {
    
    
    
    this.hidden = hidden;
  }


  public PublicUploadPhotoRequest isFamily(IsFamilyEnum isFamily) {
    
    
    
    
    this.isFamily = isFamily;
    return this;
  }

   /**
   * Get isFamily
   * @return isFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsFamilyEnum getIsFamily() {
    return isFamily;
  }


  public void setIsFamily(IsFamilyEnum isFamily) {
    
    
    
    this.isFamily = isFamily;
  }


  public PublicUploadPhotoRequest isFriend(IsFriendEnum isFriend) {
    
    
    
    
    this.isFriend = isFriend;
    return this;
  }

   /**
   * Get isFriend
   * @return isFriend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsFriendEnum getIsFriend() {
    return isFriend;
  }


  public void setIsFriend(IsFriendEnum isFriend) {
    
    
    
    this.isFriend = isFriend;
  }


  public PublicUploadPhotoRequest isPublic(IsPublicEnum isPublic) {
    
    
    
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsPublicEnum getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(IsPublicEnum isPublic) {
    
    
    
    this.isPublic = isPublic;
  }


  public PublicUploadPhotoRequest photo(File photo) {
    
    
    
    
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public File getPhoto() {
    return photo;
  }


  public void setPhoto(File photo) {
    
    
    
    this.photo = photo;
  }


  public PublicUploadPhotoRequest safetyLevel(SafetyLevelEnum safetyLevel) {
    
    
    
    
    this.safetyLevel = safetyLevel;
    return this;
  }

   /**
   * Get safetyLevel
   * @return safetyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SafetyLevelEnum getSafetyLevel() {
    return safetyLevel;
  }


  public void setSafetyLevel(SafetyLevelEnum safetyLevel) {
    
    
    
    this.safetyLevel = safetyLevel;
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
   * @return the PublicUploadPhotoRequest instance itself
   */
  public PublicUploadPhotoRequest putAdditionalProperty(String key, Object value) {
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
    PublicUploadPhotoRequest publicUploadPhotoRequest = (PublicUploadPhotoRequest) o;
    return Objects.equals(this.tags, publicUploadPhotoRequest.tags) &&
        Objects.equals(this.title, publicUploadPhotoRequest.title) &&
        Objects.equals(this.description, publicUploadPhotoRequest.description) &&
        Objects.equals(this.apiKey, publicUploadPhotoRequest.apiKey) &&
        Objects.equals(this.contentType, publicUploadPhotoRequest.contentType) &&
        Objects.equals(this.hidden, publicUploadPhotoRequest.hidden) &&
        Objects.equals(this.isFamily, publicUploadPhotoRequest.isFamily) &&
        Objects.equals(this.isFriend, publicUploadPhotoRequest.isFriend) &&
        Objects.equals(this.isPublic, publicUploadPhotoRequest.isPublic) &&
        Objects.equals(this.photo, publicUploadPhotoRequest.photo) &&
        Objects.equals(this.safetyLevel, publicUploadPhotoRequest.safetyLevel)&&
        Objects.equals(this.additionalProperties, publicUploadPhotoRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, title, description, apiKey, contentType, hidden, isFamily, isFriend, isPublic, photo, safetyLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUploadPhotoRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    isFamily: ").append(toIndentedString(isFamily)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    safetyLevel: ").append(toIndentedString(safetyLevel)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("api_key");
    openapiFields.add("content_type");
    openapiFields.add("hidden");
    openapiFields.add("is_family");
    openapiFields.add("is_friend");
    openapiFields.add("is_public");
    openapiFields.add("photo");
    openapiFields.add("safety_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("api_key");
    openapiRequiredFields.add("photo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublicUploadPhotoRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublicUploadPhotoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicUploadPhotoRequest is not found in the empty JSON string", PublicUploadPhotoRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicUploadPhotoRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) && !jsonObj.get("tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_key").toString()));
      }
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if ((jsonObj.get("hidden") != null && !jsonObj.get("hidden").isJsonNull()) && !jsonObj.get("hidden").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hidden` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hidden").toString()));
      }
      if ((jsonObj.get("is_family") != null && !jsonObj.get("is_family").isJsonNull()) && !jsonObj.get("is_family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_family").toString()));
      }
      if ((jsonObj.get("is_friend") != null && !jsonObj.get("is_friend").isJsonNull()) && !jsonObj.get("is_friend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_friend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_friend").toString()));
      }
      if ((jsonObj.get("is_public") != null && !jsonObj.get("is_public").isJsonNull()) && !jsonObj.get("is_public").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_public` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_public").toString()));
      }
      if ((jsonObj.get("safety_level") != null && !jsonObj.get("safety_level").isJsonNull()) && !jsonObj.get("safety_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safety_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safety_level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicUploadPhotoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicUploadPhotoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicUploadPhotoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicUploadPhotoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicUploadPhotoRequest>() {
           @Override
           public void write(JsonWriter out, PublicUploadPhotoRequest value) throws IOException {
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
           public PublicUploadPhotoRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PublicUploadPhotoRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PublicUploadPhotoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicUploadPhotoRequest
  * @throws IOException if the JSON string is invalid with respect to PublicUploadPhotoRequest
  */
  public static PublicUploadPhotoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicUploadPhotoRequest.class);
  }

 /**
  * Convert an instance of PublicUploadPhotoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

