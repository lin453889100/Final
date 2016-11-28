/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland-air
 */
public class OptionsModel {
    private String playerName;
    private int difficulty;
    private Object sex;

    
    OptionsModel()
    {

    }
    
    public void setName(String playerName) {
        this.playerName = playerName;
    }
            
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        
    }
    public void setSex(Object sex)
    {
        this.sex = sex;
    }

}
