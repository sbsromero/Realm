package com.sbsromero.section_04_room.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sbsromero.section_04_room.R;

public class BoardActivity extends AppCompatActivity {

    private FloatingActionButton btnFabAddBoard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        btnFabAddBoard = (FloatingActionButton) findViewById(R.id.fabAddBoard);
        btnFabAddBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertForCreatingBoard("Agregar nuevo tablero","Description de tablero");
            }
        });
    }

    /**CRUD Actions**/
    private void createNewBoard(final String boardName) {

    }

    /**Dialogs**/
    private void showAlertForCreatingBoard(String title, String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(title != null){
            builder.setTitle(title);
        }
        if(message != null){
            builder.setMessage(message);
        }
        View viewInflated = LayoutInflater.from(this).inflate(R.layout.dialog_create_board,null);
        builder.setView(viewInflated);

        final EditText input = (EditText) viewInflated.findViewById(R.id.editTextNewBoard);

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String boardName = input.getText().toString().trim();
                if(boardName.length() > 0){
                    createNewBoard(boardName);
                }
                else{
                    Toast.makeText(getApplicationContext(),"El nombre es requerido",Toast.LENGTH_SHORT).show();
                }
            }
        });

        builder.create().show();

    }


}
