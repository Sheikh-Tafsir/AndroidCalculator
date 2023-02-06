package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //EditText n1;
    TextView tv;

    Button addbtn,subbtn,mulbtn,divbtn,modbtn,pointbtn,equalbtn,deletebtn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,clearbtn;
    int n2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addbtn=findViewById(R.id.addButton);
        subbtn=findViewById(R.id.subButton);
        mulbtn=findViewById(R.id.mulButton);
        divbtn=findViewById(R.id.divButton);
        modbtn=findViewById(R.id.modButton);
        pointbtn=findViewById(R.id.pointButton);
        clearbtn=findViewById(R.id.clearButton);
        deletebtn=findViewById(R.id.deleteButton);
        equalbtn=findViewById(R.id.equalButton);
        btn0=findViewById(R.id.Button0);
        btn1=findViewById(R.id.Button1);
        btn2=findViewById(R.id.Button2);
        btn3=findViewById(R.id.Button3);
        btn4=findViewById(R.id.Button4);
        btn5=findViewById(R.id.Button5);
        btn6=findViewById(R.id.Button6);
        btn7=findViewById(R.id.Button7);
        btn8=findViewById(R.id.Button8);
        btn9=findViewById(R.id.Button9);

        /*addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                n1=findViewById(R.id.num1);
                tv=findViewById(R.id.result);
                if(n1.getText().toString().length() == 0){
                    n1.setText("0");
                }
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=n2;
                int res=nu1+nu2;
                n2=res;
                String str1="Result= ";
                String str2=String.valueOf(res);
                String str3=str1+str2;
                tv.setText(str3);
            }
        });*/

        addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"+";
                tv.setText(str2);
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"-";
                tv.setText(str2);
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"*";
                tv.setText(str2);
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"/";
                tv.setText(str2);
            }
        });
        modbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"%";
                tv.setText(str2);
            }
        });
        pointbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+".";
                tv.setText(str2);
            }
        });
        clearbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                tv.setText("");
            }
        });
        deletebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();

                if (str1 != null && str1.length() > 0 && str1.charAt(str1.length() - 1) == 'x') {
                    str1 = str1.substring(0, str1.length() - 1);
                }
                tv.setText(str1);
            }
        });
        equalbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();

                String operators[]=str1.split("[0-9]+");
                String operands[]=str1.split("[+-/*%]");
                int agregate = Integer.parseInt(operands[0]);
                for(int i=1;i<operands.length;i++){
                    if(operators[i].equals("+"))
                        agregate += Integer.parseInt(operands[i]);
                    else if(operators[i].equals("-"))
                        agregate -= Integer.parseInt(operands[i]);
                    else if(operators[i].equals("*"))
                        agregate *= Integer.parseInt(operands[i]);
                    else if(operators[i].equals("/"))
                        agregate /= Integer.parseInt(operands[i]);
                    else if(operators[i].equals("%"))
                        agregate %= Integer.parseInt(operands[i]);
                }
                tv.setText(String.valueOf(agregate));

            }
        });


        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"0";
                tv.setText(str2);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"1";
                tv.setText(str2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"2";
                tv.setText(str2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"3";
                tv.setText(str2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"4";
                tv.setText(str2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"5";
                tv.setText(str2);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"6";
                tv.setText(str2);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"7";
                tv.setText(str2);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"8";
                tv.setText(str2);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv=findViewById(R.id.result);
                String str1=tv.getText().toString();
                String str2=str1+"9";
                tv.setText(str2);
            }
        });


    }

}