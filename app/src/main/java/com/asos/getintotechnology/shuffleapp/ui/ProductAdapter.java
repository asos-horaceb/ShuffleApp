package com.asos.getintotechnology.shuffleapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.asos.getintotechnology.shuffleapp.R;
import com.asos.getintotechnology.shuffleapp.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Takes a list of products and provides them to the list/ grid of items.
 * <p/>
 * Created by horace.bellgam on 22/02/16.
 */
public class ProductAdapter extends ArrayAdapter<Product> {

    private final LayoutInflater inflater;

    private final List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        super(context, R.layout.list_item_product);
        this.products = products;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = inflater.inflate(R.layout.list_item_product, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder.productName.setText(getItem(position).getName());
        holder.productPrice.setText(getItem(position).getPrice().getCurrent().getText());
        Picasso.with(getContext())
                .load(getItem(position).getImages().get(0).getUrl())
                .into(holder.imageView);

        return convertView;
    }

    @Override
    public Product getItem(int position) {
        return products.get(position);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    static final class ViewHolder {

        @Bind(R.id.product_name)
        TextView productName;

        @Bind(R.id.product_image)
        ImageView imageView;

        @Bind(R.id.product_price)
        TextView productPrice;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
