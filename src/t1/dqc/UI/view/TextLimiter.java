package t1.dqc.UI.view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class TextLimiter implements ChangeListener<Number> {

    //Limiting value of the amount of characters
    private int limit;
    
    //Text Field that is being limited
    private TextField textField;
    
    
    //Constructor passing in limit of characters and the text field
    public TextLimiter(int limit, TextField textField){
        this.limit = limit;
        this.textField = textField;
    }
    
    
    @Override
    public void changed(ObservableValue <? extends Number>observable, Number oldValue,
            Number newValue) {
        // TODO Auto-generated method stub
        if (newValue.intValue() > oldValue.intValue()) {
            // Check if the new character is greater than LIMIT
            if (textField.getText().length() >= limit) {

                // if it's 11th character then just setText to previous
                // one
                textField.setText(textField.getText().substring(0, limit));
            }
        }

    }
}