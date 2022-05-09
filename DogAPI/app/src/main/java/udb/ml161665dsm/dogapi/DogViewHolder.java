package udb.ml161665dsm.dogapi;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import udb.ml161665dsm.dogapi.databinding.ItemDogBinding;

public class DogViewHolder extends RecyclerView.ViewHolder{

    private ItemDogBinding itemDogBinding;
    public DogViewHolder(View view) {
        super(view);
        itemDogBinding = ItemDogBinding.bind(view);
    }
    public void bind(String imageUrl) {
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog);
    }
}
