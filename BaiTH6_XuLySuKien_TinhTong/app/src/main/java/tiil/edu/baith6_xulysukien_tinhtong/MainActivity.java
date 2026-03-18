package tiil.edu.baith6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    // Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void XuLyCong(View view) {
        // Tìm, tham chiếu đến điều khển trên XML, mapping sang java file
        EditText  EditTextSoA = findViewById(R.id.edtA);
        EditText  EditTextSoB = findViewById(R.id.edtB);
        EditText  EditTextKetQua = findViewById(R.id.edtKQ);
        // Lấy dữ liệu về ở điều khiển số a
        String strA = EditTextSoA.getText().toString(); //strA ="2"
        // Lấy dữ liệu về ở điều khiển số b
        String strB = EditTextSoB.getText().toString(); //strB ="4"
        // Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA); //2
        int so_B = Integer.parseInt(strB); //4
        // Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); // Chuyển sang dạng chuỗi
        // Hiện ra màn hình
        EditTextKetQua.setText(strTong);
    }
}