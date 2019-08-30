# DefaultApi

All URIs are relative to *https://ron-swanson-quotes.herokuapp.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quotesCountGet**](DefaultApi.md#quotesCountGet) | **GET** /quotes/{count} | 
[**quotesGet**](DefaultApi.md#quotesGet) | **GET** /quotes | 



## quotesCountGet

> List&lt;String&gt; quotesCountGet(count)



Returns {count} quotes in an array

### Example

```java
// Import classes:
import net.alexherman.example.ApiClient;
import net.alexherman.example.ApiException;
import net.alexherman.example.Configuration;
import net.alexherman.example.models.*;
import net.alexherman.example.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ron-swanson-quotes.herokuapp.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer count = 56; // Integer | 
        try {
            List<String> result = apiInstance.quotesCountGet(count);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#quotesCountGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**|  |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## quotesGet

> List&lt;String&gt; quotesGet()



Returns a single Ron Swanson quote wrapped in an array

### Example

```java
// Import classes:
import net.alexherman.example.ApiClient;
import net.alexherman.example.ApiException;
import net.alexherman.example.Configuration;
import net.alexherman.example.models.*;
import net.alexherman.example.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ron-swanson-quotes.herokuapp.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<String> result = apiInstance.quotesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#quotesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

