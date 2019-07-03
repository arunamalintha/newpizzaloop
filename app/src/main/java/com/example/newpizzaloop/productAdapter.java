package com.example.newpizzaloop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context mctx;
    private List<ProductAdapter> productList;


    public ProductAdapter(Context mctx, List<com.example.newpizzaloop.ProductAdapter> productList) {
        this.mctx = mctx;
        this.productList = productList;
    }

    public ProductAdapter(MainActivity mctx, List<product> productList) {

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mctx);
        View view = inflater.inflate(R.layout.list_layout,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductAdapter product = productList.get(position);


        holder.textViewTitle.setText(product.getTitlt());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mctx.getResources().getDrawable(product.getImage()));
    }

    private char getImage() {
        return 0;
    }

    private int getPrice() {
        return 0;
    }

    private float getRating() {
        return 0;
    }

    private char getShortdesc() {
        return 0;
    }

    private char getTitlt() {
        return 0;
    }


   public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
