package com.example.aleksey.matrix11;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TwoFrafment extends Fragment implements View.OnClickListener{

    EditText etNum1;
    EditText etNum2;
    EditText etNum3;
    EditText etNum4;
    EditText etNum5;
    EditText etNum6;
    EditText etNum7;
    EditText etNum8;
    EditText etNum9;
    EditText etNum10;
    EditText etNum11;
    EditText etNum12;
    EditText etNum13;
    EditText etNum14;
    EditText etNum15;
    EditText etNum16;
    EditText etNum17;
    EditText etNum18;
    Button btnRavno;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult14;
    TextView tvResult15;
    TextView tvResult16;
    TextView tvResult17;
    TextView tvResult18;
    TextView tvResult19;
    TextView tvResult21;
    TextView tvResult22;
    TextView tvResult23;
    TextView tvResult24;
    TextView tvResult25;
    TextView tvResult26;
    TextView tvResult27;
    TextView tvResult28;
    TextView tvResult29;
    TextView tvResult31;
    TextView tvResult32;
    TextView tvResult33;
    TextView tvResult34;
    TextView tvResult35;
    TextView tvResult36;
    TextView tvResult37;
    TextView tvResult38;
    TextView tvResult39;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        etNum1 = (EditText) view.findViewById(R.id.etNum1);
        etNum2 = (EditText) view.findViewById(R.id.etNum2);
        etNum3 = (EditText) view.findViewById(R.id.etNum3);
        etNum4 = (EditText) view.findViewById(R.id.etNum4);
        etNum5 = (EditText) view.findViewById(R.id.etNum5);
        etNum6 = (EditText) view.findViewById(R.id.etNum6);
        etNum7 = (EditText) view.findViewById(R.id.etNum7);
        etNum8 = (EditText) view.findViewById(R.id.etNum8);
        etNum9 = (EditText) view.findViewById(R.id.etNum9);
        etNum10 = (EditText) view.findViewById(R.id.etNum10);
        etNum11 = (EditText) view.findViewById(R.id.etNum11);
        etNum12 = (EditText) view.findViewById(R.id.etNum12);
        etNum13 = (EditText) view.findViewById(R.id.etNum13);
        etNum14 = (EditText) view.findViewById(R.id.etNum14);
        etNum15 = (EditText) view.findViewById(R.id.etNum15);
        etNum16 = (EditText) view.findViewById(R.id.etNum16);
        etNum17 = (EditText) view.findViewById(R.id.etNum17);
        etNum18 = (EditText) view.findViewById(R.id.etNum18);
        btnRavno = (Button) view.findViewById(R.id.btnRavno);
        tvResult11 = (TextView) view.findViewById(R.id.tvResult11);
        tvResult12 = (TextView) view.findViewById(R.id.tvResult12);
        tvResult13 = (TextView) view.findViewById(R.id.tvResult13);
        tvResult14 = (TextView) view.findViewById(R.id.tvResult14);
        tvResult15 = (TextView) view.findViewById(R.id.tvResult15);
        tvResult16 = (TextView) view.findViewById(R.id.tvResult16);
        tvResult17 = (TextView) view.findViewById(R.id.tvResult17);
        tvResult18 = (TextView) view.findViewById(R.id.tvResult18);
        tvResult19 = (TextView) view.findViewById(R.id.tvResult19);
        tvResult21 = (TextView) view.findViewById(R.id.tvResult21);
        tvResult22 = (TextView) view.findViewById(R.id.tvResult22);
        tvResult23 = (TextView) view.findViewById(R.id.tvResult23);
        tvResult24 = (TextView) view.findViewById(R.id.tvResult24);
        tvResult25 = (TextView) view.findViewById(R.id.tvResult25);
        tvResult26 = (TextView) view.findViewById(R.id.tvResult26);
        tvResult27 = (TextView) view.findViewById(R.id.tvResult27);
        tvResult28 = (TextView) view.findViewById(R.id.tvResult28);
        tvResult29 = (TextView) view.findViewById(R.id.tvResult29);
        tvResult31 = (TextView) view.findViewById(R.id.tvResult31);
        tvResult32 = (TextView) view.findViewById(R.id.tvResult32);
        tvResult33 = (TextView) view.findViewById(R.id.tvResult33);
        tvResult34 = (TextView) view.findViewById(R.id.tvResult34);
        tvResult35 = (TextView) view.findViewById(R.id.tvResult35);
        tvResult36 = (TextView) view.findViewById(R.id.tvResult36);
        tvResult37 = (TextView) view.findViewById(R.id.tvResult37);
        tvResult38 = (TextView) view.findViewById(R.id.tvResult38);
        tvResult39 = (TextView) view.findViewById(R.id.tvResult39);

        btnRavno.setOnClickListener(this);

        return view;
    }
    public void onClick(View v) {

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;
        double num6 = 0;
        double num7 = 0;
        double num8 = 0;
        double num9 = 0;
        double num10 = 0;
        double num11 = 0;
        double num12 = 0;
        double num13 = 0;
        double num14 = 0;
        double num15 = 0;
        double num16 = 0;
        double num17 = 0;
        double num18 = 0;
        double result11 = 0;
        double result12 = 0;
        double result13 = 0;
        double result14 = 0;
        double result15 = 0;
        double result16 = 0;
        double result17 = 0;
        double result18 = 0;
        double result19 = 0;
        double result21 = 0;
        double result22 = 0;
        double result23 = 0;
        double result24 = 0;
        double result25 = 0;
        double result26 = 0;
        double result27 = 0;
        double result28 = 0;
        double result29 = 0;
        double result31 = 0;
        double result32 = 0;
        double result33 = 0;
        double result34 = 0;
        double result35 = 0;
        double result36 = 0;
        double result37 = 0;
        double result38 = 0;
        double result39 = 0;

        // читаем EditText и заполняем переменные числами
        num1 = Double.parseDouble(etNum1.getText().toString());
        num2 = Double.parseDouble(etNum2.getText().toString());
        num3 = Double.parseDouble(etNum3.getText().toString());
        num4 = Double.parseDouble(etNum4.getText().toString());
        num5 = Double.parseDouble(etNum5.getText().toString());
        num6 = Double.parseDouble(etNum6.getText().toString());
        num7 = Double.parseDouble(etNum7.getText().toString());
        num8 = Double.parseDouble(etNum8.getText().toString());
        num9 = Double.parseDouble(etNum9.getText().toString());
        num10 = Double.parseDouble(etNum10.getText().toString());
        num11 = Double.parseDouble(etNum11.getText().toString());
        num12 = Double.parseDouble(etNum12.getText().toString());
        num13 = Double.parseDouble(etNum13.getText().toString());
        num14 = Double.parseDouble(etNum14.getText().toString());
        num15 = Double.parseDouble(etNum15.getText().toString());
        num16 = Double.parseDouble(etNum16.getText().toString());
        num17 = Double.parseDouble(etNum17.getText().toString());
        num18 = Double.parseDouble(etNum18.getText().toString());



        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.btnRavno:
                result11 = num1 * num10 + num2 * num13 + num3 * num16;
                result12 = num1 * num11 + num2 * num14 + num3 * num17;
                result13 = num1 * num12 + num2 * num15 + num3 * num18;
                result14 = num4 * num10 + num5 * num13 + num6 * num16;
                result15 = num4 * num11 + num5 * num14 + num6 * num17;
                result16 = num4 * num12 + num5 * num15 + num6 * num18;
                result17 = num7 * num10 + num8 * num13 + num9 * num16;
                result18 = num7 * num11 + num8 * num14 + num9 * num17;
                result19 = num7 * num12 + num8 * num15 + num9 * num18;
                result21 = num1 + num10;
                result22 = num2 + num11;
                result23 = num3 + num12;
                result24 = num4 + num13;
                result25 = num5 + num14;
                result26 = num6 + num15;
                result27 = num7 + num16;
                result28 = num8 + num17;
                result29 = num9 + num18;
                result31 = num1 - num10;
                result32 = num2 - num11;
                result33 = num3 - num12;
                result34 = num4 - num13;
                result35 = num5 - num14;
                result36 = num6 - num15;
                result37 = num7 - num16;
                result38 = num8 - num17;
                result39 = num9 - num18;
                break;
            default:
                break;
        }

        // формируем строку вывода
        tvResult11.setText(Double.toString(result11));
        tvResult12.setText(Double.toString(result12));
        tvResult13.setText(Double.toString(result13));
        tvResult14.setText(Double.toString(result14));
        tvResult15.setText(Double.toString(result15));
        tvResult16.setText(Double.toString(result16));
        tvResult17.setText(Double.toString(result17));
        tvResult18.setText(Double.toString(result18));
        tvResult19.setText(Double.toString(result19));

        tvResult21.setText(Double.toString(result21));
        tvResult22.setText(Double.toString(result22));
        tvResult23.setText(Double.toString(result23));
        tvResult24.setText(Double.toString(result24));
        tvResult25.setText(Double.toString(result25));
        tvResult26.setText(Double.toString(result26));
        tvResult27.setText(Double.toString(result27));
        tvResult28.setText(Double.toString(result28));
        tvResult29.setText(Double.toString(result29));

        tvResult31.setText(Double.toString(result31));
        tvResult32.setText(Double.toString(result32));
        tvResult33.setText(Double.toString(result33));
        tvResult34.setText(Double.toString(result34));
        tvResult35.setText(Double.toString(result35));
        tvResult36.setText(Double.toString(result36));
        tvResult37.setText(Double.toString(result37));
        tvResult38.setText(Double.toString(result38));
        tvResult39.setText(Double.toString(result39));
    }
}
