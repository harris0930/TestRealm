package com.kingwaytek.testrealm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

/**
 * Created by Kingwaytek on 2016/12/9.
 */
public class CityAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    private List<City> cities = null;

    public CityAdapter(Context context) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setData(List<City> detail) {
        this.cities = detail;
    }


    @Override
    public int getCount() {
        if(cities==null){
            return 0;
        }
        return cities.size();
    }

    @Override
    public Object getItem(int position) {
        if (cities == null || cities.get(position) == null) {
            return null;
        }
        return cities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.city_listitem, parent, false);
        }

        City city = cities.get(position);

        if (city != null) {
            ((TextView) convertView.findViewById(R.id.name)).setText(city.getName());
            ((TextView) convertView.findViewById(R.id.votes)).setText(String.format(Locale.US, "%d",city.getVotes()));
        }

        return convertView;
    }
}
