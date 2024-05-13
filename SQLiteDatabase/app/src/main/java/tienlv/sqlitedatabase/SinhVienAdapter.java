package tienlv.sqlitedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SinhVienAdapter extends RecyclerView .Adapter<SinhVienAdapter.RecycleViewHolder>{
    Context context;
    ArrayList<SinhVien> ds;

    public SinhVienAdapter(Context context, ArrayList<SinhVien> ds) {
        this.context = context;
        this.ds = ds;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.item, parent, false);
        RecycleViewHolder r = new RecycleViewHolder(v);
        return r;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        SinhVien selected = ds.get(position);
        holder.tvTen.setText(selected.getTen());
        holder.tvid.setText(String.valueOf(selected.getId()));
    }

    @Override
    public int getItemCount() {
        return ds.size();
    }


    public static class RecycleViewHolder extends RecyclerView.ViewHolder{
        TextView tvTen, tvid;
        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTen = itemView.findViewById(R.id.tvTen);
            tvid = itemView.findViewById(R.id.tvId);
        }
    }

}
