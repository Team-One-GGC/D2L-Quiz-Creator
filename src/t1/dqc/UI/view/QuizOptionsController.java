package t1.dqc.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class QuizOptionsController {

    //Quiz Name text field
    @FXML
    private TextField quizName;
    
    //Status drop down menu
    @FXML
    private ComboBox<String> statusChoice;
    
    //Quiz Start Date
    @FXML
    private DatePicker startDate;
    
    //Quiz Start Time
    @FXML
    private TextField startHour;
    @FXML
    private TextField startMin;
    @FXML
    private ComboBox<String> startAMPM;
    
    //Quiz End Date
    @FXML
    private DatePicker endDate;
    
    //Quiz End Time
    @FXML
    private TextField endHour;
    @FXML
    private TextField endMin;
    @FXML
    private ComboBox<String> endAMPM;
    
    //Quiz Password
    @FXML
    private TextField password;
    
    //Quiz Password enabled
    @FXML
    private CheckBox passwordEnable;
    
    //Quiz Time Limit
    @FXML
    private TextField timeLimit;
    
    //Quiz Time Limit enabled
    @FXML
    private CheckBox timeLimitEnabled;
    
    //Quiz Attempts Limit
    @FXML
    private TextField attemptLimit;
    
    //Value of Quiz Status
    private String quizStatus;
    
    //Limit of time fields
    private final int LIMIT = 2;
    
    
    //Constructor for Quiz Options Controller
    public QuizOptionsController(){
        
    }
    
    //Initialization
    public void initialize(){
        //Initialize logic for combo box
        statusChoice.getItems().clear();
        statusChoice.getItems().addAll("Enabled","Disabled");
        startAMPM.getItems().clear();
        startAMPM.getItems().addAll("AM", "PM");
        endAMPM.getItems().clear();
        endAMPM.getItems().addAll("AM", "PM");
        setFields();
    }
    
    //Selecting Quiz Status
    public void quizStatusSelect(){
       quizStatus = statusChoice.getValue();
       System.out.println("Quiz status is " + quizStatus);
    }
    
    //@FXML
    //Limit Text in Time Fields
   /* public void timeFieldLimiter(){
        if (timeField.getText().length() >= LIMIT) {

            // if it's 11th character then just setText to previous
            // one
            timeField.setText(timeField.getText().substring(0, LIMIT));
        }*/
    //}
    
    //Set fields to Quiz values
    @FXML
    public void setFields(){
    
    }
    
    //Save values to Quiz Object
    @FXML
    public void saveValues(){
        
    }
    
    //Cancel Changes and close stage
    @FXML
    public void cancelSaves(){
        
    }
    
}
