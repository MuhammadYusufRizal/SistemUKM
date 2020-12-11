package com.example.sistemukm;


import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter> {
    int custom_list_item;
    SQLiteDatabase mDatabase;

    private Context context;
    private List<Mahasiswa> mhsList;

    public MahasiswaAdapter(Context context, int custom_list_item, List<Mahasiswa> mhsList, SQLiteDatabase mDatabase){
        this.context = context;
        this.custom_list_item = custom_list_item;
        this.mDatabase = mDatabase;
        this.mhsList = mhsList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(RecyclerView.ViewHolder parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_ukm, null);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        final Mahasiswa mhs = mhsList.get(position);

        holder.txtName.setText(mhs.getNama());
        holder.txtNim.setText(mhs.getNim());
        holder.txtJurusan.setText(mhs.getJurusan());
        holder.txtFakultas.setText(mhs.getFakultas());
        holder.txtEmail.setText(mhs.setEmail(););
        holder.txtWa.setText(mhs.getWa());

        holder.updateReq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateRequest(mhs);
            }
        });
    }

    void reloadMahasiswaFromDatabase() {
        Cursor mhs = mDatabase.rawQuery("SELECT * FROM UKM", null);
        if (mhs.moveToFirst()) {
            mhsList.clear();
            do {
                mhsList.add(new Mahasiswa(
                        mhs.getInt(0),
                        mhs.getString(1),
                        mhs.getString(2),
                        mhs.getString(3),
                        mhs.getString(4),
                        mhs.getString(5),
                        mhs.getString(6)));
            } while (mhs.moveToNext());
        }
        mhs.close();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mhsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtHarga, txtExpDate, txtJumlah;
        ImageView editbtn, deletebtn;
        ImageButton edtStock;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            txtName = itemView.findViewById(R.id.tv_nama);
//            txtHarga = itemView.findViewById(R.id.tv_harga);
//            txtJumlah = itemView.findViewById(R.id.tv_jumlah);
//            txtExpDate = itemView.findViewById(R.id.tv_exp_date);
//
//            deletebtn = itemView.findViewById(R.id.buttonDeleteStudent);
//            edtStock = itemView.findViewById(R.id.btn_edt_stock);
        }
    }

    private void updateProduct(final Mahasiswa mhs) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_update, null);
        builder.setView(view);
        builder.setCancelable(true);


//        final EditText editTextName = view.findViewById(R.id.editTextName);
//        final EditText editJumlah = view.findViewById(R.id.editStock);
//        final Button btnSubmit = view.findViewById(R.id.btn_submit);


//        editTextName.setText(product.getNama());
//        editJumlah.setText(product.getJumlah());

        final AlertDialog dialog = builder.create();


        builder.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                String name = editTextName.getText().toString().trim();
//                String jumlah = editJumlah.getText().toString().trim();


//                if (name.isEmpty()) {
//                    editTextName.setError("Name can't be blank");
//                    editTextName.requestFocus();
//                    return;
//                }


                String sql = "UPDATE Obat SET Jumlah = ? WHERE id = ? ";

//                mDatabase.execSQL(sql, new String[]{jumlah, String.valueOf(product.getId())});
//                Toast.makeText(mCtx, "Product Updated", Toast.LENGTH_SHORT).show();
//                reloadProductFromDatabase();
//                dialog.dismiss();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
