package com.torres.edgar.rockscissorpaperapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgMachineLeft, imgMachineRight;
    TextView txtScoreLeft,txtScoreRight;
    Button btnControl;
    public Integer machLeft=0, machRight=0, scoreLeft =0, scoreRight =0;
    public Integer pickLeft[]= {R.drawable.rockleft3,R.drawable.paperleft3,R.drawable.scissorleft3};
    public Integer pickRight[]= {R.drawable.rockright3,R.drawable.paperright3,R.drawable.scissorright3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtScoreLeft = (TextView) findViewById(R.id.scoreLeft);
        txtScoreRight = (TextView) findViewById(R.id.scoreRight);
        instantiatemachine();
        instantiatecontroller();

    }

    private void instantiatemachine() {
        imgMachineLeft =(ImageView)findViewById(R.id.imageMach1);
        imgMachineRight =(ImageView)findViewById(R.id.imageMach2);
        imgMachineLeft.setImageResource(pickLeft[0]);
        imgMachineRight.setImageResource(pickRight[0]);

//        batobatopick();


    }

    private void instantiatecontroller() {
        btnControl=(Button)findViewById(R.id.buttonControl);
        btnControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                batobatopick();
            }
        });
    }

    private void batobatopick() {
        machLeft =(int) (Math.random() * 3);
        machRight =(int) (Math.random() * 3);
        imgMachineLeft.setImageResource(pickLeft[machLeft]);
        imgMachineRight.setImageResource(pickRight[machRight]);
        if (machLeft ==0 && machRight ==1 ){
            txtScoreRight.setText(""+ ++scoreRight);
        }
        if (machLeft ==0 && machRight ==2 ){
            txtScoreLeft.setText(""+ ++scoreLeft);
        }
        if (machLeft ==1 && machRight ==0 ){
            txtScoreLeft.setText(""+ ++scoreLeft);
        }
        if (machLeft ==1 && machRight ==2 ){
            txtScoreRight.setText(""+ ++scoreRight);
        }
        if (machLeft ==2 && machRight ==0 ){
            txtScoreRight.setText(""+ ++scoreRight);
        }
        if (machLeft ==2 && machRight ==1 ){
            txtScoreLeft.setText(""+ ++scoreLeft);
        }
    }

}
