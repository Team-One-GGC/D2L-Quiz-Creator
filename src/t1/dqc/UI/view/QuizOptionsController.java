package t1.dqc.UI.view;

import java.time.LocalDate;

import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.quiz.QuizFactory;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class QuizOptionsController {
    
  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;

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
    private final int TIMELIMITER = 2;
  
    
    //Constructor for Quiz Options Controller
    public QuizOptionsController(){
       
    }
    
    //Set Quiz Name Text field
    public void setQuizName(String quizName){
        this.quizName.setText(quizName);
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
//        setFields(null);
        startHour.lengthProperty().addListener(new TextLimiter(TIMELIMITER, startHour));
        startMin.lengthProperty().addListener(new TextLimiter(TIMELIMITER, startMin));
        endHour.lengthProperty().addListener(new TextLimiter(TIMELIMITER, endHour));
        endMin.lengthProperty().addListener(new TextLimiter(TIMELIMITER, endMin));
    }
    
    //Selecting Quiz Status
    public void quizStatusSelect(){
       quizStatus = statusChoice.getValue();
       System.out.println("Quiz status is " + quizStatus);
    }
    
    //Set fields to Quiz values
    public void setFields(Quiz quiz){
        statusChoice.setValue(QuizFactory.getActive(quiz));
        
        LocalDate start = QuizFactory.getStartDate(quiz);
        LocalDate end = QuizFactory.getEndDate(quiz);
        if(start != null)
            startDate.setValue(start);
        if(end != null)
            endDate.setValue(end);
        
        //Returns military time ex. 17:30
        //String must be split
        String startTime = QuizFactory.getStartTime(quiz);
        String endTime = QuizFactory.getEndTime(quiz);
        timeConversion(startTime, endTime);
        
        timeLimit.setText(QuizFactory.getTimeLimit(quiz));
        
        attemptLimit.setText(QuizFactory.getAttempsAllowed(quiz));
        
        passwordEnable.setSelected(true);
        password.setEditable(true);
        password.setDisable(false);
        password.setText(QuizFactory.getPassword(quiz));
    }
    
    private void timeConversion(String startTime, String endTime)
    {
        int sHour = Integer.parseInt(startTime.split(":")[0]);
        int sMin = Integer.parseInt(startTime.split(":")[1]);
        
        int eHour = Integer.parseInt(endTime.split(":")[0]);
        int eMin = Integer.parseInt(endTime.split(":")[1]);
        
        if(sHour > 12)
        {
            startAMPM.setValue("PM");
            sHour -= 12;
        }
        else if(sHour == 12)
            startAMPM.setValue("PM");
        else
            startAMPM.setValue("AM");
        
        if(eHour > 12)
        {
            endAMPM.setValue("PM");
            eHour -= 12;
        }
        else if(eHour == 12)
            endAMPM.setValue("PM");
        else
            endAMPM.setValue("AM");
        
        this.startHour.setText(Integer.toString(sHour));
        this.startMin.setText(Integer.toString(sMin));
        this.endHour.setText(Integer.toString(eHour));
        this.endMin.setText(Integer.toString(eMin));
    }
    
    //Save values to Quiz Object
    @FXML
    public void saveValues(){
        
    }
    
    //Cancel Changes and close stage
    @FXML
    public void cancelSaves(){
        mainQuizCreator.showD2LQuizCreatorMain();
    }
    
    public void setMainQuizCreator(MainQuizCreator mainQuizCreator){
        this.mainQuizCreator = mainQuizCreator;   
    }
    
    //Disable password text field if password check box is off
    @FXML
    public void disableEnablePassword(){
        boolean passCheck = passwordEnable.isSelected();
        changePassword(passCheck);
    }
    
    private void changePassword(boolean check)
    {
        password.setEditable(check);
        password.setDisable(!check);
    }
    
    //Disable time limit text field if password check box is off
    @FXML
    public void disableEnableTimeLimit(){
        boolean timeCheck = timeLimitEnabled.isSelected();
        changeTimeLimit(timeCheck);
    }
    
    private void changeTimeLimit(boolean check)
    {
        timeLimit.setEditable(check);
        timeLimit.setDisable(!check);
    }
    
}
