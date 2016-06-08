package tkosen.com.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_info = (TextView)findViewById(R.id.txt_info);

        String name = getIntent().getExtras().getString("name");
        String surname = getIntent().getExtras().getString("surname");
        String email = getIntent().getExtras().getString("email");
        String phone = getIntent().getExtras().getString("phone");

        txt_info.setText(name + " " + surname + " " + phone + " " + email );
    }
}
