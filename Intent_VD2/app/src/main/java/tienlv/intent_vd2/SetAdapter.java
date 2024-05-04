package tienlv.intent_vd2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.ViewHolder> {
    static ArrayList<SetModel> ds;
    static Context context;

    public SetAdapter(ArrayList<SetModel> ds, Context context) {
        this.ds = ds;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item, parent, false);
        ViewHolder view = new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SetModel select = ds.get(position);
        String ten = select.getTenMH();
        int img_id = select.getImg();
        holder.name.setText(ten);
        holder.img.setImageResource(img_id);
    }

    @Override
    public int getItemCount() {
        return ds.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            img = itemView.findViewById(R.id.imgSubject);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        SetModel selectedSet = ds.get(position);
                        String select = selectedSet.getTenMH();
                        Intent i = new Intent(context, QuestionActivity.class);
                        i.putExtra("set", select);
                        context.startActivity(i);
                    }
                }
            });
        }
    }
}
