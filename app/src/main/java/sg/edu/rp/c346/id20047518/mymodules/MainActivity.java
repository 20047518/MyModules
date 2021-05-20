package sg.edu.rp.c346.id20047518.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        c346 = findViewById(R.id.c346);

        //Event handling Step 3
        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "Module Code: C346\nModule Name: Andriod Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
                startActivity(intent);
            }
        });

        //Event handling Step 2
        c349 = findViewById(R.id.c349);

        //Event handling Step 3
        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "Module Code: C349\nModule Name: IOS Programming\nAcademic Year: 2020\nSemester: 2\nModule Credit: 6\nVenue: E62E");
                startActivity(intent);
            }
        });
    }
}