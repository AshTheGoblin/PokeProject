package com.ashhillmedia.pokeproject.UI;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.R;


public class PokemonListAdapter extends PagedListAdapter<NamedAPIResource, PokemonListAdapter.MyViewHolder> {

    private Context context;

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

    public PokemonListAdapter(Context context) {
        super(DIFF_CALLBACK);
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NamedAPIResource item = getItem(position);
        final String message = item.getName();
        final String url = item.getUrl();
        holder.textView.setText(message + " : " + url);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", message);
                bundle.putString("url", url);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.list_item_pagination_text);
        }
    }


}
