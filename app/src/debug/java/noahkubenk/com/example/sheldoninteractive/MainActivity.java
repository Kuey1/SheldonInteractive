package noahkubenk.com.example.sheldoninteractive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//when app started load activity main.xml
        button = (Button)findViewById(R.id.sheldonmap);//when marker has been pressed twice it will move to the

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity4();
            }//when button clicked run inside activity 4
        });
    }
    public void openInsideActivity4()
    {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);// start activity
    }
}