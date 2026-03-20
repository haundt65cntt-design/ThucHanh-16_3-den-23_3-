package tiil.edu.baith7_listview1;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import tiil.edu.baith7_listview1.R;

public class MainActivity extends AppCompatActivity {

    // Khai báo biến ListView
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);

        // Đây là danh sách các chuỗi sẽ hiển thị trên ListView
        String[] values = new String[] {
                "Việt Nam",
                "Trung Quốc",
                "Triều Tiên",
                "Cuba",
                "Hoa Kỳ",
                "Nhật Bản",
                "Hàn Quốc"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                values
        );

        listView.setAdapter(adapter);
    }
}