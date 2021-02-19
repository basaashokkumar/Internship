import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Contactarray {
    public void addValues(int sno[],String name[],long number[]){
        //ArrayList<Data> list=new ArrayList<Data>();
        for(int i=0;i<4;i++)
        {

            //list.add(new Contacts(sno[i],name[i],number[i]));
        }
           // display(list);
    }
    public void display(ArrayList<Data> list)
    {
        for(int i=0;i<4;i++){
            Data data= list.get(i);
        }
    }

    class Contacts{
        int sno;
        String name;
        long number;
        Contacts(int sno,String name,long number){
            this.sno=sno;
            this.name=name;
            this.number=number;
        }
    }


    public static void main(String[] args) {
        int sno[]={1,2,3,4};
        String name[]={"Ashok","Samson","Amandeep","Malleswari"};
        long number[]={12345,23456,34567,45678};
        Contactarray listed=new Contactarray();
        listed.addValues(sno,name,number);

    }
}
