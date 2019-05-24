package com.ashhillmedia.pokeproject.UI;

import android.arch.paging.PagedListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.R;

public class PokemonListAdapter extends PagedListAdapter<NamedAPIResource,PokemonListAdapter.MyViewHolder> {

    public static final DiffUtil.ItemCallback<NamedAPIResource> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<NamedAPIResource>() {
                @Override
                public boolean areItemsTheSame(NamedAPIResource oldItem, NamedAPIResource newItem) {
                    return oldItem.getName() == newItem.getName();
                }
                @Override
                public boolean areContentsTheSame(NamedAPIResource oldItem, NamedAPIResource newItem) {
                    return (oldItem.getName() == newItem.getName() && oldItem.getUrl() == newItem.getUrl());
                }
            };

    public PokemonListAdapter(){
        super(DIFF_CALLBACK);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NamedAPIResource item = getItem(position);
        String message = item.getName();
        String url = item.getUrl();
        holder.textView.setText(message + " : " + url);

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.list_item_pagination_text);
        }
    }
}
