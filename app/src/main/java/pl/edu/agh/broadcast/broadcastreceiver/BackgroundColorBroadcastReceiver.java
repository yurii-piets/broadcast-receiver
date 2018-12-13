package pl.edu.agh.broadcast.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;

import static pl.edu.agh.broadcast.broadcastreceiver.MainActivity.isAirplaneModeOn;

public class BackgroundColorBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (context instanceof MainActivity) {
            View constraintLayout = ((MainActivity) context).findViewById(R.id.constraintLayoutId);
            int color;
            if (isAirplaneModeOn(context)) {
                color = ContextCompat.getColor(context, R.color.niceBlue);
            } else {
                color = ContextCompat.getColor(context, R.color.white);
            }
            constraintLayout.setBackgroundColor(color);
        }
    }
}
