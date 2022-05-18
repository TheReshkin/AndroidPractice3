package ru.mirea.tereshkin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView uniName;
    private final int REQUEST_CODE = 143;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uniName = findViewById(R.id.UniName);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null){
            String university = data.getStringExtra("uni_name");
            setUniversityTextView(university);
        }
    }

    private void setUniversityTextView(String university){
        uniName.setText(university);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, Activity_data.class);
        startActivity(intent);
    }
}