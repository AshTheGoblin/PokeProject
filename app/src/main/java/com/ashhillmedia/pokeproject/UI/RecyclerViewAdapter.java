package com.ashhillmedia.pokeproject.UI;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.R;

import java.util.List;

public class RecyclerViewAdapter extends PagedListAdapter<NamedAPIResource,RecyclerViewAdapter.MyViewHolder> {

  //  private List<NamedAPIResource> values;

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

    // Provide a suitable constructor (depends on the kind of dataset)
    // public RecyclerViewAdapter(List<NamedAPIResource> values) {
    public RecyclerViewAdapter(){
        super(DIFF_CALLBACK);
      //  this.values=values;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
        return new MyViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        NamedAPIResource item = getItem(position);
        String message = item.getName();
        String url = item.getUrl();
        holder.textView.setText(message + " : " + url);

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView textView;

        MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.list_item_pagination_text);
        }
    }
}
