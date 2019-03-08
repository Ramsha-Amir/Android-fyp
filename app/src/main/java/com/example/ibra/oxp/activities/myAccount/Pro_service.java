package com.example.ibra.oxp.activities.myAccount;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.example.ibra.oxp.R;
import com.example.ibra.oxp.activities.Base;
import com.example.ibra.oxp.activities.product.AddProduct;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Pro_service extends Base {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_service);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        bottom();
    }



    /** Called when the user touches the button */
    @OnClick(R.id.send_product)
    public void sendMessageProduct() {
        // Do something in response to button click
        Intent intent = new Intent(Pro_service.this, ViewMyProducts.class);
        startActivity(intent);
        //finish();
    }

    @OnClick(R.id.send_service)
    public void sendMessageService() {
        // Do something in response to button click
        Intent intent = new Intent(Pro_service.this, ViewMyServices.class);
        startActivity(intent);
        //finish();
    }
}
