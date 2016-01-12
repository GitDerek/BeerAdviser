package com.hfad.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 這是 onCreate() 方法，它在 activity 被建立時即刻被呼叫
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);    //  告知 Android, 這個 activity 要使用哪個 layout,
        // 此案例為 activity_find_beer
    }

    // 在使用者點擊按鈕時被呼叫
    public void onClickFindBeer(View view) {

        // 取得指向 TextView 的參考
        TextView brands = (TextView) findViewById(R.id.brands);

        // 取得指向 Spinner 的參考
        Spinner color = (Spinner) findViewById(R.id.color);

        // 取得在 Spinner 中被選取的項目
        String beerType = String.valueOf(color.getSelectedItem());

        // 展示被選取的項目
        brands.setText(beerType);
    }
}