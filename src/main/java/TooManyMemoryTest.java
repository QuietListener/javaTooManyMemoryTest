import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TooManyMemoryTest {

    static class TestObj {
        private String str;

        public TestObj(String str){
            this.str = str;
        }
    }

    private static  Map<String,TestObj> map = new HashMap<String,TestObj>();

    public static void main(String [] args) throws Exception{

        for(int i = 0; i < 100000;i++){
            map.put(i+"",new TestObj(new Random().nextLong()+"asfasdfa"));
        }
        TimeUnit.SECONDS.sleep(1000);
    }
}
