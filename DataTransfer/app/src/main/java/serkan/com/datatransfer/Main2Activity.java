package serkan.com.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtad=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();

        String gelendeger=intent.getStringExtra("giden");

        txtad.setText(gelendeger);

    }
}
