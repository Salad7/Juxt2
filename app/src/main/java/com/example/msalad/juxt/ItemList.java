package com.example.msalad.juxt;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by msalad on 1/7/2016.
 */
public class ItemList extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
            ImageView mPicture;
            EditText mName;
            EditText mPrice;
            CheckBox mIsColor;
            CheckBox mIsBroadcast;

            ItemHolder(View itemView) {

                super(itemView);

                mPicture = (ImageView) itemView.findViewById(R.id.picture);
                mName = (EditText) itemView.findViewById(R.id.name);
                mPrice = (EditText) itemView.findViewById(R.id.price);
                mIsColor = (CheckBox) itemView.findViewById(R.id.color);
                mIsBroadcast = (CheckBox) itemView.findViewById(R.id.broadcast);

            }

        }

        public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {
            private ItemLab sItemLab;
            private ArrayList<Item> mItems;

            ItemAdapter() {
                sItemLab = ItemLab.get(getContext());
                mItems = sItemLab.getItemList();
            }

            @Override
            public int getItemCount() {
                return mItems.size();
            }

            @Override
            public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                LayoutInflater inflater = LayoutInflater.from(getContext());
                View v = inflater.inflate(R.layout.detail_item_fragment, parent, false);
                return new ItemHolder(v);
            }

            @Override
            public void onBindViewHolder(ItemHolder holder, int position) {

            }
        }
    }
