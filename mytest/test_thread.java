public class test_thread {
    public static void main(String[] args) throws InterruptedException{
       final StringBuffer stringBuffer= new StringBuffer("ini") ;
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                String mid=callApi();
                stringBuffer.append(mid);
                Sink(mid);
            }
        });
/*        String mid=callApi();
        stringBuffer.append(mid);*/
        thread.start();
        thread.join();
        Sink(stringBuffer);
    }

    public static String callApi(){
        return "taintInformation";
    }
    public static void Sink(StringBuffer string){

    }
    public static void Sink(String string){

    }

}
