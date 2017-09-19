/**
 * Copyright 2017 yidong
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.onlyloveyd.androideventdispatchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * 文 件 名: ChildView
 * 创 建 人: 易冬
 * 创建日期: 2017/09/18 21/35
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
public class ChildView extends android.support.v7.widget.AppCompatButton {
    public ChildView(Context context) {
        super(context);
    }

    public ChildView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ChildView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.err.println("yidong -- ChildView onTouchEvent event = " + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        System.err.println("yidong -- ChildView dispatchTouchEvent event = " + event.getAction());
        return super.dispatchTouchEvent(event);
    }

}
