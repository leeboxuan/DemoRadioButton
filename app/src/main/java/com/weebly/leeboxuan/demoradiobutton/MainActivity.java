package com.weebly.leeboxuan.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 RadioGroup rg;
 Button btn;
 RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        btn = (Button) findViewById(R.id.button);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int selectedId = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(selectedId);

        Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();
    }
});

    }
}
