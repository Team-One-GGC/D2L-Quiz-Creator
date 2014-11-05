package t1.dqc.UI.view;

import java.time.LocalDate;
import java.time.Month;

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
        statusChoice.setValue(QuizFactory.isActive(quiz));
        
        //TODO needs to be able to handle quizzes with no dates specified
        startDate.setValue(QuizFactory.getStartDate(quiz));
        endDate.setValue(QuizFactory.getEndDate(quiz));
        
//        startHour.setText(value);
        
        passwordEnable.setSelected(true);
        password.setText(QuizFactory.getPassword(quiz));
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
    
}
