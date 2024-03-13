package tienlv.listviewthemsuaxoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtViTri, edtGiaTri;
    Button btnThem, btnSua, btnXoa;
    ListView lvDS;
    ArrayList<String> ds;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ds.add("Lập trình di động");
        ds.add("Kiến trúc và thiết kế phần mềm");
        ds.add("Quản lý dự án phần mềm");
        ds.add("Công nghệ phần mềm");
        ds.add("Thiết kế web");
        ds.add("Kĩ thuật lập trình");
        ds.add("Nhập môn lập trình");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ds);
        lvDS.setAdapter(adapter);
        lvDS.setOnItemClickListener(boLangNghe);
        btnSua.setOnClickListener(boLangNgheSuaItem);
    }

    void init(){
        edtViTri = findViewById(R.id.edtViTri);
        edtGiaTri = findViewById(R.id.edtGiaTri);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);
        lvDS = findViewById(R.id.lvDS);
        ds = new ArrayList<>();
    }
    AdapterView.OnItemClickListener boLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            edtViTri.setText(String.valueOf(position));
            edtGiaTri.setText(String.valueOf(ds.get(position)));
            String selected = "Bạn chọn " + ds.get(position);
            Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener boLangNgheSuaItem = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str_viTri = edtViTri.getText().toString();
            if(str_viTri.isEmpty()){
                Toast.makeText(MainActivity.this, "Không có giá trị phù hợp để thay đổi!\nHãy chọn Item bên dưới nếu cần thay đổi...", Toast.LENGTH_SHORT).show();
            }
            else{
                String str_giaTri = edtGiaTri.getText().toString();
                if(ds.get(Integer.parseInt(str_viTri)).equals(str_giaTri)){
                    Toast.makeText(MainActivity.this, "Không có sự thay đổi!", Toast.LENGTH_SHORT).show();
                }
                else{
                    int index = Integer.parseInt(str_viTri);
                    ds.set(index, str_giaTri);
                    Toast.makeText(MainActivity.this, "Đã thay đổi thành công!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

    public void RemoveItem(View v){
        String str_viTri = edtViTri.getText().toString();
        if(str_viTri.isEmpty()){
            Toast.makeText(MainActivity.this, "Không có phần tử nào để xóa!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Đã xóa thành công phần tử " + ds.get(Integer.parseInt(str_viTri)), Toast.LENGTH_SHORT).show();
            ds.remove(Integer.parseInt(str_viTri));
            lvDS.setAdapter(adapter);
            edtGiaTri.setText("");
            edtViTri.setText("");
        }
    }

    public void AddItem(View v){
        String str_GiaTri = edtGiaTri.getText().toString();
        if(str_GiaTri.isEmpty()){
            Toast.makeText(this, "Không có giá trị để thêm vào!", Toast.LENGTH_SHORT).show();
        }
        else{
            for (String i : ds){
                if(str_GiaTri.equals(i.toString())){
                    Toast.makeText(this, "Đã có phần tử này rồi!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
            ds.add(str_GiaTri);
            lvDS.setAdapter(adapter);
            edtGiaTri.setText("");
            edtViTri.setText("");
            Toast.makeText(this, "Đã thêm thành công!", Toast.LENGTH_SHORT).show();
        }
    }
}