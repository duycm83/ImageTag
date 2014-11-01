package jp.co.spidersoft.imgtag;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		WebView wb = (WebView) findViewById(R.id.webview);
		wb.loadUrl("file:///android_asset/phototag/html/index.html");
		wb.getSettings().setJavaScriptEnabled(true);
//		wb.getSettings().setLoadWithOverviewMode(true);
//		wb.getSettings().setUseWideViewPort(true);
//		wb.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
//		wb.setScrollbarFadingEnabled(true);
//		wb.setInitialScale(100);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
