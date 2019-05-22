package com.ashhillmedia.pokeproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.Pokemon;

import java.util.List;

public class PokemonListAdapter extends ArrayAdapter<NamedAPIResource> {

    private Context context;
    private List<NamedAPIResource> values;

    public PokemonListAdapter(Context context, List<NamedAPIResource> values) {
        super(context, R.layout.list_item_pagination, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

        NamedAPIResource item = values.get(position);
        String message = item.getName();
        String url = item.getUrl();
        textView.setText(message + ": " + url);

        return row;

    }
}