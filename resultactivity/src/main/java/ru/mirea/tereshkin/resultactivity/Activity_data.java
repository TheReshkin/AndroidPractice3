package ru.mirea.tereshkin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_data extends AppCompatActivity {
    private EditText universityName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        EditText universityName = findViewById(R.id.editTextTextUniName);
    }

    public void onClickButton(View view) {
        Intent intent = new Intent();
        intent.putExtra("uni_name", universityName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}