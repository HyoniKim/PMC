package com.example.gimjihyeon.protectmycosmetic;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gimjihyeon.protectmycosmetic.ui.BaseActivity;

import java.util.Calendar;

/**
 * Created by gimjihyeon on 2017. 3. 23..
 */

public class DatePickerFragment extends BaseActivity implements View.OnClickListener {

    Button cip_btn_datePicker;
    TextView cip_edt_datePicker;
    private int mYear, mMonth, mDay;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputcosmetic_layout);

        cip_btn_datePicker = (Button) findViewById(R.id.datePicker);
        cip_btn_datePicker.setOnClickListener(this);
        cip_edt_datePicker = (TextView) findViewById(R.id.txt_selectedDatePicker);
        cip_edt_datePicker.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == cip_btn_datePicker) {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog
                    = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                    cip_edt_datePicker.setText(year + "년 " + (monthOfYear + 1) + "월 " + dayOfMonth + "일");

                }
            }, mYear, mMonth, mDay);
            datePickerDialog.show();

        }
    }


}
