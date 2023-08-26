package ru.mirea.chudnevtsevmr.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView out;
    private Button whoami;
    private Button itsnotme;
    private CheckBox checkbox;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.out);
        whoami = findViewById(R.id.whoami);
        itsnotme = findViewById(R.id.itsnotme);
        checkbox = findViewById(R.id.checkbox);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText("Мой номер по списку: 25");
                checkbox.setChecked(true);
            }
        };
        whoami.setOnClickListener(onClickListener);
    }

    public void itsNotMeClick(View v) {
        out.setText("Это не я сделал");
        checkbox.setChecked(false);
    }
}
