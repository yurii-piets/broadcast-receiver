package pl.edu.agh.broadcast.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static pl.edu.agh.broadcast.broadcastreceiver.MainActivity.isAirplaneModeOn;

public class ToastBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Airplane mode" + (isAirplaneModeOn(context) ? "On" : "Off"), Toast.LENGTH_LONG).show();
    }
}
