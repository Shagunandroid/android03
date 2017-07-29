package android.app.shagun.dialogexample;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void progess_dialog_box(View view) {
        ProgressDialog pdialog = new ProgressDialog(this); //Int.. of dialog box
        pdialog.setMessage("Loading, Please Wait"); //Setting message
        pdialog.show(); // make dialog box visible
    }

    public void dialog_box(View view) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("My dialog box")
                .setMessage("This is my dialog box")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "User pressed Yes button", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "User pressed No button", Toast.LENGTH_SHORT).show();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }

    public void custom_dialog_box(View view) {

        final Dialog dialog = new Dialog(this); //Int.. of dialog box
        dialog.setContentView(R.layout.dialog_layout); //Content
        dialog.show(); //Dialog box visible

        Button hide = (Button)dialog.findViewById(R.id.button4);
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); //unvisible dialog box
            }
        });

    }
}
