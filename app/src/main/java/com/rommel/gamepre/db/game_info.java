package com.rommel.gamepre.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Rommel on 17.6.10.
 */

public class game_info extends DataSupport {
    private String bisaibianhao;
    private String team_home;
    private String team_away;
    private float sheng_chu;
    private float ping_chu;
    private float fu_chu;
    private float sheng_zhong;
    private float ping_zhong;
    private float fu_zhong;
    public String getBisaibianhao(){
        return bisaibianhao;
    }
    public void setBisaibianhao(String bisaibianhao){
        this.bisaibianhao=bisaibianhao;
    }
    public String get_Team_home(){
        return team_home;
    }
    public void setTeam_home(String team_home){
        this.team_home=team_home;
    }
    public String getTeam_away(){
        return team_away;
    }
    public void setTeam_away(String team_away){
        this.team_away=team_away;
    }
    public float getSheng_chu(){
        return sheng_chu;
    }
    public void setSheng_chu(float sheng_chu){
        this.sheng_chu=sheng_chu;
    }
    public float getPing_chu(){
        return ping_chu;
    }
    public void setPing_chu(float ping_chu){
        this.ping_chu=ping_chu;
    }
    public float getFu_chu(){
        return fu_chu;
    }
    public void setFu_chu(float fu_chu){
        this.fu_chu=fu_chu;
    }
    public float getSheng_zhong(){
        return sheng_zhong;
    }
    public void setSheng_zhong(float sheng_zhong){
        this.sheng_zhong=sheng_zhong;
    }
    public float getPing_zhong(){
        return ping_zhong;
    }
    public void setPing_zhong(float ping_chu){
        this.ping_zhong=ping_zhong;
    }
    public float getFu_zhong(){
        return fu_zhong;
    }
    public void setFu_zhong(float fu_zhong){
        this.fu_zhong=fu_zhong;
    }



}
