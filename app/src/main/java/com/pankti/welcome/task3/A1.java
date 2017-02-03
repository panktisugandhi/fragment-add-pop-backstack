package com.pankti.welcome.task3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by welcome on 2/1/2017.
 */

public class A1 extends Fragment {

   private Button btn1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.a1,container,false);
         btn1= (Button) view.findViewById(R.id.btn_go);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 b = new  B1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_lin,b);
                ft.addToBackStack("");
                ft.commit();
                //fm.popBackStack();

            }
        });

        return view;
    }
}
