package XMLFormat;

import java.util.ArrayList;
import java.util.Scanner;

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
        dataList.trimToSize();
        return dataList;
    }
    private ArrayList separateEntryData(String name){
        ArrayList nameList=new ArrayList();
        for(int i=0;i<name.length();i++){
            if(Character.isWhitespace(name.charAt(i))){
                nameList.add(name.substring(0,i));
                name=name.substring(i+1);
                i=0;
            }
        }
        nameList.add(name);
        return nameList;
    }
    public void display(ArrayList<ArrayList> dataList){
    	System.out.println("<Names>");    	
    	for(ArrayList list:dataList){
    		System.out.println("\t<Line>");
            for(Object subList:list)
    		System.out.printf("\t\t<Name>%s<Name>%n",subList.toString());
            System.out.println("\t<Line>");
            }
    	System.out.println("<Names>");
    }
}
