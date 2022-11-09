/*
 * Guess Master 3.0
 * Author: Jake Moffat
 * Student ##: 20212243
 * Date: April 13, 2021
 *
 */

package com.example.guessmaster;

import java.util.Random;

import com.example.guessmaster.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.DialogInterface;



public class GuessMaster extends AppCompatActivity {
    //Setting up access to layout
    private TextView entityName;
    private TextView ticketsum;
    private Button guessButton;
    private EditText userIn;
    private Button btnclearContent;
    private String user_input;
    private ImageView entityImage;
    private String answer;

    // Instances and Variables from GuessMaster 2.0
    //used to store all entities and ticket info
    private int numberOfEntities;
    private final Entity[] entities;
    private int wonTickets = 0;
    private int totalTickets = 0;
    //Stores Entity Name
    private String entName;
    private int entityId;
    private Entity currentEntity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Further setting up access to layout
        guessButton = (Button) findViewById(R.id.btnGuess);
        userIn = (EditText) findViewById(R.id.guessinput);
        ticketsum = (TextView) findViewById(R.id.ticket);
        entityName = (TextView) findViewById(R.id.entityName);
        btnclearContent = (Button) findViewById(R.id.btnClear);
        entityImage = (ImageView) findViewById(R.id.entityImage);

        Politician jTrudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);////
        Singer cDion = new Singer("Celine Dion", new Date("March", 30, 1961), "Female", "La voix du bon Dieu", new Date("November", 6, 1981), 0.5);////
        Person myCreator = new Person("My Creator", new Date("September", 1, 2000), "Female", 1);////
        Country usa = new Country("United States", new Date("July", 4, 1776), "Washinton D.C.", 0.1);////

        //Set up Run game (or main activity)
        new GuessMaster();
        //Adding entities
        addEntity(jTrudeau);
        addEntity(cDion);
        addEntity(myCreator);
        addEntity(usa);
        //Picking an random entity and displaying the welcome message
        changeEntity();
        welcomeToGame(currentEntity);

        // Change entity
        btnclearContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeEntity();
            }
        });

        //Submit guess
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGame(currentEntity);
            }
        });
    }

    //Changes current entity
    public void changeEntity() {
        userIn.getText().clear();
        entityId = genRandomEntityId();
        Entity entity = entities[entityId];
        entName = entity.getName();
        entityName.setText(entName);
        ImageSetter();
        currentEntity = entity;
    }

    //Cases to change the images accordingly
    public void ImageSetter() {
        String name = entName;
        switch (name) {
            case "Justin Trudeau":
                entityImage.setImageResource(R.drawable.justint);
                break;
            case "Celine Dion":
                entityImage.setImageResource(R.drawable.celidion);
                break;
            case "My Creator":
                entityImage.setImageResource(R.drawable.joshawatt);
                break;
            case "United States":
                entityImage.setImageResource(R.drawable.usaflag);
                break;
        }
    }

    //provides welcome message to game
    public void welcomeToGame(Entity entity) {
        AlertDialog.Builder welcomealert = new AlertDialog.Builder(GuessMaster.this);
        welcomealert.setTitle("GuessMaster 3.0");
        welcomealert.setMessage(entity.welcomeMessage());
        welcomealert.setCancelable(false);
        welcomealert.setNegativeButton("START GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(), "Game is Starting...Enjoy", Toast.LENGTH_SHORT).show();
            }
        });
        welcomealert.show();
    }

    //Sets up initial variables when starting game
    public GuessMaster() {
        numberOfEntities = 0;
        entities = new Entity[10];
        totalTickets = 0;
    }

    //Adds entities to entities array
    public void addEntity(Entity entity) {
//		entities[numberOfEntities++] = new Entity(entity);
//		entities[numberOfEntities++] = entity;//////
        entities[numberOfEntities++] = entity.clone();
    }

    //Calls playgame if only entitId passed
    public void playGame(int entityId) {
        Entity entity = entities[entityId];
        playGame(entity);
    }

    //Main play game code
    public void playGame(Entity entity) {
        //Takes in user input from userIn editText
        entityName.setText(entity.getName());
        answer = userIn.getText().toString();
        answer = answer.replace("\n", "").replace("\r","");
        Date date = new Date(answer);


        if (date.precedes(entity.getBorn())) {
            //Early guess statement
            AlertDialog.Builder alert = new AlertDialog.Builder(GuessMaster.this);
            alert.setTitle("Incorrect");
            entityImage.setImageResource(R.drawable.ic_error_outline_black_24dp); //sets entity image to an error sign
            alert.setMessage("Try a later date");
            alert.setNegativeButton("Ok", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    ImageSetter(); // change the entity image back to its original after dismissing pop up
                }
            });
            alert.show();
        } else if (entity.getBorn().precedes(date)) {
            //Late guess statement
            AlertDialog.Builder alert = new AlertDialog.Builder(GuessMaster.this);
            alert.setTitle("Incorrect");
            entityImage.setImageResource(R.drawable.ic_error_outline_black_24dp);
            alert.setMessage("Try an earlier date");
            alert.setNegativeButton("Ok", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    ImageSetter();
                }
            });
            alert.show();
        } else { //In case of correct guess
            //Update tickets won
            wonTickets = entity.getAwardedTicketNumber();
            totalTickets += wonTickets;
            String totalTicks = (new Integer(totalTickets)).toString();

            //AlertDialog for if you had a correct guess
            AlertDialog.Builder alert = new AlertDialog.Builder(GuessMaster.this);
            alert.setTitle("You won");
            entityImage.setImageResource(R.drawable.ic_check_circle_black_24dp);
            alert.setMessage("BINGO! \n" + entity.closingMessage());
            alert.setCancelable(false);
            alert.setNegativeButton("Continue", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(getBaseContext(), "You have " + totalTicks + " tickets", Toast.LENGTH_SHORT).show();
                    continueGame(); //Changes entity
                }
            });
            ticketsum.setText("Total Tickets: " + totalTicks);
            alert.show();
        }
    }

    public void continueGame(){ //Changes current entity and clears userIn
        userIn.getText().clear();
        changeEntity();
    }

    // Picks random entity and then calls main playgame method
    public void playGame() {
        int entityId = genRandomEntityId();
        playGame(entityId);
    }

    //Returns Id of entity in arr not out of bounds
    public int genRandomEntityId() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(numberOfEntities);
    }

}
