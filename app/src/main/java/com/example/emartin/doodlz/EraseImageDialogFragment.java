package com.example.emartin.doodlz;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


//A DialogFragment that's displayed when the user taps CLEAR or shakes the device to erase the current drawing
public class EraseImageDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle bundle){

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setMessage(R.string.message_erase);
        builder.setCancelable(false);

        builder.setPositiveButton(R.string.button_erase,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        getDoodleFragment().getDoodleView().clear();
                    }
                }
        );

        builder.setNegativeButton(R.string.button_cancel, null);

        return builder.create();
    }

    private DoodleFragment getDoodleFragment(){

        return (DoodleFragment) getFragmentManager().findFragmentById(
                R.id.doodleFragment);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        DoodleFragment fragment = getDoodleFragment();

        if(fragment != null)
            fragment.setDialogOnScreen(true);
    }

    @Override
    public void onDetach(){
        super.onDetach();
        DoodleFragment fragment = getDoodleFragment();

        if(fragment != null)
            fragment.setDialogOnScreen(false);
    }

}
