public class HelloWorldWithMethodAndArg{
    String maCHaine;
    public void Hello(){
        System.out.println(this.maCHaine);
    }
 public static void main(String [] args){
  HelloWorldWithMethodAndArg s=new HelloWorldWithMethodAndArg();
  s.maCHaine = "Salut";
  s.Hello();
 }
}