package ru.mirea.harin.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ru.mirea.harin.dialog.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowTimeDialog(View v){
        MyTimeDialogFragment time = new MyTimeDialogFragment();
        time.show(getSupportFragmentManager(),"mirea");
    }

    public void onClickShowDateDialog(View v){
        MyDateDialogFragment time = new MyDateDialogFragment();
        time.show(getSupportFragmentManager(),"mirea");
    }

    public void onClickShowProgressDialog(View v){
        MyProgressDialogFragment time = new MyProgressDialogFragment(this);
        time.show();

    }

}