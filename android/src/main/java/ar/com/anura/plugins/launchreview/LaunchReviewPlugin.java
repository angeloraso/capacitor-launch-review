package ar.com.anura.plugins.launchreview;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "LaunchReview")
public class LaunchReviewPlugin extends Plugin {

    private LaunchReview launchReview;

    public void load() {
        AppCompatActivity activity = getActivity();
        Context context = getContext();
        launchReview = new LaunchReview(activity, context);
    }

    @PluginMethod
    public void launch(PluginCall call) {
        if (getActivity().isFinishing()) {
            call.reject("Launch review plugin error: App is finishing");
            return;
        }

        launchReview.launch();
        call.resolve();
    }
}
