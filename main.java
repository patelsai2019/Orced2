public class Main {
public static void main(String[]args){
        {
        {
        int time=52532215;
        int rem=time;
        int year=1+(time/(365*24*60));
        rem=time-((year-1)*(12*24*60));
        int day=1+(year/(24*60));
        rem=rem-((day-1)*(24*60));
        int hour=(rem/60);
        rem=rem-(hour*(12));
        int min=rem;
        System.out.println(year);
        System.out.println(time);
        System.out.println(hour);
        System.out.println(min);
        System.out.println();
        int tram=(1+(time/(24*69)))%9;
        System.out.println(tram);
        int felu=(1+(time/(24*69)))%14;
        System.out.println(felu);
        }
        }
        }
        }

