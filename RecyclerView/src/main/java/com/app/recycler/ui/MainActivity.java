package com.app.recycler.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.app.recycler.R;
import com.app.recycler.ui.anim.AnimationActivity;
import com.app.recycler.ui.complex.ComplexItemActivity;
import com.app.recycler.ui.decoration.GridDecorationActivity;
import com.app.recycler.ui.decoration.ScrollHeaderActivity;
import com.app.recycler.ui.decoration.SuspendToolBarActivity;
import com.app.recycler.ui.multi_item.MultiLevel2Activity;
import com.app.recycler.ui.multi_item.MultiLevel3Activity;
import com.app.recycler.ui.refresh.RefreshActivity;
import com.app.recycler.ui.decoration.SuspendDecorationActivity;
import com.app.recycler.ui.section.SectionActivity;
import com.app.recycler.ui.section.SectionSuspendActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MultiLevel2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MultiLevel3Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv_refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RefreshActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView条目展示动画效果
        findViewById(R.id.tv_item_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView实现顶部悬浮方式一:分割线
        findViewById(R.id.tv_suspend_decoration).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SuspendDecorationActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView实现顶部悬浮方式一:HeaderView
        findViewById(R.id.tv_suspend_head).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollHeaderActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView实现顶部悬浮方式一:ToolBar(design)
        findViewById(R.id.tv_suspend_toolBar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SuspendToolBarActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView实现网格布局分割线
        findViewById(R.id.tv_grid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GridDecorationActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView实现多类型条目 - 复杂布局
        findViewById(R.id.tv_complex_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ComplexItemActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView中多类型条目 - 分割布局
        findViewById(R.id.tv_section).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SectionActivity.class);
                startActivity(intent);
            }
        });

        //RecyclerView中多类型条目 - 分割布局（顶部悬浮）
        findViewById(R.id.tv_section_suspend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SectionSuspendActivity.class);
                startActivity(intent);
            }
        });
    }

}
