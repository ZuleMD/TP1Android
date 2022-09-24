package n.rnu.isetr.mariemderbali_tp1android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button count;
    TextView view;
    Button toast;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.count);
        view= findViewById(R.id.view);
        toast = findViewById(R.id.toast);
        final int[] i = {0};
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i[0]++;
                view.setText(String.valueOf(i[0]));
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast. makeText(getApplicationContext(),"It's working :)",Toast. LENGTH_SHORT);
                toast. show();
            }
        });
    }
}