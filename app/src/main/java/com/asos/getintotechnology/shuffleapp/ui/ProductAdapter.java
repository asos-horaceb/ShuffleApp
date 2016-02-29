package com.asos.getintotechnology.shuffleapp.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.asos.getintotechnology.shuffleapp.R;
import com.asos.getintotechnology.shuffleapp.ShuffleApplication;
import com.asos.getintotechnology.shuffleapp.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Adapter for loading the list of products to the {@link RecyclerView}.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> products;
    private Context context;
    private LayoutInflater layoutInflater;

    public ProductAdapter(Context context, List<Product> products) {
        this.products = products;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int resourceViewId = R.layout.list_item_product;
        View view = layoutInflater.inflate(resourceViewId, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        final Product product = products.get(position);
        holder.productName.setText(product.getName());
        holder.productPrice.setText(product.getPrice().getCurrent().getText());
        Picasso.with(context)
            .load(product.getImages().get(0).getUrl())
            .into(holder.imageView);
        final String url = product.getImages().get(0).getUrl();

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetailsActivity.class);
                intent.putExtra(ProductDetailsActivity.KEY_URL, url);
                context.startActivity(intent);


            }
        });

        holder.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShuffleApplication.savedProducts.add(product);
                Toast.makeText(context,"Item Saved Successfully "+    ShuffleApplication.savedProducts.size()+" saved products",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.product_name)
        TextView productName;

        @Bind(R.id.product_image)
        ImageView imageView;

        @Bind(R.id.product_price)
        TextView productPrice;

        @Bind(R.id.imageButton)
        ImageButton save;


        ProductViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
