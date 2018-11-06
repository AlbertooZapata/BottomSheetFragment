package com.materiales.recursos.bottonsheets;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class BottomDialogFragment extends BottomSheetDialogFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);


        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //asigno el estilo greado en el archivo de styles.xml para quitar el fondo
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);
        return super.onCreateDialog(savedInstanceState);

    }
}
