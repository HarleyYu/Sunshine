package cn.foxnickel.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ShareActionProvider provider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView detailForecast = (TextView) findViewById(R.id.detail_forecast);
        Intent forecast = getIntent();
        detailForecast.setText(forecast.getStringExtra(Intent.EXTRA_TEXT));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        MenuItem item = menu.findItem(R.id.action_share);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
