package br.com.scalasoft.alvaro.weather.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.scalasoft.alvaro.weather.R;

/**
 * Created by alvaro on 02/06/15.
 */
public class Adapter extends ArrayAdapter<String> {

    public Adapter(Context context, ArrayList<String> arr) {
        super(context, 0, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String str = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.list_item_forecast);
        // Populate the data into the template view using the data object
        tvName.setText(str);
        // Return the completed view to render on screen
        return convertView;
    }
}
