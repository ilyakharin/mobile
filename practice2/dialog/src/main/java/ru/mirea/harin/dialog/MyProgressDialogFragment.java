package ru.mirea.harin.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyProgressDialogFragment extends ProgressDialog{

    public MyProgressDialogFragment(Context context){
        super(context);
        this.setTitle("ProgressDialog");
        this.setMessage("Downloading");
        this.setButton(Dialog.BUTTON_POSITIVE, "OK", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
    }}