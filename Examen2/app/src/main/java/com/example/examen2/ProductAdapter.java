package com.example.examen2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    public ProductAdapter(@NonNull Context context, @NonNull List<Product> products) {
        super(context, 0, products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_product, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewProduct);
        TextView nameTextView = convertView.findViewById(R.id.textViewProductName);
        TextView priceTextView = convertView.findViewById(R.id.textViewProductPrice);

        if (product != null) {
            imageView.setImageResource(product.getImage());
            nameTextView.setText(product.getName());
            priceTextView.setText(String.valueOf(product.getPrice()));
        }

        return convertView;
    }
}
