package kteas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(kteas.first.R.style.KT_theme);
        setContentView(R.layout.activity_main2);
    }

    public void onPause()
    {
        super.onPause();
        setTheme(kteas.first.R.style.KT_theme);
    }
}
