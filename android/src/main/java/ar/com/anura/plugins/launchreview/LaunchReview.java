package ar.com.anura.plugins.launchreview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchReview {
    private final AppCompatActivity mActivity;
    private final Context mContext;

    LaunchReview(final AppCompatActivity activity, final Context context) {
        mActivity = activity;
        mContext = context;
    }

    public void launch() {
        String appPackageName = mContext.getPackageName();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName));
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        mActivity.startActivity(intent);
    }
}
