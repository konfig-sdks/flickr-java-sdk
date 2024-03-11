package com.konfigthis.client;

import com.konfigthis.client.api.PublicApi;

public class Flickr {
    private ApiClient apiClient;
    public final PublicApi public;

    public Flickr() {
        this(null);
    }

    public Flickr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.public = new PublicApi(this.apiClient);
    }

}
