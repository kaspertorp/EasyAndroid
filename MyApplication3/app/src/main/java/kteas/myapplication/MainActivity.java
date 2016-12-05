package kteas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kteas.first.EasyInactive;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EasyInactive EI = new EasyInactive(2000,getApplicationContext());
        EI.startInactiveCheck();
        super.onCreate(savedInstanceState);
        setTheme(kteas.first.R.style.KT_theme);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newact = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(newact);
            }
        });
    }

    public void onPause()
    {
        super.onPause();
        setTheme(kteas.first.R.style.KT_theme);
    }
}
