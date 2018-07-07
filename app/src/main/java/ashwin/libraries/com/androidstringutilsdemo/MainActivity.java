package ashwin.libraries.com.androidstringutilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ashwin.libraries.com.androidstringutils.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // check if blank
        Log.d("debug-logging", "is blank: " + StringUtils.isBlank(""));

        // check if empty
        Log.d("debug-logging", "is empty: " + StringUtils.isEmpty(""));

        // get length
        Log.d("debug-logging", "length: " + StringUtils.getLength("abc"));

        // get count
        Log.d("debug-logging", "count: " + StringUtils.getCount("abcaxyza", 'a'));

        // title case
        Log.d("debug-logging", "title case: " + StringUtils.getTitleCase("game of thrones"));

    }
}
