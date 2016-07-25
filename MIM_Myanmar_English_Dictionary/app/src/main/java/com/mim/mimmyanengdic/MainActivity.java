package com.mim.mimmyanengdic;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//i Main စာမ်က္ႏွာက ပံုေပၚေထာက္လိုက္ရင္ Dictionary သံုးတဲ႔ေနရာသြားဖို႔ layout View ကို id ရွာျပီး onClick Listener ေပးပါမယ္။
		View mainWrap = findViewById(R.id.mainWrapper1);
		mainWrap.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1) {
					// TODO: Implement this method ဒီစာေၾကာင္းေတြကို ဖ်က္မပစ္ေစခ်င္ဘူး Auto implementation လုပ္ထားတယ္ဆိုတာ ၾကည္႔ရံုနဲ႔သိႏိုင္တာေပါ႔။ 
					Intent mainSearchIntent = new Intent (getApplication(),MainSearch.class);
					startActivity(mainSearchIntent);
					
				}

			});
    }
};
