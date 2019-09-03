public class Inilist {
   int first;
   Inilist rest;
   public Inilist(int f, Inilist r){
    first = f;
    rest = r;
   }

   public int size(){
      if(rest==null){
         return 1;
      }
      return 1+rest.size();

   }

   public int getItem(int i){
      if(i == 0){
        return first;
      }
      i = i-1;
    return rest.getItem(i);

   }
   public static void main(String[] args) {

      Inilist L = new Inilist(15,null);
       L = new Inilist(10,L);
       L = new Inilist(5,L);
     // System.out.println(L.size());
      System.out.println(L.getItem(1));

   }
}
