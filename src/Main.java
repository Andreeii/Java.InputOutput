
public class Main {
    public static void main(String[]args) {
        Help ob = new Help("C:\\Users\\Andrei Turcanu\\Documents\\help.txt");
        String topic;
        System.out.println("Try the help system "+ "Enter'stop' to end");

        do{
            topic = ob.getSelection();
            if(!ob.helpOn(topic)){
                System.out.println("Topic not found\n");
            }
        }while (topic.compareTo("stop")!=0);
    }
}
