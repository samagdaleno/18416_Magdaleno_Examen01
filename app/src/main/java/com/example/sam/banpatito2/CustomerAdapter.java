package com.example.sam.banpatito2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Sam on 08/09/2017.
 */

public class CustomerAdapter  extends ArrayAdapter<CustomerModel> {

    public CustomerAdapter(Context context){ super(context, R.layout.linearlay, R.id.textCustomer);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View oView = super.getView(position, convertView, parent);


        TextView txtCustNumber = (TextView) oView.findViewById(R.id.txtCustNumber);
        TextView txtCustName = (TextView) oView.findViewById(R.id.textCustomer);
        TextView txtCustOps = (TextView) oView.findViewById(R.id.txtCustOps);

        final CustomerModel oCustomer = this.getItem(position);
        txtCustNumber.setText(oCustomer.getNumber());
        txtCustName.setText(oCustomer.getName());
        txtCustOps.setText(oCustomer.getOperations());
        return oView;
    }
}
