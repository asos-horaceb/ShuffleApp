package com.asos.getintotechnology.shuffleapp.network;

import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;

/**
 * This will call the product api and bring back a list of products.
 */
public class ProductService {

    private static final String API_URL = "http://";

    private final RestAdapter adapter;

    private OnResultListener listener;

    public interface OnResultListener {
        void displayProducts(final List<Product> products);

        void displayError(final String errorMessage);
    }

    public ProductService(final OnResultListener listener) {
        final RestAdapterCreator creator = new RestAdapterCreator(API_URL);
        adapter = creator.createAdapter();
        this.listener = listener;
    }

    public void getProducts() {
        final ProductApi api = adapter.create(ProductApi.class);
        api.getProducts(this);
    }

    @Override
    public void success(final Products products, final Response response) {
        listener.displayProducts();
    }

    @Override
    public void failure(final RetrofitError error) {
        listener.displayError(error.getMessage());
    }

    private interface ProductApi {

        @GET("")
        void getProducts(Callback<Products> callback);

    }
}
