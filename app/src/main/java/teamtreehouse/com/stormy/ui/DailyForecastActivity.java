package teamtreehouse.com.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import teamtreehouse.com.stormy.Adapters.DayAdapter;
import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        mDays = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);

        DayAdapter adapter = new DayAdapter(this, mDays);

    }

}
