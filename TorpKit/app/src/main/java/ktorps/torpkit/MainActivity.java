package ktorps.torpkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EasyInactive inactive;
    Button b_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inactive = new EasyInactive(5000,this.getApplicationContext());
        Runnable r = new Runnable() {
            @Override
            public void run() {
                TextView t = (TextView) findViewById(R.id.test);
                t.setText("whaaat");
                ImageView v = (ImageView) findViewById(R.id.imageView);
                v.setVisibility(View.VISIBLE);
            }
        };
        inactive.setCustomRunnable(r);
        inactive.startInactiveCheck();

        b_anim = (Button) findViewById(R.id.anim_but);
        b_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(v.getContext(),SecondActivity.class);
                startActivity(newIntent);
            }
        });
    }

    public void onUserInteraction() {
        // TODO Auto-generated method stub
        super.onUserInteraction();
        inactive.moveMade();
        ImageView v = (ImageView) findViewById(R.id.imageView);
        v.setVisibility(View.INVISIBLE);
    }

    public void onPause()
    {
        super.onPause();
    }
}


