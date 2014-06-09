package app.loveand.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class HeaderImageView extends ImageView {

	private Paint mRectPaint;
	public HeaderImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	private void init() {
		mRectPaint = new Paint();
		mRectPaint.setAntiAlias(true);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		mRectPaint.setColor(Color.parseColor("#50FFFFFF"));
		mRectPaint.setStrokeWidth(38);
		mRectPaint.setStyle(Paint.Style.STROKE);
		canvas.drawRect(0, 0, getWidth(), getHeight(), mRectPaint);
		mRectPaint.setColor(Color.parseColor("#1c1c1c"));
		mRectPaint.setStrokeWidth(1);
		canvas.drawRect(0, 0, getWidth()-1, getHeight()-1, mRectPaint);
		mRectPaint.setColor(Color.parseColor("#45ffffff"));
		mRectPaint.setStrokeWidth(1);
		canvas.drawRect(1, 1, getWidth()-2, getHeight()-2, mRectPaint);
	}

}
