package com.example.linh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,cong,tru,nhan,chia,bang,c,ce,bc;
    TextView txt;
    Double var1;
    Double var2;
    Double resulrt;

    boolean add = false, sub = false, mul = false, div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.khong);
        b1 = findViewById(R.id.mot);
        b2 = findViewById(R.id.hai);
        b3 = findViewById(R.id.ba);
        b4 = findViewById(R.id.bon);
        b5 = findViewById(R.id.nam);
        b6 = findViewById(R.id.sau);
        b7 = findViewById(R.id.bay);
        b8 = findViewById(R.id.tam);
        b9 = findViewById(R.id.chin);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        bang = findViewById(R.id.bang);
        c = findViewById(R.id.c);
        bc = findViewById(R.id.bc);
        ce = findViewById(R.id.ce);

        txt = findViewById(R.id.kq);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"9");
            }
        });

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                btnFalse();
                add = true;
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                btnFalse();
                sub = true;
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                btnFalse();
                mul = true;
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                btnFalse();
                div = true;
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txt.getText().toString());

                if (add){
                    resulrt = var1 + var2;
                }
                else if (sub){
                    resulrt = var1 - var2;
                }
                else if (mul){
                    resulrt = var1*var2;
                }
                else if (div){
                    resulrt = var1/var2;
                }
                else{
                    resulrt = resulrt + 0;
                }

                txt.setText(resulrt.toString());
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().subSequence(0,txt.length()-1));
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong.setEnabled(true);
                tru.setEnabled(true);
                nhan.setEnabled(true);
                chia.setEnabled(true);
                bang.setEnabled(true);

                txt.setText("");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong.setEnabled(true);
                tru.setEnabled(true);
                nhan.setEnabled(true);
                chia.setEnabled(true);
                bang.setEnabled(true);

                txt.setText("");
            }
        });
    }

    public void setVar1(){
        var1 = Double.parseDouble(txt.getText().toString());
    }

    public void btnFalse(){
        cong.setEnabled(false);
        tru.setEnabled(false);
        nhan.setEnabled(false);
        chia.setEnabled(false);
        txt.setText("");
    }
}
