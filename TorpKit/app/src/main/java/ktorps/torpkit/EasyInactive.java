package ktorps.torpkit;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by K on 05-12-2016.
 */

public class EasyInactive {
    Handler handler;
    Runnable func;
    int executionTimer;
     Context context;



    public EasyInactive(int time, Context c)
    {
        this.handler = new Handler();
        this.executionTimer = time;
        this.context = c;

        func = new Runnable() {

            @Override
            public void run() {
                //placeholder, kan udskiftes
                Toast.makeText(context.getApplicationContext(), "INACTIVE",
                        Toast.LENGTH_SHORT).show();
                Log.d("EasyInactive", "INACTIVE");
            }
        };
    }

    public void startInactiveCheck()
    {
        handler.postDelayed(func, executionTimer);
    }

    public void stopInactiveCheck()
    {
        handler.removeCallbacks(func);
    }

    public void moveMade()
    {
        this.stopInactiveCheck();
        this.startInactiveCheck();
    }

    public void setCustomRunnable(Runnable r)
    {
        func = r;
    }



}
