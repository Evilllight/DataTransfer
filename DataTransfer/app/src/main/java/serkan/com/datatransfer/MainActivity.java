package serkan.com.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editAd,editSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAd=(EditText)findViewById(R.id.editText3);
        editSoyad=(EditText)findViewById(R.id.editText4);


    }
    public void gonder(View view){
        String ad=String.valueOf(editAd.getText());
        String soyad=editSoyad.getText().toString();
        String adSoyad=ad+" "+soyad;

        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("giden",adSoyad);
        startActivity(intent);
    }
}
