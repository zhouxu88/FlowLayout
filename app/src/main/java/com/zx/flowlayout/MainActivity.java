package com.zx.flowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * 周旭
 * 流式布局
 */
public class MainActivity extends AppCompatActivity {

    private FlowLayout flowLayout1;
    private FlowLayout flowLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flowLayout1 = (FlowLayout) findViewById(R.id.flow_layout1);
        flowLayout2 = (FlowLayout) findViewById(R.id.flow_layout2);


        findViewById(R.id.dynamic_flow_layout_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] titles = new String[]{"控卫", "得分后卫", "小前锋", "大前锋", "中锋",
                        "Iphone", "三星", "华为", "小米", "Vivo"};
                for (String text : titles) {
                    TextView textView = buildLabel(text);
                    flowLayout2.addView(textView);
                }
            }
        });


        //选择item
        for (int i = 0; i < flowLayout1.getChildCount(); i++) {
            flowLayout1.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView tv = (TextView) v;
                    Log.i("tag", "onClick:--------->" + tv.getText());
                    Toast.makeText(MainActivity.this, tv.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private TextView buildLabel(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        textView.setPadding((int) dpToPx(16), (int) dpToPx(8), (int) dpToPx(16), (int) dpToPx(8));
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundResource(R.drawable.label_bg);
        return textView;
    }


    //dp转换成px
    private float dpToPx(float dp) {
        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }
}
