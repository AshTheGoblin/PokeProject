package com.ashhillmedia.pokeproject.UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<NamedAPIResource> values;
    private LayoutInflater inflater;

    // Provide a suitable constructor (depends on the kind of dataset)
     RecyclerViewAdapter(Context context, List<NamedAPIResource> values) {
        this.inflater = LayoutInflater.from(context);
        this.values = values;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View view = inflater.inflate(R.layout.card_view_item, parent, false);
        return new MyViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        NamedAPIResource item = values.get(position);
        String message = item.getName();
        String url = item.getUrl();
        holder.textView.setText(message + " : " + url);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
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
