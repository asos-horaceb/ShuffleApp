package com.asos.getintotechnology.shuffleapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.asos.getintotechnology.shuffleapp.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProductDetailsActivity extends AppCompatActivity {

    @Bind(R.id.imageView)
    ImageView mImageView;
    public static String KEY_URL = "URL";

    String url = "https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/768px-Chelsea_FC.svg.png";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        ButterKnife.bind(this);
        setTitle("Product Details");
        url = getIntent().getExtras().getString(KEY_URL);
        Picasso.with(this)
            .load(url)
            .into(mImageView);

    }
}
