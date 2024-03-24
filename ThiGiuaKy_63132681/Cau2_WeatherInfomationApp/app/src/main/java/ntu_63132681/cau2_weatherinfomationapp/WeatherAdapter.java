package ntu_63132681.cau2_weatherinfomationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class WeatherAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Weather> ds;
    private LayoutInflater layoutInflater;

    public WeatherAdapter(Context context, ArrayList<Weather> ds) {
        this.context = context;
        this.ds = ds;
        this.layoutInflater = layoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return ds.size();
    }

    @Override
    public Object getItem(int position) {
        return ds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
