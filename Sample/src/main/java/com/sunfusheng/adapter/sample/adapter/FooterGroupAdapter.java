package com.sunfusheng.adapter.sample.adapter;

import android.content.Context;

import com.sunfusheng.FooterGroupRecyclerViewAdapter;
import com.sunfusheng.GroupViewHolder;
import com.sunfusheng.adapter.sample.R;
import com.sunfusheng.adapter.sample.util.GroupData;

import java.util.List;

/**
 * @author sunfusheng on 2018/2/3.
 */
public class FooterGroupAdapter extends FooterGroupRecyclerViewAdapter<String> {

    public FooterGroupAdapter(Context context) {
        super(context);
    }

    public FooterGroupAdapter(Context context, List<List<String>> items) {
        super(context, items);
    }

    public FooterGroupAdapter(Context context, String[][] items) {
        super(context, items);
    }

    @Override
    public int getChildLayoutId(int viewType) {
        return R.layout.item_child_layout;
    }

    @Override
    public int getFooterLayoutId(int viewType) {
        return R.layout.item_footer_layout;
    }

    @Override
    public void onBindChildViewHolder(GroupViewHolder holder, String item, int groupPosition, int childPosition) {
        holder.setText(R.id.tv_title, item);
    }

    @Override
    public void onBindFooterViewHolder(GroupViewHolder holder, String item, int groupPosition) {
        holder.setText(R.id.tv_title, item + GroupData.FOOTER_SUFFIX);
    }
}
