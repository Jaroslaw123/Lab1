package punkt_materialny;
/* @author Jarek
 */
public class punkt_materialny { 
    private int masa;   
      public void opis(){         //metoda opisująca punkt materialny  
        System.out.print("Punkt Materialny:" );
    }
     public punkt_materialny(){ //zadeklarowanie konstruktora domyślnego
      this.masa=1;
          }
     public punkt_materialny(int M){ //zadeklarowanie konstruktora z parametrem
       
         this.masa=M;
      }
     public void ustawienie_masy(int nadanie_masy){ //metoda zmieniająca masę punktu
        if(nadanie_masy<=0){                        //warunek nadania masy 
            System.out.println("masa nie może być <=0");
        } 
        else 
        {
         masa=nadanie_masy;
         System.out.println("Nadanie masy:"+masa);
         }
         }
         public int pobierz_mase()
         {
         return masa;    
         }
          public int głowny_moment_bezwladnosci(){ //główny moment bezwładności
          return 0;
         }
         public float moment_bezw_Satiner(float odleglosc)//moment bezwładności
         {                                                //względem przesuniętej osi
          return głowny_moment_bezwladnosci() + masa*odleglosc*odleglosc;
                 }
     
     
          public static void main(String[] args) 
                 
         {
          punkt_materialny p1 = new punkt_materialny();// Podpunkt 1
          punkt_materialny p2 = new punkt_materialny(10);// Podpunkt 2
          p1.opis();                                    //Podpunkt 3
          System.out.println("1");
          System.out.println("Masa punktu 1: " + p1.pobierz_mase());
          System.out.println("Główny moment bezwładności p1:  "+p1.głowny_moment_bezwladnosci());
          System.out.println("wartość momentu z TW Steinera p1"+p1.moment_bezw_Satiner(2));
           p2.opis();
          System.out.println("2");
          System.out.println("Masa punktu 2: " + p2.pobierz_mase());
          System.out.println("Główny moment bezwładności p2:  "+p2.głowny_moment_bezwladnosci());
          System.out.println("wartość momentu z TW Steinera p2"+p2.moment_bezw_Satiner(2));
         
         p1.ustawienie_masy(6);                        //Podpunkt 4
         System.out.println("masa p1:"+p1.pobierz_mase());
         System.out.println("główny moment bezwładnosci p1:"+p1.głowny_moment_bezwladnosci());
         System.out.println("wartosc momentu z TW Steinera:"+p1.moment_bezw_Satiner(2));
         
         punkt_materialny[] tablica_punkt=new punkt_materialny[4]; // Podpunkt 6
         for(int i=0; i< tablica_punkt.length; i++ ){
        
         tablica_punkt[i]=new punkt_materialny(5+i);

         }

          for(int i=0; i< tablica_punkt.length; i++ ) //Podpunkt 7
          {
             tablica_punkt[i].opis() ;
         System.out.println(" "+i);
         System.out.println("masa obiektu o numerze:  " +i+"   wynosi:  "+tablica_punkt[i].pobierz_mase());
         System.out.println("główny moment bezwładnosci dla punktu o numerze:" +i +"  wynosi:" +tablica_punkt[i].głowny_moment_bezwladnosci());
         System.out.println("Moment bezwładności względem przesuniętej osi dla punktu o numerze: " +i+"  wynosi:   " +tablica_punkt[i].moment_bezw_Satiner(i+2));
          }
         }
         }
     
     


