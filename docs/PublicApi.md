# PublicApi

All URIs are relative to *https://api.flickr.com/services*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**flickrGroupsPoolsGetContext**](PublicApi.md#flickrGroupsPoolsGetContext) | **GET** /rest?method&#x3D;flickr.groups.pools.getContext |  |
| [**getAccessToken**](PublicApi.md#getAccessToken) | **GET** /oauth/access_token |  |
| [**getAlbumPhotos**](PublicApi.md#getAlbumPhotos) | **GET** /rest?method&#x3D;flickr.photosets.getPhotos |  |
| [**getFavoritePhotos**](PublicApi.md#getFavoritePhotos) | **GET** /rest?method&#x3D;flickr.favorites.getList |  |
| [**getFavoritesContext**](PublicApi.md#getFavoritesContext) | **GET** /rest?method&#x3D;flickr.favorites.getContext |  |
| [**getFlickrTestEcho**](PublicApi.md#getFlickrTestEcho) | **GET** /rest?method&#x3D;flickr.test.echo |  |
| [**getGalleryPhotos**](PublicApi.md#getGalleryPhotos) | **GET** /rest?method&#x3D;flickr.galleries.getPhotos |  |
| [**getGroupDiscussionTopics**](PublicApi.md#getGroupDiscussionTopics) | **GET** /rest?method&#x3D;flickr.groups.discuss.topics.getList |  |
| [**getGroupInfo**](PublicApi.md#getGroupInfo) | **GET** /rest?method&#x3D;flickr.groups.getInfo |  |
| [**getGroupPoolPhotos**](PublicApi.md#getGroupPoolPhotos) | **GET** /rest?method&#x3D;flickr.groups.pools.getPhotos |  |
| [**getGroupTopicInfo**](PublicApi.md#getGroupTopicInfo) | **GET** /rest?method&#x3D;flickr.groups.discuss.topics.getInfo |  |
| [**getGroupTopicRepliesInfo**](PublicApi.md#getGroupTopicRepliesInfo) | **GET** /rest?method&#x3D;flickr.groups.discuss.replies.getInfo |  |
| [**getOAuthToken**](PublicApi.md#getOAuthToken) | **GET** /oauth/request_token |  |
| [**getPersonInformation**](PublicApi.md#getPersonInformation) | **GET** /rest?method&#x3D;flickr.people.getInfo |  |
| [**getPhotoExif**](PublicApi.md#getPhotoExif) | **GET** /rest?method&#x3D;flickr.photos.getExif |  |
| [**getPhotoInfo**](PublicApi.md#getPhotoInfo) | **GET** /rest?method&#x3D;flickr.photos.getInfo |  |
| [**getPhotoLicenses**](PublicApi.md#getPhotoLicenses) | **GET** /rest?method&#x3D;flickr.photos.licenses.getInfo |  |
| [**getPhotoListContext**](PublicApi.md#getPhotoListContext) | **GET** /rest?method&#x3D;flickr.photolist.getContext |  |
| [**getPhotoSetContext**](PublicApi.md#getPhotoSetContext) | **GET** /rest?method&#x3D;flickr.photosets.getContext |  |
| [**getPhotoSizes**](PublicApi.md#getPhotoSizes) | **GET** /rest?method&#x3D;flickr.photos.getSizes |  |
| [**getPhotostreamContext**](PublicApi.md#getPhotostreamContext) | **GET** /rest?method&#x3D;flickr.photos.getContext |  |
| [**getUserAlbums**](PublicApi.md#getUserAlbums) | **GET** /rest?method&#x3D;flickr.photosets.getList |  |
| [**getUserPhotos**](PublicApi.md#getUserPhotos) | **GET** /rest?method&#x3D;flickr.people.getPhotos |  |
| [**searchPhotos**](PublicApi.md#searchPhotos) | **GET** /rest?method&#x3D;flickr.photos.search |  |
| [**uploadPhoto**](PublicApi.md#uploadPhoto) | **POST** /upload |  |


<a name="flickrGroupsPoolsGetContext"></a>
# **flickrGroupsPoolsGetContext**
> PublicFlickrGroupsPoolsGetContextResponse flickrGroupsPoolsGetContext(apiKey, photoId).groupId(groupId).execute();



Returns next and previous photos for a photo in a group pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    String groupId = "groupId_example";
    try {
      PublicFlickrGroupsPoolsGetContextResponse result = client
              .public
              .flickrGroupsPoolsGetContext(apiKey, photoId)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getNextphoto());
      System.out.println(result.getPrevphoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#flickrGroupsPoolsGetContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicFlickrGroupsPoolsGetContextResponse> response = client
              .public
              .flickrGroupsPoolsGetContext(apiKey, photoId)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#flickrGroupsPoolsGetContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |
| **groupId** | **String**|  | [optional] |

### Return type

[**PublicFlickrGroupsPoolsGetContextResponse**](PublicFlickrGroupsPoolsGetContextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAccessToken"></a>
# **getAccessToken**
> String getAccessToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthVerifier, oauthToken).execute();



Returns an access token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String oauthConsumerKey = "oauthConsumerKey_example";
    String oauthNonce = "oauthNonce_example";
    String oauthTimestamp = "oauthTimestamp_example";
    String oauthSignatureMethod = "oauthSignatureMethod_example";
    String oauthVersion = "oauthVersion_example";
    String oauthSignature = "oauthSignature_example";
    String oauthVerifier = "oauthVerifier_example";
    String oauthToken = "oauthToken_example";
    try {
      String result = client
              .public
              .getAccessToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthVerifier, oauthToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .public
              .getAccessToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthVerifier, oauthToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauthConsumerKey** | **String**|  | |
| **oauthNonce** | **String**|  | |
| **oauthTimestamp** | **String**|  | |
| **oauthSignatureMethod** | **String**|  | |
| **oauthVersion** | **String**|  | |
| **oauthSignature** | **String**|  | |
| **oauthVerifier** | **String**|  | |
| **oauthToken** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAlbumPhotos"></a>
# **getAlbumPhotos**
> PublicGetAlbumPhotosResponse getAlbumPhotos(apiKey, photosetId).execute();



Returns a list of photos in an album.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photosetId = "photosetId_example";
    try {
      PublicGetAlbumPhotosResponse result = client
              .public
              .getAlbumPhotos(apiKey, photosetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhotoset());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getAlbumPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetAlbumPhotosResponse> response = client
              .public
              .getAlbumPhotos(apiKey, photosetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getAlbumPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photosetId** | **String**|  | |

### Return type

[**PublicGetAlbumPhotosResponse**](PublicGetAlbumPhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFavoritePhotos"></a>
# **getFavoritePhotos**
> PublicGetFavoritePhotosResponse getFavoritePhotos(apiKey, userId).minFaveDate(minFaveDate).maxFaveDate(maxFaveDate).page(page).perPage(perPage).execute();



Returns a list of the user&#39;s favorite photos. Only photos which the calling user has permission to see are returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String userId = "userId_example";
    Double minFaveDate = 3.4D;
    Double maxFaveDate = 3.4D;
    Double page = 3.4D;
    Double perPage = 3.4D;
    try {
      PublicGetFavoritePhotosResponse result = client
              .public
              .getFavoritePhotos(apiKey, userId)
              .minFaveDate(minFaveDate)
              .maxFaveDate(maxFaveDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getPerpage());
      System.out.println(result.getPhotos());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFavoritePhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetFavoritePhotosResponse> response = client
              .public
              .getFavoritePhotos(apiKey, userId)
              .minFaveDate(minFaveDate)
              .maxFaveDate(maxFaveDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFavoritePhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **userId** | **String**|  | |
| **minFaveDate** | **Double**|  | [optional] |
| **maxFaveDate** | **Double**|  | [optional] |
| **page** | **Double**|  | [optional] |
| **perPage** | **Double**|  | [optional] |

### Return type

[**PublicGetFavoritePhotosResponse**](PublicGetFavoritePhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFavoritesContext"></a>
# **getFavoritesContext**
> PublicGetFavoritesContextResponse getFavoritesContext(apiKey, photoId).userId(userId).execute();



Returns next and previous favorites for a photo in a user&#39;s favorites

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    String userId = "userId_example";
    try {
      PublicGetFavoritesContextResponse result = client
              .public
              .getFavoritesContext(apiKey, photoId)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getNextphoto());
      System.out.println(result.getPrevphoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFavoritesContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetFavoritesContextResponse> response = client
              .public
              .getFavoritesContext(apiKey, photoId)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFavoritesContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |
| **userId** | **String**|  | [optional] |

### Return type

[**PublicGetFavoritesContextResponse**](PublicGetFavoritesContextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFlickrTestEcho"></a>
# **getFlickrTestEcho**
> PublicGetFlickrTestEchoResponse getFlickrTestEcho(apiKey).echo(echo).execute();



Echos the input parameters back in the response

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String echo = "echo_example";
    try {
      PublicGetFlickrTestEchoResponse result = client
              .public
              .getFlickrTestEcho(apiKey)
              .echo(echo)
              .execute();
      System.out.println(result);
      System.out.println(result.getEcho());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFlickrTestEcho");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetFlickrTestEchoResponse> response = client
              .public
              .getFlickrTestEcho(apiKey)
              .echo(echo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getFlickrTestEcho");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **echo** | **String**|  | [optional] |

### Return type

[**PublicGetFlickrTestEchoResponse**](PublicGetFlickrTestEchoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGalleryPhotos"></a>
# **getGalleryPhotos**
> PublicGetGalleryPhotosResponse getGalleryPhotos(apiKey, galleryId).execute();



Returns a list of photos in a gallery.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String galleryId = "galleryId_example";
    try {
      PublicGetGalleryPhotosResponse result = client
              .public
              .getGalleryPhotos(apiKey, galleryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhotos());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGalleryPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGalleryPhotosResponse> response = client
              .public
              .getGalleryPhotos(apiKey, galleryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGalleryPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **galleryId** | **String**|  | |

### Return type

[**PublicGetGalleryPhotosResponse**](PublicGetGalleryPhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGroupDiscussionTopics"></a>
# **getGroupDiscussionTopics**
> PublicGetGroupDiscussionTopicsResponse getGroupDiscussionTopics(apiKey).groupId(groupId).page(page).perPage(perPage).execute();



Get a list of discussion topics in a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String groupId = "groupId_example";
    Double page = 3.4D;
    Double perPage = 3.4D;
    try {
      PublicGetGroupDiscussionTopicsResponse result = client
              .public
              .getGroupDiscussionTopics(apiKey)
              .groupId(groupId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getIconfarm());
      System.out.println(result.getIconserver());
      System.out.println(result.getIspoolmoderated());
      System.out.println(result.getLang());
      System.out.println(result.getMembers());
      System.out.println(result.getName());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getPerPage());
      System.out.println(result.getPrivacy());
      System.out.println(result.getTopics());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupDiscussionTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGroupDiscussionTopicsResponse> response = client
              .public
              .getGroupDiscussionTopics(apiKey)
              .groupId(groupId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupDiscussionTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **groupId** | **String**|  | [optional] |
| **page** | **Double**|  | [optional] |
| **perPage** | **Double**|  | [optional] |

### Return type

[**PublicGetGroupDiscussionTopicsResponse**](PublicGetGroupDiscussionTopicsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGroupInfo"></a>
# **getGroupInfo**
> PublicGetGroupInfoResponse getGroupInfo(apiKey).groupId(groupId).groupPathAlias(groupPathAlias).lang(lang).execute();



Get information about a group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String groupId = "groupId_example";
    String groupPathAlias = "groupPathAlias_example";
    String lang = "lang_example";
    try {
      PublicGetGroupInfoResponse result = client
              .public
              .getGroupInfo(apiKey)
              .groupId(groupId)
              .groupPathAlias(groupPathAlias)
              .lang(lang)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroup());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGroupInfoResponse> response = client
              .public
              .getGroupInfo(apiKey)
              .groupId(groupId)
              .groupPathAlias(groupPathAlias)
              .lang(lang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **groupId** | **String**|  | [optional] |
| **groupPathAlias** | **String**|  | [optional] |
| **lang** | **String**|  | [optional] |

### Return type

[**PublicGetGroupInfoResponse**](PublicGetGroupInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGroupPoolPhotos"></a>
# **getGroupPoolPhotos**
> PublicGetGroupPoolPhotosResponse getGroupPoolPhotos(apiKey).groupId(groupId).execute();



Returns a list of pool photos for a given group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String groupId = "groupId_example";
    try {
      PublicGetGroupPoolPhotosResponse result = client
              .public
              .getGroupPoolPhotos(apiKey)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhotos());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupPoolPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGroupPoolPhotosResponse> response = client
              .public
              .getGroupPoolPhotos(apiKey)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupPoolPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **groupId** | **String**|  | [optional] |

### Return type

[**PublicGetGroupPoolPhotosResponse**](PublicGetGroupPoolPhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGroupTopicInfo"></a>
# **getGroupTopicInfo**
> PublicGetGroupTopicInfoResponse getGroupTopicInfo(apiKey, topicId).groupId(groupId).execute();



Get information about a group discussion topic

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String topicId = "topicId_example";
    String groupId = "groupId_example";
    try {
      PublicGetGroupTopicInfoResponse result = client
              .public
              .getGroupTopicInfo(apiKey, topicId)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStat());
      System.out.println(result.getTopic());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupTopicInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGroupTopicInfoResponse> response = client
              .public
              .getGroupTopicInfo(apiKey, topicId)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupTopicInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **topicId** | **String**|  | |
| **groupId** | **String**|  | [optional] |

### Return type

[**PublicGetGroupTopicInfoResponse**](PublicGetGroupTopicInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGroupTopicRepliesInfo"></a>
# **getGroupTopicRepliesInfo**
> PublicGetGroupTopicRepliesInfoResponse getGroupTopicRepliesInfo(apiKey, topicId, replyId).groupId(groupId).execute();



Get information on a group topic reply

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String topicId = "topicId_example";
    String replyId = "replyId_example";
    String groupId = "groupId_example";
    try {
      PublicGetGroupTopicRepliesInfoResponse result = client
              .public
              .getGroupTopicRepliesInfo(apiKey, topicId, replyId)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getReply());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupTopicRepliesInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetGroupTopicRepliesInfoResponse> response = client
              .public
              .getGroupTopicRepliesInfo(apiKey, topicId, replyId)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getGroupTopicRepliesInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **topicId** | **String**|  | |
| **replyId** | **String**|  | |
| **groupId** | **String**|  | [optional] |

### Return type

[**PublicGetGroupTopicRepliesInfoResponse**](PublicGetGroupTopicRepliesInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getOAuthToken"></a>
# **getOAuthToken**
> String getOAuthToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthCallback).execute();



Returns an oauth token and oauth token secret

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String oauthConsumerKey = "oauthConsumerKey_example";
    String oauthNonce = "oauthNonce_example";
    String oauthTimestamp = "oauthTimestamp_example";
    String oauthSignatureMethod = "oauthSignatureMethod_example";
    String oauthVersion = "oauthVersion_example";
    String oauthSignature = "oauthSignature_example";
    String oauthCallback = "oauthCallback_example";
    try {
      String result = client
              .public
              .getOAuthToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthCallback)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getOAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .public
              .getOAuthToken(oauthConsumerKey, oauthNonce, oauthTimestamp, oauthSignatureMethod, oauthVersion, oauthSignature, oauthCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getOAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauthConsumerKey** | **String**|  | |
| **oauthNonce** | **String**|  | |
| **oauthTimestamp** | **String**|  | |
| **oauthSignatureMethod** | **String**|  | |
| **oauthVersion** | **String**|  | |
| **oauthSignature** | **String**|  | |
| **oauthCallback** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPersonInformation"></a>
# **getPersonInformation**
> PublicGetPersonInformationResponse getPersonInformation(apiKey).userId(userId).execute();



Returns a person

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String userId = "userId_example";
    try {
      PublicGetPersonInformationResponse result = client
              .public
              .getPersonInformation(apiKey)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPerson());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPersonInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPersonInformationResponse> response = client
              .public
              .getPersonInformation(apiKey)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPersonInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **userId** | **String**|  | [optional] |

### Return type

[**PublicGetPersonInformationResponse**](PublicGetPersonInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPhotoExif"></a>
# **getPhotoExif**
> PublicGetPhotoExifResponse getPhotoExif(apiKey, photoId).secret(secret).execute();



Retrieves a list of EXIF/TIFF/GPS tags for a given photo. The calling user must have permission to view the photo.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    String secret = "secret_example";
    try {
      PublicGetPhotoExifResponse result = client
              .public
              .getPhotoExif(apiKey, photoId)
              .secret(secret)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoExif");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoExifResponse> response = client
              .public
              .getPhotoExif(apiKey, photoId)
              .secret(secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoExif");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |
| **secret** | **String**|  | [optional] |

### Return type

[**PublicGetPhotoExifResponse**](PublicGetPhotoExifResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPhotoInfo"></a>
# **getPhotoInfo**
> PublicGetPhotoInfoResponse getPhotoInfo(apiKey, photoId).execute();



Returns a photo

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    try {
      PublicGetPhotoInfoResponse result = client
              .public
              .getPhotoInfo(apiKey, photoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoInfoResponse> response = client
              .public
              .getPhotoInfo(apiKey, photoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |

### Return type

[**PublicGetPhotoInfoResponse**](PublicGetPhotoInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | a photo |  -  |

<a name="getPhotoLicenses"></a>
# **getPhotoLicenses**
> PublicGetPhotoLicensesResponse getPhotoLicenses(apiKey).execute();



Fetches a list of available photo licenses for Flickr

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    try {
      PublicGetPhotoLicensesResponse result = client
              .public
              .getPhotoLicenses(apiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getLicenses());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoLicensesResponse> response = client
              .public
              .getPhotoLicenses(apiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |

### Return type

[**PublicGetPhotoLicensesResponse**](PublicGetPhotoLicensesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPhotoListContext"></a>
# **getPhotoListContext**
> PublicGetPhotoListContextResponse getPhotoListContext(apiKey, photoId, photolistId).execute();



Returns next and previous photos in a photo list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    String photolistId = "photolistId_example";
    try {
      PublicGetPhotoListContextResponse result = client
              .public
              .getPhotoListContext(apiKey, photoId, photolistId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getNextphoto());
      System.out.println(result.getPrevphoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoListContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoListContextResponse> response = client
              .public
              .getPhotoListContext(apiKey, photoId, photolistId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoListContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |
| **photolistId** | **String**|  | |

### Return type

[**PublicGetPhotoListContextResponse**](PublicGetPhotoListContextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPhotoSetContext"></a>
# **getPhotoSetContext**
> PublicGetPhotoSetContextResponse getPhotoSetContext(apiKey, photoId).photosetId(photosetId).execute();



Returns next and previous photos for a photo in a set

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    String photosetId = "photosetId_example";
    try {
      PublicGetPhotoSetContextResponse result = client
              .public
              .getPhotoSetContext(apiKey, photoId)
              .photosetId(photosetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getNextphoto());
      System.out.println(result.getPrevphoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoSetContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoSetContextResponse> response = client
              .public
              .getPhotoSetContext(apiKey, photoId)
              .photosetId(photosetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoSetContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |
| **photosetId** | **String**|  | [optional] |

### Return type

[**PublicGetPhotoSetContextResponse**](PublicGetPhotoSetContextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPhotoSizes"></a>
# **getPhotoSizes**
> PublicGetPhotoSizesResponse getPhotoSizes(apiKey, photoId).execute();



Returns photo sizes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    try {
      PublicGetPhotoSizesResponse result = client
              .public
              .getPhotoSizes(apiKey, photoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSizes());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoSizes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotoSizesResponse> response = client
              .public
              .getPhotoSizes(apiKey, photoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotoSizes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |

### Return type

[**PublicGetPhotoSizesResponse**](PublicGetPhotoSizesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Photo sizes |  -  |

<a name="getPhotostreamContext"></a>
# **getPhotostreamContext**
> PublicGetPhotostreamContextResponse getPhotostreamContext(apiKey, photoId).execute();



Returns next and previous photos for a photo in a photostream

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String photoId = "photoId_example";
    try {
      PublicGetPhotostreamContextResponse result = client
              .public
              .getPhotostreamContext(apiKey, photoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getNextphoto());
      System.out.println(result.getPrevphoto());
      System.out.println(result.getStat());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotostreamContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetPhotostreamContextResponse> response = client
              .public
              .getPhotostreamContext(apiKey, photoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getPhotostreamContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photoId** | **String**|  | |

### Return type

[**PublicGetPhotostreamContextResponse**](PublicGetPhotostreamContextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserAlbums"></a>
# **getUserAlbums**
> PublicGetUserAlbumsResponse getUserAlbums(apiKey, userId).page(page).perPage(perPage).execute();



Returns the albums belonging to the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String userId = "userId_example";
    Double page = 3.4D;
    Double perPage = 3.4D;
    try {
      PublicGetUserAlbumsResponse result = client
              .public
              .getUserAlbums(apiKey, userId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getPerpage());
      System.out.println(result.getPhotosets());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserAlbums");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetUserAlbumsResponse> response = client
              .public
              .getUserAlbums(apiKey, userId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserAlbums");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **userId** | **String**|  | |
| **page** | **Double**|  | [optional] |
| **perPage** | **Double**|  | [optional] |

### Return type

[**PublicGetUserAlbumsResponse**](PublicGetUserAlbumsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserPhotos"></a>
# **getUserPhotos**
> PublicGetUserPhotosResponse getUserPhotos(apiKey, userId).safeSearch(safeSearch).minUploadDate(minUploadDate).maxUploadDate(maxUploadDate).minTakenDate(minTakenDate).maxTakenDate(maxTakenDate).contentType(contentType).privacyFilter(privacyFilter).page(page).perPage(perPage).execute();



Return photos from the given user&#39;s photostream

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String userId = "userId_example";
    Double safeSearch = 3.4D;
    Double minUploadDate = 3.4D;
    Double maxUploadDate = 3.4D;
    Double minTakenDate = 3.4D;
    Double maxTakenDate = 3.4D;
    Double contentType = 3.4D;
    Double privacyFilter = 3.4D;
    Double page = 3.4D;
    Double perPage = 3.4D;
    try {
      PublicGetUserPhotosResponse result = client
              .public
              .getUserPhotos(apiKey, userId)
              .safeSearch(safeSearch)
              .minUploadDate(minUploadDate)
              .maxUploadDate(maxUploadDate)
              .minTakenDate(minTakenDate)
              .maxTakenDate(maxTakenDate)
              .contentType(contentType)
              .privacyFilter(privacyFilter)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getPerpage());
      System.out.println(result.getPhotos());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicGetUserPhotosResponse> response = client
              .public
              .getUserPhotos(apiKey, userId)
              .safeSearch(safeSearch)
              .minUploadDate(minUploadDate)
              .maxUploadDate(maxUploadDate)
              .minTakenDate(minTakenDate)
              .maxTakenDate(maxTakenDate)
              .contentType(contentType)
              .privacyFilter(privacyFilter)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#getUserPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **userId** | **String**|  | |
| **safeSearch** | **Double**|  | [optional] |
| **minUploadDate** | **Double**|  | [optional] |
| **maxUploadDate** | **Double**|  | [optional] |
| **minTakenDate** | **Double**|  | [optional] |
| **maxTakenDate** | **Double**|  | [optional] |
| **contentType** | **Double**|  | [optional] |
| **privacyFilter** | **Double**|  | [optional] |
| **page** | **Double**|  | [optional] |
| **perPage** | **Double**|  | [optional] |

### Return type

[**PublicGetUserPhotosResponse**](PublicGetUserPhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="searchPhotos"></a>
# **searchPhotos**
> PublicSearchPhotosResponse searchPhotos(apiKey).text(text).tags(tags).userId(userId).minUploadDate(minUploadDate).maxUploadDate(maxUploadDate).minTakenDate(minTakenDate).maxTakenDate(maxTakenDate).license(license).sort(sort).privacyFilter(privacyFilter).bbox(bbox).accuracy(accuracy).safeSearch(safeSearch).contentType(contentType).machineTags(machineTags).machineTagMode(machineTagMode).groupId(groupId).contacts(contacts).woeId(woeId).placeId(placeId).media(media).hasGeo(hasGeo).geoContext(geoContext).lat(lat).lon(lon).radius(radius).radiusUnits(radiusUnits).isCommons(isCommons).inGallery(inGallery).isGetty(isGetty).perPage(perPage).page(page).execute();



Return a list of photos matching some criteria.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    String text = "text_example"; // A free text search. Photos who's title, description or tags contain the text will be returned. You can exclude results that match a term by prepending it with a - character.
    String tags = "tags_example"; // A comma-delimited list of tags. Photos with one or more of the tags listed will be returned. You can exclude results that match a term by prepending it with a - character.
    String userId = "userId_example"; // The NSID of the user who's photo to search. If this parameter isn't passed then everybody's public photos will be searched. A value of \"me\" will search against the calling user's photos for authenticated calls.
    String minUploadDate = "minUploadDate_example"; // Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date can be in the form of a unix timestamp or mysql datetime.
    String maxUploadDate = "maxUploadDate_example"; // Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date can be in the form of a unix timestamp or mysql datetime.
    String minTakenDate = "minTakenDate_example"; // Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date can be in the form of a mysql datetime or unix timestamp.
    String maxTakenDate = "maxTakenDate_example"; // Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date can be in the form of a mysql datetime or unix timestamp.
    String license = "license_example"; // The license id for photos (for possible values see the flickr.photos.licenses.getInfo method). Multiple licenses may be comma-separated.
    String sort = "sort_example"; // The order in which to sort returned photos. Deafults to date-posted-desc (unless you are doing a radial geo query, in which case the default sorting is by ascending distance from the point specified). The possible values are:   date-posted-asc,   date-posted-desc,   date-taken-asc,   date-taken-desc,   interestingness-desc,   interestingness-asc, and   relevance. 
    Double privacyFilter = 3.4D; // Return photos only matching a certain privacy level. This only applies when making an authenticated call to view photos you own. Valid values are:,   1: public photos,   2: private photos visible to friends,   3: private photos visible to family,   4: private photos visible to friends & family,   5: completely private photos 
    String bbox = "bbox_example"; // A comma-delimited list of 4 values defining the Bounding Box of the area that will be searched.
    String accuracy = "accuracy_example"; // Recorded accuracy level of the location information. Current range is 1-16:   World level is 1   Country is ~3   Region is ~6   City is ~11   Street is ~16 
    Double safeSearch = 3.4D; // Safe search setting:   1: for safe,   2: for moderate,   3: for restricted 
    Double contentType = 3.4D; // Content Type setting:   1: photos only.   2: screenshots only.   3: 'other' only.   4: photos and screenshots.   5: screenshots and 'other'.   6: photos and 'other'.   7: photos, screenshots, and 'other' (all). 
    String machineTags = "machineTags_example"; // Aside from passing in a fully formed machine tag, there is a special syntax for searching on specific properties : Find photos using the 'dc' namespace : \"machine_tags\" => \"dc:\" Find photos with a title in the 'dc' namespace : \"machine_tags\" => \"dc:title=\" Find photos titled \"mr. camera\" in the 'dc' namespace : \"machine_tags\" => \"dc:title=\\\"mr. camera\\\" Find photos whose value is \"mr. camera\" : \"machine_tags\" => \"*:*=\\\"mr. camera\\\"\" Find photos that have a title, in any namespace : \"machine_tags\" => \"*:title=\" Find photos that have a title, in any namespace, whose value is \"mr. camera\" : \"machine_tags\" => \"*:title=\\\"mr. camera\\\"\" Find photos, in the 'dc' namespace whose value is \"mr. camera\" : \"machine_tags\" => \"dc:*=\\\"mr. camera\\\"\" Multiple machine tags may be queried by passing a comma-separated list. The number of machine tags you can pass in a single query depends on the tag mode (AND or OR) that you are querying with. \"AND\" queries are limited to (16) machine tags. \"OR\" queries are limited to (8). 
    String machineTagMode = "machineTagMode_example"; // Either 'any' for an OR combination of tags, or 'all' for an AND combination. Defaults to 'any' if not specified.
    String groupId = "groupId_example"; // The id of a group who's pool to search. If specified, only matching photos posted to the group's pool will be returned.
    String contacts = "contacts_example"; // Search your contacts. Either 'all' or 'ff' for just friends and family. (Experimental)
    String woeId = "woeId_example"; // A 32-bit identifier that uniquely represents spatial entities. (not used if bbox argument is present).
    String placeId = "placeId_example"; // A Flickr place id. (not used if bbox argument is present). Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \"parameterless searches\" for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future). 
    String media = "media_example"; // Filter results by media type. Possible values are all (default), photos or videos
    String hasGeo = "hasGeo_example"; // Any photo that has been geotagged, or if the value is \"0\" any photo that has not been geotagged. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \"parameterless searches\" for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future). 
    String geoContext = "geoContext_example"; // Geo context is a numeric value representing the photo's geotagginess beyond latitude and longitude. For example, you may wish to search for photos that were taken \"indoors\" or \"outdoors\". The current list of context IDs is: 0, not defined. 1, indoors. 2, outdoors. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \"parameterless searches\" for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future). 
    String lat = "lat_example"; // A valid latitude, in decimal format, for doing radial geo queries. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \"parameterless searches\" for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future). 
    String lon = "lon_example"; // A valid longitude, in decimal format, for doing radial geo queries. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \"parameterless searches\" for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future). 
    Double radius = 3.4D; // A valid radius used for geo queries, greater than zero and less than 20 miles (or 32 kilometers), for use with point-based geo queries. The default value is 5 (km).
    String radiusUnits = "radiusUnits_example"; // The unit of measure when doing radial geo queries. Valid options are \"mi\" (miles) and \"km\" (kilometers). The default is \"km\".
    Boolean isCommons = true; // Limit the scope of the search to only photos that are part of the Flickr Commons project. Default is false.
    Boolean inGallery = true; // Limit the scope of the search to only photos that are in a gallery? Default is false, search all photos.
    Boolean isGetty = true; // Limit the scope of the search to only photos that are for sale on Getty. Default is false.
    Double perPage = 3.4D; // Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500.
    Double page = 3.4D; // The page of results to return. If this argument is omitted, it defaults to 1.
    try {
      PublicSearchPhotosResponse result = client
              .public
              .searchPhotos(apiKey)
              .text(text)
              .tags(tags)
              .userId(userId)
              .minUploadDate(minUploadDate)
              .maxUploadDate(maxUploadDate)
              .minTakenDate(minTakenDate)
              .maxTakenDate(maxTakenDate)
              .license(license)
              .sort(sort)
              .privacyFilter(privacyFilter)
              .bbox(bbox)
              .accuracy(accuracy)
              .safeSearch(safeSearch)
              .contentType(contentType)
              .machineTags(machineTags)
              .machineTagMode(machineTagMode)
              .groupId(groupId)
              .contacts(contacts)
              .woeId(woeId)
              .placeId(placeId)
              .media(media)
              .hasGeo(hasGeo)
              .geoContext(geoContext)
              .lat(lat)
              .lon(lon)
              .radius(radius)
              .radiusUnits(radiusUnits)
              .isCommons(isCommons)
              .inGallery(inGallery)
              .isGetty(isGetty)
              .perPage(perPage)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getPerpage());
      System.out.println(result.getPhotos());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#searchPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicSearchPhotosResponse> response = client
              .public
              .searchPhotos(apiKey)
              .text(text)
              .tags(tags)
              .userId(userId)
              .minUploadDate(minUploadDate)
              .maxUploadDate(maxUploadDate)
              .minTakenDate(minTakenDate)
              .maxTakenDate(maxTakenDate)
              .license(license)
              .sort(sort)
              .privacyFilter(privacyFilter)
              .bbox(bbox)
              .accuracy(accuracy)
              .safeSearch(safeSearch)
              .contentType(contentType)
              .machineTags(machineTags)
              .machineTagMode(machineTagMode)
              .groupId(groupId)
              .contacts(contacts)
              .woeId(woeId)
              .placeId(placeId)
              .media(media)
              .hasGeo(hasGeo)
              .geoContext(geoContext)
              .lat(lat)
              .lon(lon)
              .radius(radius)
              .radiusUnits(radiusUnits)
              .isCommons(isCommons)
              .inGallery(inGallery)
              .isGetty(isGetty)
              .perPage(perPage)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#searchPhotos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **text** | **String**| A free text search. Photos who&#39;s title, description or tags contain the text will be returned. You can exclude results that match a term by prepending it with a - character. | [optional] |
| **tags** | **String**| A comma-delimited list of tags. Photos with one or more of the tags listed will be returned. You can exclude results that match a term by prepending it with a - character. | [optional] |
| **userId** | **String**| The NSID of the user who&#39;s photo to search. If this parameter isn&#39;t passed then everybody&#39;s public photos will be searched. A value of \&quot;me\&quot; will search against the calling user&#39;s photos for authenticated calls. | [optional] |
| **minUploadDate** | **String**| Minimum upload date. Photos with an upload date greater than or equal to this value will be returned. The date can be in the form of a unix timestamp or mysql datetime. | [optional] |
| **maxUploadDate** | **String**| Maximum upload date. Photos with an upload date less than or equal to this value will be returned. The date can be in the form of a unix timestamp or mysql datetime. | [optional] |
| **minTakenDate** | **String**| Minimum taken date. Photos with an taken date greater than or equal to this value will be returned. The date can be in the form of a mysql datetime or unix timestamp. | [optional] |
| **maxTakenDate** | **String**| Maximum taken date. Photos with an taken date less than or equal to this value will be returned. The date can be in the form of a mysql datetime or unix timestamp. | [optional] |
| **license** | **String**| The license id for photos (for possible values see the flickr.photos.licenses.getInfo method). Multiple licenses may be comma-separated. | [optional] |
| **sort** | **String**| The order in which to sort returned photos. Deafults to date-posted-desc (unless you are doing a radial geo query, in which case the default sorting is by ascending distance from the point specified). The possible values are:   date-posted-asc,   date-posted-desc,   date-taken-asc,   date-taken-desc,   interestingness-desc,   interestingness-asc, and   relevance.  | [optional] |
| **privacyFilter** | **Double**| Return photos only matching a certain privacy level. This only applies when making an authenticated call to view photos you own. Valid values are:,   1: public photos,   2: private photos visible to friends,   3: private photos visible to family,   4: private photos visible to friends &amp; family,   5: completely private photos  | [optional] |
| **bbox** | **String**| A comma-delimited list of 4 values defining the Bounding Box of the area that will be searched. | [optional] |
| **accuracy** | **String**| Recorded accuracy level of the location information. Current range is 1-16:   World level is 1   Country is ~3   Region is ~6   City is ~11   Street is ~16  | [optional] |
| **safeSearch** | **Double**| Safe search setting:   1: for safe,   2: for moderate,   3: for restricted  | [optional] |
| **contentType** | **Double**| Content Type setting:   1: photos only.   2: screenshots only.   3: &#39;other&#39; only.   4: photos and screenshots.   5: screenshots and &#39;other&#39;.   6: photos and &#39;other&#39;.   7: photos, screenshots, and &#39;other&#39; (all).  | [optional] |
| **machineTags** | **String**| Aside from passing in a fully formed machine tag, there is a special syntax for searching on specific properties : Find photos using the &#39;dc&#39; namespace : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;dc:\&quot; Find photos with a title in the &#39;dc&#39; namespace : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;dc:title&#x3D;\&quot; Find photos titled \&quot;mr. camera\&quot; in the &#39;dc&#39; namespace : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;dc:title&#x3D;\\\&quot;mr. camera\\\&quot; Find photos whose value is \&quot;mr. camera\&quot; : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;*:*&#x3D;\\\&quot;mr. camera\\\&quot;\&quot; Find photos that have a title, in any namespace : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;*:title&#x3D;\&quot; Find photos that have a title, in any namespace, whose value is \&quot;mr. camera\&quot; : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;*:title&#x3D;\\\&quot;mr. camera\\\&quot;\&quot; Find photos, in the &#39;dc&#39; namespace whose value is \&quot;mr. camera\&quot; : \&quot;machine_tags\&quot; &#x3D;&gt; \&quot;dc:*&#x3D;\\\&quot;mr. camera\\\&quot;\&quot; Multiple machine tags may be queried by passing a comma-separated list. The number of machine tags you can pass in a single query depends on the tag mode (AND or OR) that you are querying with. \&quot;AND\&quot; queries are limited to (16) machine tags. \&quot;OR\&quot; queries are limited to (8).  | [optional] |
| **machineTagMode** | **String**| Either &#39;any&#39; for an OR combination of tags, or &#39;all&#39; for an AND combination. Defaults to &#39;any&#39; if not specified. | [optional] |
| **groupId** | **String**| The id of a group who&#39;s pool to search. If specified, only matching photos posted to the group&#39;s pool will be returned. | [optional] |
| **contacts** | **String**| Search your contacts. Either &#39;all&#39; or &#39;ff&#39; for just friends and family. (Experimental) | [optional] |
| **woeId** | **String**| A 32-bit identifier that uniquely represents spatial entities. (not used if bbox argument is present). | [optional] |
| **placeId** | **String**| A Flickr place id. (not used if bbox argument is present). Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \&quot;parameterless searches\&quot; for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future).  | [optional] |
| **media** | **String**| Filter results by media type. Possible values are all (default), photos or videos | [optional] |
| **hasGeo** | **String**| Any photo that has been geotagged, or if the value is \&quot;0\&quot; any photo that has not been geotagged. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \&quot;parameterless searches\&quot; for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future).  | [optional] |
| **geoContext** | **String**| Geo context is a numeric value representing the photo&#39;s geotagginess beyond latitude and longitude. For example, you may wish to search for photos that were taken \&quot;indoors\&quot; or \&quot;outdoors\&quot;. The current list of context IDs is: 0, not defined. 1, indoors. 2, outdoors. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \&quot;parameterless searches\&quot; for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future).  | [optional] |
| **lat** | **String**| A valid latitude, in decimal format, for doing radial geo queries. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \&quot;parameterless searches\&quot; for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future).  | [optional] |
| **lon** | **String**| A valid longitude, in decimal format, for doing radial geo queries. Geo queries require some sort of limiting agent in order to prevent the database from crying. This is basically like the check against \&quot;parameterless searches\&quot; for queries without a geo component. A tag, for instance, is considered a limiting agent as are user defined min_date_taken and min_date_upload parameters — If no limiting factor is passed we return only photos added in the last 12 hours (though we may extend the limit in the future).  | [optional] |
| **radius** | **Double**| A valid radius used for geo queries, greater than zero and less than 20 miles (or 32 kilometers), for use with point-based geo queries. The default value is 5 (km). | [optional] |
| **radiusUnits** | **String**| The unit of measure when doing radial geo queries. Valid options are \&quot;mi\&quot; (miles) and \&quot;km\&quot; (kilometers). The default is \&quot;km\&quot;. | [optional] |
| **isCommons** | **Boolean**| Limit the scope of the search to only photos that are part of the Flickr Commons project. Default is false. | [optional] |
| **inGallery** | **Boolean**| Limit the scope of the search to only photos that are in a gallery? Default is false, search all photos. | [optional] |
| **isGetty** | **Boolean**| Limit the scope of the search to only photos that are for sale on Getty. Default is false. | [optional] |
| **perPage** | **Double**| Number of photos to return per page. If this argument is omitted, it defaults to 100. The maximum allowed value is 500. | [optional] |
| **page** | **Double**| The page of results to return. If this argument is omitted, it defaults to 1. | [optional] |

### Return type

[**PublicSearchPhotosResponse**](PublicSearchPhotosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="uploadPhoto"></a>
# **uploadPhoto**
> Object uploadPhoto(apiKey, photo, publicUploadPhotoRequest).tags(tags).title(title).description(description).contentType(contentType).hidden(hidden).isFamily(isFamily).isFriend(isFriend).isPublic(isPublic).safetyLevel(safetyLevel).execute();



Uploads a new photo to Flickr

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Flickr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.flickr.com/services";
    Flickr client = new Flickr(configuration);
    String apiKey = "apiKey_example";
    File photo = new File("/path/to/file");
    String tags = "tags_example";
    String title = "title_example";
    String description = "description_example";
    String contentType = "1";
    String hidden = "1";
    String isFamily = "0";
    String isFriend = "0";
    String isPublic = "0";
    String safetyLevel = "1";
    try {
      Object result = client
              .public
              .uploadPhoto(apiKey, photo)
              .tags(tags)
              .title(title)
              .description(description)
              .contentType(contentType)
              .hidden(hidden)
              .isFamily(isFamily)
              .isFriend(isFriend)
              .isPublic(isPublic)
              .safetyLevel(safetyLevel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#uploadPhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .public
              .uploadPhoto(apiKey, photo)
              .tags(tags)
              .title(title)
              .description(description)
              .contentType(contentType)
              .hidden(hidden)
              .isFamily(isFamily)
              .isFriend(isFriend)
              .isPublic(isPublic)
              .safetyLevel(safetyLevel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#uploadPhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |
| **photo** | **File**|  | |
| **publicUploadPhotoRequest** | [**PublicUploadPhotoRequest**](PublicUploadPhotoRequest.md)|  | |
| **tags** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] [enum: 1, 2, 3] |
| **hidden** | **String**|  | [optional] [enum: 1, 2] |
| **isFamily** | **String**|  | [optional] [enum: 0, 1] |
| **isFriend** | **String**|  | [optional] [enum: 0, 1] |
| **isPublic** | **String**|  | [optional] [enum: 0, 1] |
| **safetyLevel** | **String**|  | [optional] [enum: 1, 2, 3] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

