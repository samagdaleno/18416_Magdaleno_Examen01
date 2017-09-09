package com.example.sam.banpatito;

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

    public CustomerAdapter(Context context){ super(context, R.layout.linearlay, R.id.txtCustName);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View oView = super.getView(position, convertView, parent);

        TextView txtCustName = (TextView) oView.findViewById(R.id.txtCustName);
        TextView txtCustNumber = (TextView) oView.findViewById(R.id.txtCustNumber);
        TextView txtCustOps = (TextView) oView.findViewById(R.id.txtCustOps);

        CustomerModel oCustomer = this.getItem(position);
        txtCustName.setText(oCustomer.getName());
        txtCustNumber.setText(oCustomer.getNumber());
        txtCustOps.setText(oCustomer.getOperations());
        return oView;
    }
}
