package jp.co.spidersoft.imgtag;

import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class TagImageView extends ImageView implements OnTouchListener {

	private static final String TAG = TagImageView.class.getSimpleName();
	private List<View> mListViews = null;

	public TagImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public TagImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TagImageView(Context context) {
		super(context);
	}

	public List<View> getListViews() {
		return mListViews;
	}

	public void setListViews(List<View> listViews) {
		this.mListViews = listViews;
	}

	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Log.v(TAG, "onDraw");
		drawViews(canvas);
	}

	private void drawViews(Canvas canvas) {
		if (mListViews == null) {
			return;
		}
		for (View v : mListViews) {
			v.measure(canvas.getWidth(), canvas.getHeight());
			v.layout(0, 0, canvas.getWidth(), canvas.getHeight());

			// To place the text view somewhere specific:
			 canvas.translate(100, 100);

			v.draw(canvas);
		}
		// LinearLayout layout = new LinearLayout(getContext());
		// TextView textView = new TextView(getContext());
		// textView.setVisibility(View.VISIBLE);
		// textView.setText("Hello world");
		// layout.addView(textView);
		//
		// layout.measure(canvas.getWidth(), canvas.getHeight());
		// layout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
		//
		// // To place the text view somewhere specific:
		// //canvas.translate(0, 0);
		//
		// layout.draw(canvas);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		float x = event.getX();
		float y = event.getY();
		// if (event.getAction() == MotionEvent.ACTION_DOWN) {
		Log.v(VIEW_LOG_TAG, "x=" + x + ",y=" + y);
		// }

		return v.performClick();
	}

}
