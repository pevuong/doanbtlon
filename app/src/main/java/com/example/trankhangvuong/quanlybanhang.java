package com.example.trankhangvuong;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class quanlybanhang extends AppCompatActivity {

    Button bttTao, bttXoa, bttcapnhat, btthienthi;

    EditText editMS, edittenSV, editphai, edidhienthi;
    public boolean doAction(string sql)
    {
        SQLiteDatabase database=null;
        try {
            database= SQLiteDatabase.openOrCreateDatabase("qlsinhvien.db", null);
            databese=.execSQL(sql);
            return false;
        }
        finally {
            database.close();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlybanhang);

        bttTao= (Button) findViewById(R.id.bttTao);
        bttXoa =(Button) findViewById(R.id.bttXoa);
        bttcapnhat =(Button) findViewById(R.id.bttcapnhat);
        btthienthi =(Button) findViewById(R.id.btthienthi);
        editMS =(EditText)findViewById(R.id.editMS);
        edittenSV =(EditText)findViewById(R.id.edittenSV);
        editphai =(EditText)findViewById(R.id.editphai);
        edidhienthi=(EditText)findViewById(R.id.edidhienthi);

    }
    public void them()
    {
        String MaSV=editMS.getTest().toString();
        String tenSV=editMS.getTest().toString();
        String phai=editMS.getTest().toString();

        String sql="Insert into SINHVIEN (MaSV, tenSV, phai";
        sql+="Valuse('"+MaSV"','"+tenSV"','"+phai"')";

        if(doAction(sql)==true)
        {
            Toast.makeText(this,"them thanh cong",Toast.LENGTH_LONG);
            editMS.setText("");
            editten.setText("");
            editphai.setText("");
            editMS.findFocus();
        }
        else
            Toast.makeText(this, "them khong thanh cong", Toast.LENGTH_SHORT).show();
    }
//test push
    public void xoa()
    {
        String MaSV=editMS.getTest().toString();
        String tenSV=editMS.getTest().toString();
        String phai=editMS.getTest().toString();

        String sql="Insert into SINHVIEN (MaSV, tenSV, phai";
        sql+="Valuse('"+MaSV"','"+tenSV"','"+phai"')";

        if(doAction(sql)==true)
        {
            Toast.makeText(this,"xoa thanh cong",Toast.LENGTH_LONG);
            editMS.setText("");
            editten.setText("");
            editphai.setText("");
            editMS.findFocus();
        }
        else
            Toast.makeText(this, "xoa khong thanh cong", Toast.LENGTH_SHORT).show();
    }

SQLiteDatabase database=null;
    String sql="Selete+Frow SINHVIEN Order by tenSV";
    String msg="";


}