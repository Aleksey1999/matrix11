package com.example.aleksey.matrix11;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class OneFrafment extends Fragment implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;
    EditText etNum3;
    EditText etNum4;
    EditText etNum5;
    EditText etNum6;
    EditText etNum7;
    EditText etNum8;
    EditText etNum9;
    Button btnRavno;
    TextView tvResult;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult21;
    TextView tvResult22;
    TextView tvResult23;
    TextView tvResult31;
    TextView tvResult32;
    TextView tvResult33;
    TextView tvResult111;
    TextView tvResult121;
    TextView tvResult131;
    TextView tvResult212;
    TextView tvResult222;
    TextView tvResult232;
    TextView tvResult313;
    TextView tvResult323;
    TextView tvResult333;
    TextView tvResult444;
    TextView tvResult515;
    TextView tvResult525;
    TextView tvResult535;
    TextView tvResult545;
    TextView tvResult555;
    TextView tvResult565;
    TextView tvResult575;
    TextView tvResult585;
    TextView tvResult595;

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        etNum1 = (EditText) view.findViewById(R.id.etNum1);
        etNum2 = (EditText) view.findViewById(R.id.etNum2);
        etNum3 = (EditText) view.findViewById(R.id.etNum3);
        etNum4 = (EditText) view.findViewById(R.id.etNum4);
        etNum5 = (EditText) view.findViewById(R.id.etNum5);
        etNum6 = (EditText) view.findViewById(R.id.etNum6);
        etNum7 = (EditText) view.findViewById(R.id.etNum7);
        etNum8 = (EditText) view.findViewById(R.id.etNum8);
        etNum9 = (EditText) view.findViewById(R.id.etNum9);
        btnRavno = (Button) view.findViewById(R.id.btnRavno);
        tvResult = (TextView) view.findViewById(R.id.tvResult);
        tvResult11 = (TextView) view.findViewById(R.id.tvResult11);
        tvResult12 = (TextView) view.findViewById(R.id.tvResult12);
        tvResult13 = (TextView) view.findViewById(R.id.tvResult13);
        tvResult21 = (TextView) view.findViewById(R.id.tvResult21);
        tvResult22 = (TextView) view.findViewById(R.id.tvResult22);
        tvResult23 = (TextView) view.findViewById(R.id.tvResult23);
        tvResult31 = (TextView) view.findViewById(R.id.tvResult31);
        tvResult32 = (TextView) view.findViewById(R.id.tvResult32);
        tvResult33 = (TextView) view.findViewById(R.id.tvResult33);
        tvResult111 = (TextView) view.findViewById(R.id.tvResult111);
        tvResult121 = (TextView) view.findViewById(R.id.tvResult121);
        tvResult131 = (TextView) view.findViewById(R.id.tvResult131);
        tvResult212 = (TextView) view.findViewById(R.id.tvResult212);
        tvResult222 = (TextView) view.findViewById(R.id.tvResult222);
        tvResult232 = (TextView) view.findViewById(R.id.tvResult232);
        tvResult313 = (TextView) view.findViewById(R.id.tvResult313);
        tvResult323 = (TextView) view.findViewById(R.id.tvResult323);
        tvResult333 = (TextView) view.findViewById(R.id.tvResult333);
        tvResult444 = (TextView) view.findViewById(R.id.tvResult444);
        tvResult515 = (TextView) view.findViewById(R.id.tvResult515);
        tvResult525 = (TextView) view.findViewById(R.id.tvResult525);
        tvResult535 = (TextView) view.findViewById(R.id.tvResult535);
        tvResult545 = (TextView) view.findViewById(R.id.tvResult545);
        tvResult555 = (TextView) view.findViewById(R.id.tvResult555);
        tvResult565 = (TextView) view.findViewById(R.id.tvResult565);
        tvResult575 = (TextView) view.findViewById(R.id.tvResult575);
        tvResult585 = (TextView) view.findViewById(R.id.tvResult585);
        tvResult595 = (TextView) view.findViewById(R.id.tvResult595);

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
        double result = 0;
        double result11 = 0;
        double result12 = 0;
        double result13 = 0;
        double result21 = 0;
        double result22 = 0;
        double result23 = 0;
        double result31 = 0;
        double result32 = 0;
        double result33 = 0;

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

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.btnRavno:
                result = num1 * num5 * num9 + num7 * num6 * num2 + num3 * num8 * num4 - num7 * num5 * num3 - num1 * num6 * num8 - num2 * num9 * num4;
                result11 = num5 * num9 - num8 * num6;
                result12 = num4 * num9 - num7 * num6;
                result13 = num4 * num8 - num7 * num5;
                result21 = num2 * num9 - num8 * num3;
                result22 = num1 * num9 - num7 * num3;
                result23 = num1 * num8 - num7 * num2;
                result31 = num2 * num6 - num5 * num3;
                result32 = num1 * num6 - num4 * num3;
                result33 = num1 * num5 - num4 * num2;
                break;
            default:
                break;
        }

        // формируем строку вывода
        tvResult.setText(Double.toString(result));
        tvResult11.setText(Double.toString(result11));
        tvResult12.setText(Double.toString(result12));
        tvResult13.setText(Double.toString(result13));

        tvResult21.setText(Double.toString(result21));
        tvResult22.setText(Double.toString(result22));
        tvResult23.setText(Double.toString(result23));

        tvResult31.setText(Double.toString(result31));
        tvResult32.setText(Double.toString(result32));
        tvResult33.setText(Double.toString(result33));

        tvResult111.setText(Double.toString(result11));
        tvResult121.setText(Double.toString(result12));
        tvResult131.setText(Double.toString(result13));

        tvResult212.setText(Double.toString(result21));
        tvResult222.setText(Double.toString(result22));
        tvResult232.setText(Double.toString(result23));

        tvResult313.setText(Double.toString(result31));
        tvResult323.setText(Double.toString(result32));
        tvResult333.setText(Double.toString(result33));
        tvResult444.setText(Double.toString(result));

        tvResult515.setText(Double.toString(result11));
        tvResult525.setText(Double.toString(result21));
        tvResult535.setText(Double.toString(result31));

        tvResult545.setText(Double.toString(result12));
        tvResult555.setText(Double.toString(result22));
        tvResult565.setText(Double.toString(result32));

        tvResult575.setText(Double.toString(result13));
        tvResult585.setText(Double.toString(result23));
        tvResult595.setText(Double.toString(result33));
    }
}




