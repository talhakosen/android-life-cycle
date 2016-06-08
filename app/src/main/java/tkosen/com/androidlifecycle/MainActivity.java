package tkosen.com.androidlifecycle;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.this.getClass().getSimpleName();
    private Button btn;
    private EditText edt_name,edt_phone,edt_email,edt_surname;
    

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        btn = (Button) findViewById(R.id.btn);

        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_surname = (EditText) findViewById(R.id.edt_surname);
        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_phone = (EditText) findViewById(R.id.edt_phone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.setTitle("Test");
                alertDialog.show();
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


//    06-05 16:14:35.602 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onCreate
//    06-05 16:14:35.607 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onStart
//    06-05 16:14:35.607 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onResume

//    06-05 16:15:06.752 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onPause
//    06-05 16:15:07.297 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onStop
//    06-05 16:15:07.297 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onDestroy


// Orientation değiştirilir
//    06-05 16:15:06.752 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onPause
//    06-05 16:15:07.297 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onStop
//    06-05 16:15:07.297 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onDestroy

//    06-05 16:14:35.602 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onCreate
//    06-05 16:14:35.607 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onStart
//    06-05 16:14:35.607 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onResume


    // uygulama arka plana alınır
//    06-05 16:16:17.547 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onPause
//    06-05 16:16:18.062 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onStop
//
//    kapatılır
//    06-05 16:16:29.162 18005-18005/com.tkosen.activtylifecycle D/MainActivity: onDestroy

}


