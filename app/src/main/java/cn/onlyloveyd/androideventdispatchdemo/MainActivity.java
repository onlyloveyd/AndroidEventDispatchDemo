package cn.onlyloveyd.androideventdispatchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ParentLayout parentLayout;
    private ChildView childView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentLayout = (ParentLayout) findViewById(R.id.parentLayout);
        childView = (ChildView) findViewById(R.id.childview);


        parentLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                System.err.println("yidong -- ParentLayout onTouch event = " + motionEvent.getAction());
                return false;
            }
        });

        childView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                System.err.println("yidong -- ChildView onTouch event = " + motionEvent.getAction());
                return false;
            }
        });

        childView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.err.println("yidong -- ChildView onClick");
            }
        });

    }
}
