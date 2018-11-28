package rs.hecke.delta7.mamimi.widgets

import rs.hecke.delta7.mamimi.R;

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton

class RecordButton @JvmOverloads constructor(
    ctx: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ImageButton(ctx, attrs, defStyleAttr) {
    init {
        setBackgroundResource(0); // remove the background
        setImageResource(R.drawable.take_picture_button);
        setPadding(10, 10, 10,10);
    }
}