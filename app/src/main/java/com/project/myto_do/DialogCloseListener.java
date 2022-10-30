package com.project.myto_do;

import android.content.DialogInterface;

public interface DialogCloseListener {
    public default void handleDialogClose(DialogInterface dialog){
    }
}
