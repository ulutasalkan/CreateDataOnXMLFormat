package XMLFormat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aulutas on 20.03.2017.
 */
public class XMLDataFormat {
    private Scanner kb;
    private ArrayList dataList;
    public XMLDataFormat(){
        dataList=new ArrayList();
        kb=new Scanner(System.in);
    }
    public ArrayList createDataStructure(){
        for(System.out.println("Start to data entry");;){
            String name=kb.nextLine();
            if(name.equals("exit"))
                break;
            dataList.add(separateEntryData(name));
        }
        return dataList;
    }
    private ArrayList separateEntryData(String name){
        ArrayList nameList=new ArrayList();
        for(int i=0;i<name.length();i++){
            if(Character.isWhitespace(name.charAt(i))){
                nameList.add(name.substring(0,i));
                name=name.substring(i+1);
            }
        }
        return nameList;
    }
    public void display(ArrayList dataList){
        for(Object o : dataList)
            System.out.println(o);
    }

}

