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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    }
}

