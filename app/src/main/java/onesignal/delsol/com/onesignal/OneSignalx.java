package onesignal.delsol.com.onesignal;

import android.app.Application;

import com.onesignal.OneSignal;

public class OneSignalx extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.None)
                .setNotificationReceivedHandler( new MyNotificationReceivedHandler() )
                .init();
    }
}
