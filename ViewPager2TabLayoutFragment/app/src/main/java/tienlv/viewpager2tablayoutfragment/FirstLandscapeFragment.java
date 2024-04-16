package tienlv.viewpager2tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstLandscapeFragment extends Fragment {
    Landscape landscape;
    public FirstLandscapeFragment(Landscape landscape) {
        this.landscape = landscape;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_first_landscape, container, false);
        TextView tilte = v.findViewById(R.id.item_title);
        ImageView img = v.findViewById(R.id.item_img);
        tilte.setText(landscape.getTilte());
        img.setImageResource(landscape.getImg());
        return v;
    }
}