package com.hfad.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 這是 onCreate() 方法，它在 activity 被建立時即刻被呼叫
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);    //  告知 Android, 這個 activity 要使用哪個 layout,
        // 此案例為 activity_find_beer
    }

    private BeerExpert expert = new BeerExpert(); // 增加 BeerExpert 實例，作為私有變數

    // 在使用者點擊按鈕時被呼叫
    public void onClickFindBeer(View view) {

        // 取得指向 TextView 的參考
        TextView brands = (TextView) findViewById(R.id.brands);

        // 取得指向 Spinner 的參考
        Spinner color = (Spinner) findViewById(R.id.color);

        // 取得在 Spinner 中被選取的項目
        String beerType = String.valueOf(color.getSelectedItem());

        // 從 BeerExpert 類別取得建議
        List<String>  brandsList = expert.getBrands(beerType);  // 使用  BeerExpert 物件，取得由啤酒品牌組成的 List

        // 建立 String 物件，每一行展示一個啤酒品牌
        StringBuilder brandsFormatted = new StringBuilder();  // 建立 String,
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append("\n");
        }

        // 展示啤酒
        brands.setText(brandsFormatted);
    }
}