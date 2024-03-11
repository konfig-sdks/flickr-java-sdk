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
import com.konfigthis.client.model.Cover;
import com.konfigthis.client.model.GroupDescription;
import com.konfigthis.client.model.PersonPhotos;
import com.konfigthis.client.model.PersonTimezone;
import com.konfigthis.client.model.PhotoURLs;
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
 * Person
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Person {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private GroupDescription description;

  public static final String SERIALIZED_NAME_CAN_BUY_PRO = "can_buy_pro";
  @SerializedName(SERIALIZED_NAME_CAN_BUY_PRO)
  private Boolean canBuyPro;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private Cover cover;

  public static final String SERIALIZED_NAME_COVERPHOTO = "coverphoto";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO)
  private PhotoURLs coverphoto;

  public static final String SERIALIZED_NAME_COVERPHOTO_FARM = "coverphoto_farm";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO_FARM)
  private String coverphotoFarm;

  public static final String SERIALIZED_NAME_COVERPHOTO_SERVER = "coverphoto_server";
  @SerializedName(SERIALIZED_NAME_COVERPHOTO_SERVER)
  private String coverphotoServer;

  public static final String SERIALIZED_NAME_DISABLE_KEYBOARD_SHORTCUTS = "disable_keyboard_shortcuts";
  @SerializedName(SERIALIZED_NAME_DISABLE_KEYBOARD_SHORTCUTS)
  private GroupDescription disableKeyboardShortcuts;

  public static final String SERIALIZED_NAME_EXPIRE = "expire";
  @SerializedName(SERIALIZED_NAME_EXPIRE)
  private Boolean expire;

  public static final String SERIALIZED_NAME_HAS_STATS = "has_stats";
  @SerializedName(SERIALIZED_NAME_HAS_STATS)
  private Boolean hasStats;

  public static final String SERIALIZED_NAME_ICONFARM = "iconfarm";
  @SerializedName(SERIALIZED_NAME_ICONFARM)
  private String iconfarm;

  public static final String SERIALIZED_NAME_ICONSERVER = "iconserver";
  @SerializedName(SERIALIZED_NAME_ICONSERVER)
  private String iconserver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_AD_FREE = "is_ad_free";
  @SerializedName(SERIALIZED_NAME_IS_AD_FREE)
  private Boolean isAdFree;

  public static final String SERIALIZED_NAME_ISPRO = "ispro";
  @SerializedName(SERIALIZED_NAME_ISPRO)
  private Boolean ispro;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private GroupDescription location;

  public static final String SERIALIZED_NAME_MBOX_SHA1SUM = "mbox_sha1sum";
  @SerializedName(SERIALIZED_NAME_MBOX_SHA1SUM)
  private GroupDescription mboxSha1sum;

  public static final String SERIALIZED_NAME_MOBILEURL = "mobileurl";
  @SerializedName(SERIALIZED_NAME_MOBILEURL)
  private GroupDescription mobileurl;

  public static final String SERIALIZED_NAME_NSID = "nsid";
  @SerializedName(SERIALIZED_NAME_NSID)
  private String nsid;

  public static final String SERIALIZED_NAME_PATH_ALIAS = "path_alias";
  @SerializedName(SERIALIZED_NAME_PATH_ALIAS)
  private String pathAlias;

  public static final String SERIALIZED_NAME_PHOTOS = "photos";
  @SerializedName(SERIALIZED_NAME_PHOTOS)
  private PersonPhotos photos;

  public static final String SERIALIZED_NAME_PHOTOSURL = "photosurl";
  @SerializedName(SERIALIZED_NAME_PHOTOSURL)
  private GroupDescription photosurl;

  public static final String SERIALIZED_NAME_PROFILEURL = "profileurl";
  @SerializedName(SERIALIZED_NAME_PROFILEURL)
  private GroupDescription profileurl;

  public static final String SERIALIZED_NAME_REALNAME = "realname";
  @SerializedName(SERIALIZED_NAME_REALNAME)
  private GroupDescription realname;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private PersonTimezone timezone;

  public static final String SERIALIZED_NAME_UNREAD_MESSAGES = "unread_messages";
  @SerializedName(SERIALIZED_NAME_UNREAD_MESSAGES)
  private GroupDescription unreadMessages;

  public static final String SERIALIZED_NAME_USER_SECRET = "user_secret";
  @SerializedName(SERIALIZED_NAME_USER_SECRET)
  private String userSecret;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private GroupDescription username;

  public static final String SERIALIZED_NAME_YINTL = "yintl";
  @SerializedName(SERIALIZED_NAME_YINTL)
  private String yintl;

  public Person() {
  }

  public Person description(GroupDescription description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getDescription() {
    return description;
  }


  public void setDescription(GroupDescription description) {
    
    
    
    this.description = description;
  }


  public Person canBuyPro(Boolean canBuyPro) {
    
    
    
    
    this.canBuyPro = canBuyPro;
    return this;
  }

   /**
   * Get canBuyPro
   * @return canBuyPro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBuyPro() {
    return canBuyPro;
  }


  public void setCanBuyPro(Boolean canBuyPro) {
    
    
    
    this.canBuyPro = canBuyPro;
  }


  public Person cover(Cover cover) {
    
    
    
    
    this.cover = cover;
    return this;
  }

   /**
   * Get cover
   * @return cover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cover getCover() {
    return cover;
  }


  public void setCover(Cover cover) {
    
    
    
    this.cover = cover;
  }


  public Person coverphoto(PhotoURLs coverphoto) {
    
    
    
    
    this.coverphoto = coverphoto;
    return this;
  }

   /**
   * Get coverphoto
   * @return coverphoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhotoURLs getCoverphoto() {
    return coverphoto;
  }


  public void setCoverphoto(PhotoURLs coverphoto) {
    
    
    
    this.coverphoto = coverphoto;
  }


  public Person coverphotoFarm(String coverphotoFarm) {
    
    
    
    
    this.coverphotoFarm = coverphotoFarm;
    return this;
  }

   /**
   * Get coverphotoFarm
   * @return coverphotoFarm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoverphotoFarm() {
    return coverphotoFarm;
  }


  public void setCoverphotoFarm(String coverphotoFarm) {
    
    
    
    this.coverphotoFarm = coverphotoFarm;
  }


  public Person coverphotoServer(String coverphotoServer) {
    
    
    
    
    this.coverphotoServer = coverphotoServer;
    return this;
  }

   /**
   * Get coverphotoServer
   * @return coverphotoServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoverphotoServer() {
    return coverphotoServer;
  }


  public void setCoverphotoServer(String coverphotoServer) {
    
    
    
    this.coverphotoServer = coverphotoServer;
  }


  public Person disableKeyboardShortcuts(GroupDescription disableKeyboardShortcuts) {
    
    
    
    
    this.disableKeyboardShortcuts = disableKeyboardShortcuts;
    return this;
  }

   /**
   * Get disableKeyboardShortcuts
   * @return disableKeyboardShortcuts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getDisableKeyboardShortcuts() {
    return disableKeyboardShortcuts;
  }


  public void setDisableKeyboardShortcuts(GroupDescription disableKeyboardShortcuts) {
    
    
    
    this.disableKeyboardShortcuts = disableKeyboardShortcuts;
  }


  public Person expire(Boolean expire) {
    
    
    
    
    this.expire = expire;
    return this;
  }

   /**
   * Get expire
   * @return expire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExpire() {
    return expire;
  }


  public void setExpire(Boolean expire) {
    
    
    
    this.expire = expire;
  }


  public Person hasStats(Boolean hasStats) {
    
    
    
    
    this.hasStats = hasStats;
    return this;
  }

   /**
   * Get hasStats
   * @return hasStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasStats() {
    return hasStats;
  }


  public void setHasStats(Boolean hasStats) {
    
    
    
    this.hasStats = hasStats;
  }


  public Person iconfarm(String iconfarm) {
    
    
    
    
    this.iconfarm = iconfarm;
    return this;
  }

   /**
   * Get iconfarm
   * @return iconfarm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconfarm() {
    return iconfarm;
  }


  public void setIconfarm(String iconfarm) {
    
    
    
    this.iconfarm = iconfarm;
  }


  public Person iconserver(String iconserver) {
    
    
    
    
    this.iconserver = iconserver;
    return this;
  }

   /**
   * Get iconserver
   * @return iconserver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconserver() {
    return iconserver;
  }


  public void setIconserver(String iconserver) {
    
    
    
    this.iconserver = iconserver;
  }


  public Person id(String id) {
    
    
    
    
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


  public Person isAdFree(Boolean isAdFree) {
    
    
    
    
    this.isAdFree = isAdFree;
    return this;
  }

   /**
   * Get isAdFree
   * @return isAdFree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdFree() {
    return isAdFree;
  }


  public void setIsAdFree(Boolean isAdFree) {
    
    
    
    this.isAdFree = isAdFree;
  }


  public Person ispro(Boolean ispro) {
    
    
    
    
    this.ispro = ispro;
    return this;
  }

   /**
   * Get ispro
   * @return ispro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIspro() {
    return ispro;
  }


  public void setIspro(Boolean ispro) {
    
    
    
    this.ispro = ispro;
  }


  public Person location(GroupDescription location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getLocation() {
    return location;
  }


  public void setLocation(GroupDescription location) {
    
    
    
    this.location = location;
  }


  public Person mboxSha1sum(GroupDescription mboxSha1sum) {
    
    
    
    
    this.mboxSha1sum = mboxSha1sum;
    return this;
  }

   /**
   * Get mboxSha1sum
   * @return mboxSha1sum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getMboxSha1sum() {
    return mboxSha1sum;
  }


  public void setMboxSha1sum(GroupDescription mboxSha1sum) {
    
    
    
    this.mboxSha1sum = mboxSha1sum;
  }


  public Person mobileurl(GroupDescription mobileurl) {
    
    
    
    
    this.mobileurl = mobileurl;
    return this;
  }

   /**
   * Get mobileurl
   * @return mobileurl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getMobileurl() {
    return mobileurl;
  }


  public void setMobileurl(GroupDescription mobileurl) {
    
    
    
    this.mobileurl = mobileurl;
  }


  public Person nsid(String nsid) {
    
    
    
    
    this.nsid = nsid;
    return this;
  }

   /**
   * Get nsid
   * @return nsid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNsid() {
    return nsid;
  }


  public void setNsid(String nsid) {
    
    
    
    this.nsid = nsid;
  }


  public Person pathAlias(String pathAlias) {
    
    
    
    
    this.pathAlias = pathAlias;
    return this;
  }

   /**
   * Get pathAlias
   * @return pathAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathAlias() {
    return pathAlias;
  }


  public void setPathAlias(String pathAlias) {
    
    
    
    this.pathAlias = pathAlias;
  }


  public Person photos(PersonPhotos photos) {
    
    
    
    
    this.photos = photos;
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonPhotos getPhotos() {
    return photos;
  }


  public void setPhotos(PersonPhotos photos) {
    
    
    
    this.photos = photos;
  }


  public Person photosurl(GroupDescription photosurl) {
    
    
    
    
    this.photosurl = photosurl;
    return this;
  }

   /**
   * Get photosurl
   * @return photosurl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getPhotosurl() {
    return photosurl;
  }


  public void setPhotosurl(GroupDescription photosurl) {
    
    
    
    this.photosurl = photosurl;
  }


  public Person profileurl(GroupDescription profileurl) {
    
    
    
    
    this.profileurl = profileurl;
    return this;
  }

   /**
   * Get profileurl
   * @return profileurl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getProfileurl() {
    return profileurl;
  }


  public void setProfileurl(GroupDescription profileurl) {
    
    
    
    this.profileurl = profileurl;
  }


  public Person realname(GroupDescription realname) {
    
    
    
    
    this.realname = realname;
    return this;
  }

   /**
   * Get realname
   * @return realname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getRealname() {
    return realname;
  }


  public void setRealname(GroupDescription realname) {
    
    
    
    this.realname = realname;
  }


  public Person timezone(PersonTimezone timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonTimezone getTimezone() {
    return timezone;
  }


  public void setTimezone(PersonTimezone timezone) {
    
    
    
    this.timezone = timezone;
  }


  public Person unreadMessages(GroupDescription unreadMessages) {
    
    
    
    
    this.unreadMessages = unreadMessages;
    return this;
  }

   /**
   * Get unreadMessages
   * @return unreadMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getUnreadMessages() {
    return unreadMessages;
  }


  public void setUnreadMessages(GroupDescription unreadMessages) {
    
    
    
    this.unreadMessages = unreadMessages;
  }


  public Person userSecret(String userSecret) {
    
    
    
    
    this.userSecret = userSecret;
    return this;
  }

   /**
   * Get userSecret
   * @return userSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserSecret() {
    return userSecret;
  }


  public void setUserSecret(String userSecret) {
    
    
    
    this.userSecret = userSecret;
  }


  public Person username(GroupDescription username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupDescription getUsername() {
    return username;
  }


  public void setUsername(GroupDescription username) {
    
    
    
    this.username = username;
  }


  public Person yintl(String yintl) {
    
    
    
    
    this.yintl = yintl;
    return this;
  }

   /**
   * Get yintl
   * @return yintl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYintl() {
    return yintl;
  }


  public void setYintl(String yintl) {
    
    
    
    this.yintl = yintl;
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
   * @return the Person instance itself
   */
  public Person putAdditionalProperty(String key, Object value) {
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
    Person person = (Person) o;
    return Objects.equals(this.description, person.description) &&
        Objects.equals(this.canBuyPro, person.canBuyPro) &&
        Objects.equals(this.cover, person.cover) &&
        Objects.equals(this.coverphoto, person.coverphoto) &&
        Objects.equals(this.coverphotoFarm, person.coverphotoFarm) &&
        Objects.equals(this.coverphotoServer, person.coverphotoServer) &&
        Objects.equals(this.disableKeyboardShortcuts, person.disableKeyboardShortcuts) &&
        Objects.equals(this.expire, person.expire) &&
        Objects.equals(this.hasStats, person.hasStats) &&
        Objects.equals(this.iconfarm, person.iconfarm) &&
        Objects.equals(this.iconserver, person.iconserver) &&
        Objects.equals(this.id, person.id) &&
        Objects.equals(this.isAdFree, person.isAdFree) &&
        Objects.equals(this.ispro, person.ispro) &&
        Objects.equals(this.location, person.location) &&
        Objects.equals(this.mboxSha1sum, person.mboxSha1sum) &&
        Objects.equals(this.mobileurl, person.mobileurl) &&
        Objects.equals(this.nsid, person.nsid) &&
        Objects.equals(this.pathAlias, person.pathAlias) &&
        Objects.equals(this.photos, person.photos) &&
        Objects.equals(this.photosurl, person.photosurl) &&
        Objects.equals(this.profileurl, person.profileurl) &&
        Objects.equals(this.realname, person.realname) &&
        Objects.equals(this.timezone, person.timezone) &&
        Objects.equals(this.unreadMessages, person.unreadMessages) &&
        Objects.equals(this.userSecret, person.userSecret) &&
        Objects.equals(this.username, person.username) &&
        Objects.equals(this.yintl, person.yintl)&&
        Objects.equals(this.additionalProperties, person.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, canBuyPro, cover, coverphoto, coverphotoFarm, coverphotoServer, disableKeyboardShortcuts, expire, hasStats, iconfarm, iconserver, id, isAdFree, ispro, location, mboxSha1sum, mobileurl, nsid, pathAlias, photos, photosurl, profileurl, realname, timezone, unreadMessages, userSecret, username, yintl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    canBuyPro: ").append(toIndentedString(canBuyPro)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    coverphoto: ").append(toIndentedString(coverphoto)).append("\n");
    sb.append("    coverphotoFarm: ").append(toIndentedString(coverphotoFarm)).append("\n");
    sb.append("    coverphotoServer: ").append(toIndentedString(coverphotoServer)).append("\n");
    sb.append("    disableKeyboardShortcuts: ").append(toIndentedString(disableKeyboardShortcuts)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    hasStats: ").append(toIndentedString(hasStats)).append("\n");
    sb.append("    iconfarm: ").append(toIndentedString(iconfarm)).append("\n");
    sb.append("    iconserver: ").append(toIndentedString(iconserver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdFree: ").append(toIndentedString(isAdFree)).append("\n");
    sb.append("    ispro: ").append(toIndentedString(ispro)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mboxSha1sum: ").append(toIndentedString(mboxSha1sum)).append("\n");
    sb.append("    mobileurl: ").append(toIndentedString(mobileurl)).append("\n");
    sb.append("    nsid: ").append(toIndentedString(nsid)).append("\n");
    sb.append("    pathAlias: ").append(toIndentedString(pathAlias)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    photosurl: ").append(toIndentedString(photosurl)).append("\n");
    sb.append("    profileurl: ").append(toIndentedString(profileurl)).append("\n");
    sb.append("    realname: ").append(toIndentedString(realname)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    unreadMessages: ").append(toIndentedString(unreadMessages)).append("\n");
    sb.append("    userSecret: ").append(toIndentedString(userSecret)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    yintl: ").append(toIndentedString(yintl)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("can_buy_pro");
    openapiFields.add("cover");
    openapiFields.add("coverphoto");
    openapiFields.add("coverphoto_farm");
    openapiFields.add("coverphoto_server");
    openapiFields.add("disable_keyboard_shortcuts");
    openapiFields.add("expire");
    openapiFields.add("has_stats");
    openapiFields.add("iconfarm");
    openapiFields.add("iconserver");
    openapiFields.add("id");
    openapiFields.add("is_ad_free");
    openapiFields.add("ispro");
    openapiFields.add("location");
    openapiFields.add("mbox_sha1sum");
    openapiFields.add("mobileurl");
    openapiFields.add("nsid");
    openapiFields.add("path_alias");
    openapiFields.add("photos");
    openapiFields.add("photosurl");
    openapiFields.add("profileurl");
    openapiFields.add("realname");
    openapiFields.add("timezone");
    openapiFields.add("unread_messages");
    openapiFields.add("user_secret");
    openapiFields.add("username");
    openapiFields.add("yintl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Person
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Person.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Person is not found in the empty JSON string", Person.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("description"));
      }
      // validate the optional field `cover`
      if (jsonObj.get("cover") != null && !jsonObj.get("cover").isJsonNull()) {
        Cover.validateJsonObject(jsonObj.getAsJsonObject("cover"));
      }
      // validate the optional field `coverphoto`
      if (jsonObj.get("coverphoto") != null && !jsonObj.get("coverphoto").isJsonNull()) {
        PhotoURLs.validateJsonObject(jsonObj.getAsJsonObject("coverphoto"));
      }
      if ((jsonObj.get("coverphoto_farm") != null && !jsonObj.get("coverphoto_farm").isJsonNull()) && !jsonObj.get("coverphoto_farm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverphoto_farm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverphoto_farm").toString()));
      }
      if ((jsonObj.get("coverphoto_server") != null && !jsonObj.get("coverphoto_server").isJsonNull()) && !jsonObj.get("coverphoto_server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverphoto_server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverphoto_server").toString()));
      }
      // validate the optional field `disable_keyboard_shortcuts`
      if (jsonObj.get("disable_keyboard_shortcuts") != null && !jsonObj.get("disable_keyboard_shortcuts").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("disable_keyboard_shortcuts"));
      }
      if ((jsonObj.get("iconfarm") != null && !jsonObj.get("iconfarm").isJsonNull()) && !jsonObj.get("iconfarm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconfarm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconfarm").toString()));
      }
      if ((jsonObj.get("iconserver") != null && !jsonObj.get("iconserver").isJsonNull()) && !jsonObj.get("iconserver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconserver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconserver").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `mbox_sha1sum`
      if (jsonObj.get("mbox_sha1sum") != null && !jsonObj.get("mbox_sha1sum").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("mbox_sha1sum"));
      }
      // validate the optional field `mobileurl`
      if (jsonObj.get("mobileurl") != null && !jsonObj.get("mobileurl").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("mobileurl"));
      }
      if ((jsonObj.get("nsid") != null && !jsonObj.get("nsid").isJsonNull()) && !jsonObj.get("nsid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nsid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nsid").toString()));
      }
      if ((jsonObj.get("path_alias") != null && !jsonObj.get("path_alias").isJsonNull()) && !jsonObj.get("path_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path_alias").toString()));
      }
      // validate the optional field `photos`
      if (jsonObj.get("photos") != null && !jsonObj.get("photos").isJsonNull()) {
        PersonPhotos.validateJsonObject(jsonObj.getAsJsonObject("photos"));
      }
      // validate the optional field `photosurl`
      if (jsonObj.get("photosurl") != null && !jsonObj.get("photosurl").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("photosurl"));
      }
      // validate the optional field `profileurl`
      if (jsonObj.get("profileurl") != null && !jsonObj.get("profileurl").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("profileurl"));
      }
      // validate the optional field `realname`
      if (jsonObj.get("realname") != null && !jsonObj.get("realname").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("realname"));
      }
      // validate the optional field `timezone`
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) {
        PersonTimezone.validateJsonObject(jsonObj.getAsJsonObject("timezone"));
      }
      // validate the optional field `unread_messages`
      if (jsonObj.get("unread_messages") != null && !jsonObj.get("unread_messages").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("unread_messages"));
      }
      if ((jsonObj.get("user_secret") != null && !jsonObj.get("user_secret").isJsonNull()) && !jsonObj.get("user_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_secret").toString()));
      }
      // validate the optional field `username`
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) {
        GroupDescription.validateJsonObject(jsonObj.getAsJsonObject("username"));
      }
      if ((jsonObj.get("yintl") != null && !jsonObj.get("yintl").isJsonNull()) && !jsonObj.get("yintl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yintl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yintl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Person.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Person' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Person> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Person.class));

       return (TypeAdapter<T>) new TypeAdapter<Person>() {
           @Override
           public void write(JsonWriter out, Person value) throws IOException {
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
           public Person read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Person instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Person given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Person
  * @throws IOException if the JSON string is invalid with respect to Person
  */
  public static Person fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Person.class);
  }

 /**
  * Convert an instance of Person to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

