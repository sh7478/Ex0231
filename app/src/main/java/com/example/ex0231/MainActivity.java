package com.example.ex0231;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ex0231.ex1.Chargeable;
import com.example.ex0231.ex1.Laptop;
import com.example.ex0231.ex1.Phone;
import com.example.ex0231.ex1.Tablet;
import com.example.ex0231.ex2.Drum;
import com.example.ex0231.ex2.Guitar;
import com.example.ex0231.ex2.Piano;
import com.example.ex0231.ex2.Playable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ex1 start
        Chargeable[] chargeables = new Chargeable[6];
        chargeables[0] = (new Laptop());
        chargeables[1] = (new Laptop());
        chargeables[2] = (new Phone());
        chargeables[3] = (new Phone());
        chargeables[4] = (new Tablet());
        chargeables[5] = (new Tablet());
        for(Chargeable charges : chargeables)
        {
            charges.charge();
        }
        //ex1 end
        System.out.println("====================start EX2====================");
        //ex2 start
        Playable[] instruments = new Playable[3];
        instruments[0] = (new Guitar());
        instruments[1] = (new Drum());
        instruments[2] = (new Piano());
        for(Playable instrumant : instruments)
        {
            instrumant.play();
        }
    }
}

