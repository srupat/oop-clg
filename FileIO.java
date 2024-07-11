import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PositiveNumberException extends Exception{
    public PositiveNumberException(String message){
        super(message);
    }
}

public class FileIO {
    public static void main(String[] args) throws PositiveNumberException {
        try {
            Scanner sc = new Scanner(new FileInputStream("input.txt"));
            String strings = sc.nextLine();
//            System.out.println(strings);
            String[] s = strings.split("\\s+");
            List<Integer> list = new ArrayList<>();
            for(String string : s){
                list.add(Integer.parseInt(string));
            }
            for(int i : list){
                System.out.println(i);
                if(i > 0){
                    throw new PositiveNumberException("It is a positive number bro");
                }
            }



        }
        catch(FileNotFoundException | PositiveNumberException e){
            System.out.println(e);
        }


    }
}
