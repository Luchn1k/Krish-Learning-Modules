package com.kalana.rentacar.springpractical;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndPoint {
    private Map<String,Stage> stagesMap = new ConcurrentHashMap<>();
    @ReadOperation
    public Map<String,Stage> getStagesMap(){
        return stagesMap;
    }
    @ReadOperation
    public Stage getStage(@Selector String key){
        return stagesMap.get(key);
    }
    @WriteOperation
    public void addStage(@Selector String name,int stage){
        this.stagesMap.put(name,new Stage(stage));
    }


    static class Stage{
        private int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
