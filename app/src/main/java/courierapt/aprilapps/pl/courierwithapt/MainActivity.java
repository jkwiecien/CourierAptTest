package courierapt.aprilapps.pl.courierwithapt;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import me.denley.courier.Courier;
import me.denley.courier.ReceiveData;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Courier.startReceiving(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Courier.stopReceiving(this);
    }

    @ReceiveData("test")
    void test(final String json) {

    }
}
