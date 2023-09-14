package database.stmik.com.pertemuan14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    Bundle kirim = new Bundle();
    Intent data = new Intent(createPackageContext(MainActivity.this,ClassTampung.class);
    Kirim.putString("DT1", datakirim);
    data.putExtras(Kirim);
    startActivity(data);

