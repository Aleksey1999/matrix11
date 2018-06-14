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

public class ThreeFrafment extends Fragment implements View.OnClickListener{

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
    Button btnRavno;
    TextView tvResult14;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult15;
    TextView tvResult16;
    TextView tvResult17;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
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
        btnRavno = (Button) view.findViewById(R.id.btnRavno);
        tvResult14 = (TextView) view.findViewById(R.id.tvResult14);
        tvResult11 = (TextView) view.findViewById(R.id.tvResult11);
        tvResult12 = (TextView) view.findViewById(R.id.tvResult12);
        tvResult13 = (TextView) view.findViewById(R.id.tvResult13);
        tvResult15 = (TextView) view.findViewById(R.id.tvResult15);
        tvResult16 = (TextView) view.findViewById(R.id.tvResult16);
        tvResult17 = (TextView) view.findViewById(R.id.tvResult17);

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
        double result14 = 0;
        double result11 = 0;
        double result12 = 0;
        double result13 = 0;
        double result15 = 0;
        double result16 = 0;
        double result17 = 0;

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

        switch (v.getId()) {
            case R.id.btnRavno:
                result14 = num1 * num5 * num9 + num7 * num6 * num2 + num3 * num8 * num4 - num7 * num5 * num3 - num1 * num6 * num8 - num2 * num9 * num4;
                result11 = num10 * num5 * num9 + num12 * num6 * num2 + num3 * num8 * num11 - num12 * num5 * num3 - num10 * num6 * num8 - num2 * num9 * num11;
                result12 = num1 * num11 * num9 + num7 * num6 * num10 + num3 * num12 * num4 - num7 * num11 * num3 - num1 * num6 * num12 - num10 * num9 * num4;
                result13 = num1 * num5 * num12 + num7 * num11 * num2 + num10 * num8 * num4 - num7 * num5 * num10 - num1 * num11 * num8 - num2 * num12 * num4;
                result15 = result11 / result14;
                result16 = result12 / result14;
                result17 = result13 / result14;

                break;
            default:
                break;
        }

        tvResult14.setText(Double.toString(result14));
        tvResult11.setText(Double.toString(result11));
        tvResult12.setText(Double.toString(result12));
        tvResult13.setText(Double.toString(result13));
        tvResult15.setText(Double.toString(result15));
        tvResult16.setText(Double.toString(result16));
        tvResult17.setText(Double.toString(result17));

    }
}
