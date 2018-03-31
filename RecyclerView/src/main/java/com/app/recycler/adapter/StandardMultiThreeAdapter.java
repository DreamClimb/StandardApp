package com.app.recycler.adapter;

import android.support.annotation.NonNull;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public abstract class StandardMultiThreeAdapter<A, B, C> extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public StandardMultiThreeAdapter(List<MultiItemEntity> data) {
        super(data);
        int[] layoutIdArray = getLayoutArray();// 获取多级条目的布局Id
        int length = layoutIdArray.length;
         if (length == 3) {
            addItemType(0, layoutIdArray[0]);
            addItemType(1, layoutIdArray[1]);
            addItemType(2, layoutIdArray[2]);

             openLoadAnimation(StandardAdapter.SLIDEIN_LEFT);//打开动画效果
             isFirstOnly(false);// false (条目每次出现在页面上展示动画效果) true(只在第一次出现在页面上的时候出现动画效果)
        } else {
            throw new IllegalArgumentException("Adapter not support for other items");
        }
    }

    public abstract @NonNull
    int[] getLayoutArray();//获取布局数组

    @Override
    protected void convert(BaseViewHolder holder, MultiItemEntity item) {
        switch (holder.getItemViewType()) {
            case 0:
                convertLevelOne(holder, (A) item);
                break;
            case 1:
                convertLevelTwo(holder, (B) item);
                break;
            case 2:
                convertLevelThree(holder, (C) item);
                break;
        }
    }

    public abstract void convertLevelOne(BaseViewHolder holder, A a);//一级布局处理

    public abstract void convertLevelTwo(BaseViewHolder holder, B b);//二级布局处理

    public abstract void convertLevelThree(BaseViewHolder holder, C c);// 三级布局处理
}
