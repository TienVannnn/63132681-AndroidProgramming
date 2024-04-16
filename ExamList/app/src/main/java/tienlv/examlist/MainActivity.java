package tienlv.examlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> ds;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        ds = new ArrayList<>();
        ds.add(new Item("First Exam", "16/04/2024", "Try your best!"));
        ds.add(new Item("Second Exam", "16/04/2024", "Good Luck!"));
        ds.add(new Item("Third Exam", "16/04/2024", "Be your Luck!"));
        ds.add(new Item("The Next Exam", "16/04/2024", "Be your Luck!"));
        ds.add(new Item("The Next  Exam", "16/04/2024", "Be your Luck!"));
        ds.add(new Item("The Last Exam", "16/04/2024", "Good Luck!"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, ds));
    }
}