package tienlv.examlist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView tilte, time, graduate;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tilte = itemView.findViewById(R.id.item_title);
        time = itemView.findViewById(R.id.item_time);
        graduate = itemView.findViewById(R.id.item_graduate);
    }
}
