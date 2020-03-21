import com.configcat.*;

import java.io.IOException;

/**
 * @author yuchlin on 3/21/20
 */
public class ConfigCatExample {

    public static void main(String[] args){

        // args[0] <-- This is the actual API key for your Production environment

        ConfigCatClient client = new ConfigCatClient(args[0]);

        try{

            Boolean isAwesomeFeatureEnabled = client.getValue(Boolean.TYPE, "isAwesomeFeatureEnabled", true);

            System.out.println("isAwesomeFeatureEnabled's value from ConfigCat: " + isAwesomeFeatureEnabled);

            client.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
